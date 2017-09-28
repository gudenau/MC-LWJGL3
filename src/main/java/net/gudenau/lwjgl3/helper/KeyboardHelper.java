package net.gudenau.lwjgl3.helper;

import net.gudenau.lwjgl3.compatibility.input.Keyboard;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static org.lwjgl.glfw.GLFW.GLFW_MOD_SHIFT;

/**
 * Created by gudenau on 6/8/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings("unused")
public class KeyboardHelper{
    private static int[] numberMap = new int[]{
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')'
    };
    
    public static int getCharacter(int key, int modifiers){
        if(key > LWJGLChars.length){
            return '\u0000';
        }

        char character = LWJGLChars[key];
        
        if((modifiers & GLFW_MOD_SHIFT) != 0){
            if(Character.isAlphabetic(character)){
                return Character.toUpperCase(character);
            }else{
                if(character >= '0' && character <= '9'){
                    return numberMap[character - '0'];
                }
                
                switch(character){
                    case '`':
                        return '~';
                    case '-':
                        return '_';
                    case '=':
                        return '+';
                    case '\\':
                        return '|';
                    case '[':
                        return '{';
                    case ']':
                        return '}';
                    case ';':
                        return ':';
                    case '\'':
                        return '"';
                    case ',':
                        return '<';
                    case '.':
                        return '>';
                    case '/':
                        return '?';
                }
            }
        }
    
        return character;
    }

    public static int translateKeyFromGLFW(int key){
        if(key != -1){
            return key < GLFWtoLWJGL.length ? GLFWtoLWJGL[key] : Keyboard.CHAR_NONE;
        }else{
            return 0;
        }
    }

    public static int translateKeyToGLFW(int key){
        return key < LWJGLtoGLFW.length ? LWJGLtoGLFW[key] : -1;
    }

    private static int[] GLFWtoLWJGL;
    private static int[] LWJGLtoGLFW;
    private static char[] LWJGLChars;

    static{
        int maxIndex = 0;
        Map<Integer, String> glfwKeys = Arrays.stream(KeyboardHelper.class.getDeclaredFields()).filter(
            (field) -> {
                int modifiers = field.getModifiers();
                return Modifier.isFinal(modifiers) &&
                    Modifier.isPrivate(modifiers) &&
                    Modifier.isStatic(modifiers) &&
                    field.getName().startsWith("KEY_") &&
                    field.getType() == Integer.TYPE;
            }
        ).collect(Collectors.toMap(field -> {
            try{
                field.setAccessible(true);
                return field.getInt(null);
            }catch(IllegalAccessException e){
                throw new RuntimeException(e);
            }
        }, field -> field.getName().substring(4)));

        Map<String, Integer> lwjglKeys = Arrays.stream(Keyboard.class.getDeclaredFields()).filter(
            (field) -> {
                int modifiers = field.getModifiers();
                return Modifier.isFinal(modifiers) &&
                    Modifier.isPublic(modifiers) &&
                    Modifier.isStatic(modifiers) &&
                    field.getName().startsWith("KEY_") &&
                    field.getType() == Integer.TYPE;
            }
        ).collect(Collectors.toMap(
            field -> field.getName().substring(4),
            field ->{
                try{
                    field.setAccessible(true);
                    return field.getInt(null);
                }catch(IllegalAccessException e){
                    throw new RuntimeException(e);
                }
            }
        ));

        for(Integer key : glfwKeys.keySet()){
            if(key > maxIndex){
                maxIndex = key;
            }
        }

        GLFWtoLWJGL = new int[maxIndex + 1];
        LWJGLtoGLFW = new int[Keyboard.KEYBOARD_SIZE];
        Arrays.fill(LWJGLtoGLFW, -1);

        glfwKeys.forEach((glfwKey, glfwName) -> {
            Integer lwjglIndex = lwjglKeys.get(glfwName);
            if(lwjglIndex != null){
                GLFWtoLWJGL[glfwKey] = lwjglIndex;
                LWJGLtoGLFW[lwjglIndex] = glfwKey;
            }else{
                GLFWtoLWJGL[glfwKey] = Keyboard.CHAR_NONE;
            }
        });

        LWJGLChars = new char[Keyboard.KEYBOARD_SIZE];
        lwjglKeys.forEach((name, key) -> {
            if(name.length() == 1){
                LWJGLChars[key] = Character.toLowerCase(name.charAt(0));
            }else{
                LWJGLChars[key] = '\u0000';
            }
        });
        
        LWJGLChars[Keyboard.KEY_SPACE] = ' ';
        LWJGLChars[Keyboard.KEY_APOSTROPHE] = '\'';
        LWJGLChars[Keyboard.KEY_COMMA] = ',';
        LWJGLChars[Keyboard.KEY_MINUS] = '-';
        LWJGLChars[Keyboard.KEY_PERIOD] = '.';
        LWJGLChars[Keyboard.KEY_SLASH] = '/';
        LWJGLChars[Keyboard.KEY_SEMICOLON] = ';';
        LWJGLChars[Keyboard.KEY_EQUALS] = '=';
        LWJGLChars[Keyboard.KEY_LBRACKET] = '[';
        LWJGLChars[Keyboard.KEY_BACKSLASH] = '\\';
        LWJGLChars[Keyboard.KEY_RBRACKET] = ']';
        LWJGLChars[Keyboard.KEY_GRAVE] = '`';
        //LWJGLChars[Keyboard.KEY_TAB] = '\t';
    }

    private static final int KEY_SPACE = 32;
    private static final int KEY_APOSTROPHE = 39 /* ' */;
    private static final int KEY_COMMA = 44 /* , */;
    private static final int KEY_MINUS = 45 /* - */;
    private static final int KEY_PERIOD = 46 /* . */;
    private static final int KEY_SLASH = 47 /* / */;
    private static final int KEY_0 = 48;
    private static final int KEY_1 = 49;
    private static final int KEY_2 = 50;
    private static final int KEY_3 = 51;
    private static final int KEY_4 = 52;
    private static final int KEY_5 = 53;
    private static final int KEY_6 = 54;
    private static final int KEY_7 = 55;
    private static final int KEY_8 = 56;
    private static final int KEY_9 = 57;
    private static final int KEY_SEMICOLON = 59 /* ; */;
    private static final int KEY_EQUALS = 61 /* = */;
    private static final int KEY_A = 65;
    private static final int KEY_B = 66;
    private static final int KEY_C = 67;
    private static final int KEY_D = 68;
    private static final int KEY_E = 69;
    private static final int KEY_F = 70;
    private static final int KEY_G = 71;
    private static final int KEY_H = 72;
    private static final int KEY_I = 73;
    private static final int KEY_J = 74;
    private static final int KEY_K = 75;
    private static final int KEY_L = 76;
    private static final int KEY_M = 77;
    private static final int KEY_N = 78;
    private static final int KEY_O = 79;
    private static final int KEY_P = 80;
    private static final int KEY_Q = 81;
    private static final int KEY_R = 82;
    private static final int KEY_S = 83;
    private static final int KEY_T = 84;
    private static final int KEY_U = 85;
    private static final int KEY_V = 86;
    private static final int KEY_W = 87;
    private static final int KEY_X = 88;
    private static final int KEY_Y = 89;
    private static final int KEY_Z = 90;
    private static final int KEY_LBRACKET = 91 /* [ */;
    private static final int KEY_BACKSLASH = 92 /* \ */;
    private static final int KEY_RBRACKET = 93 /* ] */;
    private static final int KEY_GRAVE = 96 /* ` */;
    private static final int KEY_WORLD_1 = 161 /* non-US #1 */;
    private static final int KEY_WORLD_2 = 162 /* non-US #2 */;
    private static final int KEY_ESCAPE = 256;
    private static final int KEY_RETURN = 257;
    private static final int KEY_TAB = 258;
    private static final int KEY_BACK = 259;
    private static final int KEY_INSERT = 260;
    private static final int KEY_DELETE = 261;
    private static final int KEY_RIGHT = 262;
    private static final int KEY_LEFT = 263;
    private static final int KEY_DOWN = 264;
    private static final int KEY_UP = 265;
    private static final int KEY_PRIOR = 266;
    private static final int KEY_NEXT = 267;
    private static final int KEY_HOME = 268;
    private static final int KEY_END = 269;
    private static final int KEY_CAPITAL = 280;
    private static final int KEY_SCROLL = 281;
    private static final int KEY_NUMLOCK = 282;
    private static final int KEY_PRINT_SCREEN = 283;
    private static final int KEY_PAUSE = 284;
    private static final int KEY_F1 = 290;
    private static final int KEY_F2 = 291;
    private static final int KEY_F3 = 292;
    private static final int KEY_F4 = 293;
    private static final int KEY_F5 = 294;
    private static final int KEY_F6 = 295;
    private static final int KEY_F7 = 296;
    private static final int KEY_F8 = 297;
    private static final int KEY_F9 = 298;
    private static final int KEY_F10 = 299;
    private static final int KEY_F11 = 300;
    private static final int KEY_F12 = 301;
    private static final int KEY_F13 = 302;
    private static final int KEY_F14 = 303;
    private static final int KEY_F15 = 304;
    private static final int KEY_F16 = 305;
    private static final int KEY_F17 = 306;
    private static final int KEY_F18 = 307;
    private static final int KEY_F19 = 308;
    private static final int KEY_F20 = 309;
    private static final int KEY_F21 = 310;
    private static final int KEY_F22 = 311;
    private static final int KEY_F23 = 312;
    private static final int KEY_F24 = 313;
    private static final int KEY_F25 = 314;
    private static final int KEY_NUMPAD0 = 320;
    private static final int KEY_NUMPAD1 = 321;
    private static final int KEY_NUMPAD2 = 322;
    private static final int KEY_NUMPAD3 = 323;
    private static final int KEY_NUMPAD4 = 324;
    private static final int KEY_NUMPAD5 = 325;
    private static final int KEY_NUMPAD6 = 326;
    private static final int KEY_NUMPAD7 = 327;
    private static final int KEY_NUMPAD8 = 328;
    private static final int KEY_NUMPAD9 = 329;
    private static final int KEY_DECIMAL = 330;
    private static final int KEY_DIVIDE = 331;
    private static final int KEY_MULTIPLY = 332;
    private static final int KEY_SUBTRACT = 333;
    private static final int KEY_ADD = 334;
    private static final int KEY_NUMPADENTER = 335;
    private static final int KEY_NUMPADEQUALS = 336;
    private static final int KEY_LSHIFT = 340;
    private static final int KEY_LCONTROL = 341;
    private static final int KEY_LMENU = 342;
    private static final int KEY_LMETA = 343;
    private static final int KEY_RSHIFT = 344;
    private static final int KEY_RCONTROL = 345;
    private static final int KEY_RMENU = 346;
    private static final int KEY_RMETA = 347;
    private static final int KEY_MENU = 348;
}
