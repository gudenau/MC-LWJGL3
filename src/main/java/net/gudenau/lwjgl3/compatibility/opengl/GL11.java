package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.NotImplementedException;
import net.gudenau.lwjgl3.helper.FieldHelper;

import java.nio.*;

//import static org.lwjgl.system.MemoryUtil.memAddress;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "WeakerAccess", "SpellCheckingInspection"})
public class GL11{
    public static final int GL_ACCUM = 0x100;
    public static final int GL_LOAD = 0x101;
    public static final int GL_RETURN = 0x102;
    public static final int GL_MULT = 0x103;
    public static final int GL_ADD = 0x104;
    public static final int GL_NEVER = 0x200;
    public static final int GL_LESS = 0x201;
    public static final int GL_EQUAL = 0x202;
    public static final int GL_LEQUAL = 0x203;
    public static final int GL_GREATER = 0x204;
    public static final int GL_NOTEQUAL = 0x205;
    public static final int GL_GEQUAL = 0x206;
    public static final int GL_ALWAYS = 0x207;
    public static final int GL_CURRENT_BIT = 0x1;
    public static final int GL_POINT_BIT = 0x2;
    public static final int GL_LINE_BIT = 0x4;
    public static final int GL_POLYGON_BIT = 0x8;
    public static final int GL_POLYGON_STIPPLE_BIT = 0x10;
    public static final int GL_PIXEL_MODE_BIT = 0x20;
    public static final int GL_LIGHTING_BIT = 0x40;
    public static final int GL_FOG_BIT = 0x80;
    public static final int GL_DEPTH_BUFFER_BIT = 0x100;
    public static final int GL_ACCUM_BUFFER_BIT = 0x200;
    public static final int GL_STENCIL_BUFFER_BIT = 0x400;
    public static final int GL_VIEWPORT_BIT = 0x800;
    public static final int GL_TRANSFORM_BIT = 0x1000;
    public static final int GL_ENABLE_BIT = 0x2000;
    public static final int GL_COLOR_BUFFER_BIT = 0x4000;
    public static final int GL_HINT_BIT = 0x8000;
    public static final int GL_EVAL_BIT = 0x10000;
    public static final int GL_LIST_BIT = 0x20000;
    public static final int GL_TEXTURE_BIT = 0x40000;
    public static final int GL_SCISSOR_BIT = 0x80000;
    public static final int GL_ALL_ATTRIB_BITS = 0xFFFFF;
    public static final int GL_POINTS = 0x0;
    public static final int GL_LINES = 0x1;
    public static final int GL_LINE_LOOP = 0x2;
    public static final int GL_LINE_STRIP = 0x3;
    public static final int GL_TRIANGLES = 0x4;
    public static final int GL_TRIANGLE_STRIP = 0x5;
    public static final int GL_TRIANGLE_FAN = 0x6;
    public static final int GL_QUADS = 0x7;
    public static final int GL_QUAD_STRIP = 0x8;
    public static final int GL_POLYGON = 0x9;
    public static final int GL_ZERO = 0x0;
    public static final int GL_ONE = 0x1;
    public static final int GL_SRC_COLOR = 0x300;
    public static final int GL_ONE_MINUS_SRC_COLOR = 0x301;
    public static final int GL_SRC_ALPHA = 0x302;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 0x303;
    public static final int GL_DST_ALPHA = 0x304;
    public static final int GL_ONE_MINUS_DST_ALPHA = 0x305;
    public static final int GL_DST_COLOR = 0x306;
    public static final int GL_ONE_MINUS_DST_COLOR = 0x307;
    public static final int GL_SRC_ALPHA_SATURATE = 0x308;
    public static final int GL_CONSTANT_COLOR = 0x8001;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
    public static final int GL_CONSTANT_ALPHA = 0x8003;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    public static final int GL_TRUE = 0x1;
    public static final int GL_FALSE = 0x0;
    public static final int GL_CLIP_PLANE0 = 0x3000;
    public static final int GL_CLIP_PLANE1 = 0x3001;
    public static final int GL_CLIP_PLANE2 = 0x3002;
    public static final int GL_CLIP_PLANE3 = 0x3003;
    public static final int GL_CLIP_PLANE4 = 0x3004;
    public static final int GL_CLIP_PLANE5 = 0x3005;
    public static final int GL_BYTE = 0x1400;
    public static final int GL_UNSIGNED_BYTE = 0x1401;
    public static final int GL_SHORT = 0x1402;
    public static final int GL_UNSIGNED_SHORT = 0x1403;
    public static final int GL_INT = 0x1404;
    public static final int GL_UNSIGNED_INT = 0x1405;
    public static final int GL_FLOAT = 0x1406;
    public static final int GL_2_BYTES = 0x1407;
    public static final int GL_3_BYTES = 0x1408;
    public static final int GL_4_BYTES = 0x1409;
    public static final int GL_DOUBLE = 0x140A;
    public static final int GL_NONE = 0x0;
    public static final int GL_FRONT_LEFT = 0x400;
    public static final int GL_FRONT_RIGHT = 0x401;
    public static final int GL_BACK_LEFT = 0x402;
    public static final int GL_BACK_RIGHT = 0x403;
    public static final int GL_FRONT = 0x404;
    public static final int GL_BACK = 0x405;
    public static final int GL_LEFT = 0x406;
    public static final int GL_RIGHT = 0x407;
    public static final int GL_FRONT_AND_BACK = 0x408;
    public static final int GL_AUX0 = 0x409;
    public static final int GL_AUX1 = 0x40A;
    public static final int GL_AUX2 = 0x40B;
    public static final int GL_AUX3 = 0x40C;
    public static final int GL_NO_ERROR = 0x0;
    public static final int GL_INVALID_ENUM = 0x500;
    public static final int GL_INVALID_VALUE = 0x501;
    public static final int GL_INVALID_OPERATION = 0x502;
    public static final int GL_STACK_OVERFLOW = 0x503;
    public static final int GL_STACK_UNDERFLOW = 0x504;
    public static final int GL_OUT_OF_MEMORY = 0x505;
    public static final int GL_2D = 0x600;
    public static final int GL_3D = 0x601;
    public static final int GL_3D_COLOR = 0x602;
    public static final int GL_3D_COLOR_TEXTURE = 0x603;
    public static final int GL_4D_COLOR_TEXTURE = 0x604;
    public static final int GL_PASS_THROUGH_TOKEN = 0x700;
    public static final int GL_POINT_TOKEN = 0x701;
    public static final int GL_LINE_TOKEN = 0x702;
    public static final int GL_POLYGON_TOKEN = 0x703;
    public static final int GL_BITMAP_TOKEN = 0x704;
    public static final int GL_DRAW_PIXEL_TOKEN = 0x705;
    public static final int GL_COPY_PIXEL_TOKEN = 0x706;
    public static final int GL_LINE_RESET_TOKEN = 0x707;
    public static final int GL_EXP = 0x800;
    public static final int GL_EXP2 = 0x801;
    public static final int GL_CW = 0x900;
    public static final int GL_CCW = 0x901;
    public static final int GL_COEFF = 0xA00;
    public static final int GL_ORDER = 0xA01;
    public static final int GL_DOMAIN = 0xA02;
    public static final int GL_CURRENT_COLOR = 0xB00;
    public static final int GL_CURRENT_INDEX = 0xB01;
    public static final int GL_CURRENT_NORMAL = 0xB02;
    public static final int GL_CURRENT_TEXTURE_COORDS = 0xB03;
    public static final int GL_CURRENT_RASTER_COLOR = 0xB04;
    public static final int GL_CURRENT_RASTER_INDEX = 0xB05;
    public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 0xB06;
    public static final int GL_CURRENT_RASTER_POSITION = 0xB07;
    public static final int GL_CURRENT_RASTER_POSITION_VALID = 0xB08;
    public static final int GL_CURRENT_RASTER_DISTANCE = 0xB09;
    public static final int GL_POINT_SMOOTH = 0xB10;
    public static final int GL_POINT_SIZE = 0xB11;
    public static final int GL_POINT_SIZE_RANGE = 0xB12;
    public static final int GL_POINT_SIZE_GRANULARITY = 0xB13;
    public static final int GL_LINE_SMOOTH = 0xB20;
    public static final int GL_LINE_WIDTH = 0xB21;
    public static final int GL_LINE_WIDTH_RANGE = 0xB22;
    public static final int GL_LINE_WIDTH_GRANULARITY = 0xB23;
    public static final int GL_LINE_STIPPLE = 0xB24;
    public static final int GL_LINE_STIPPLE_PATTERN = 0xB25;
    public static final int GL_LINE_STIPPLE_REPEAT = 0xB26;
    public static final int GL_LIST_MODE = 0xB30;
    public static final int GL_MAX_LIST_NESTING = 0xB31;
    public static final int GL_LIST_BASE = 0xB32;
    public static final int GL_LIST_INDEX = 0xB33;
    public static final int GL_POLYGON_MODE = 0xB40;
    public static final int GL_POLYGON_SMOOTH = 0xB41;
    public static final int GL_POLYGON_STIPPLE = 0xB42;
    public static final int GL_EDGE_FLAG = 0xB43;
    public static final int GL_CULL_FACE = 0xB44;
    public static final int GL_CULL_FACE_MODE = 0xB45;
    public static final int GL_FRONT_FACE = 0xB46;
    public static final int GL_LIGHTING = 0xB50;
    public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 0xB51;
    public static final int GL_LIGHT_MODEL_TWO_SIDE = 0xB52;
    public static final int GL_LIGHT_MODEL_AMBIENT = 0xB53;
    public static final int GL_SHADE_MODEL = 0xB54;
    public static final int GL_COLOR_MATERIAL_FACE = 0xB55;
    public static final int GL_COLOR_MATERIAL_PARAMETER = 0xB56;
    public static final int GL_COLOR_MATERIAL = 0xB57;
    public static final int GL_FOG = 0xB60;
    public static final int GL_FOG_INDEX = 0xB61;
    public static final int GL_FOG_DENSITY = 0xB62;
    public static final int GL_FOG_START = 0xB63;
    public static final int GL_FOG_END = 0xB64;
    public static final int GL_FOG_MODE = 0xB65;
    public static final int GL_FOG_COLOR = 0xB66;
    public static final int GL_DEPTH_RANGE = 0xB70;
    public static final int GL_DEPTH_TEST = 0xB71;
    public static final int GL_DEPTH_WRITEMASK = 0xB72;
    public static final int GL_DEPTH_CLEAR_VALUE = 0xB73;
    public static final int GL_DEPTH_FUNC = 0xB74;
    public static final int GL_ACCUM_CLEAR_VALUE = 0xB80;
    public static final int GL_STENCIL_TEST = 0xB90;
    public static final int GL_STENCIL_CLEAR_VALUE = 0xB91;
    public static final int GL_STENCIL_FUNC = 0xB92;
    public static final int GL_STENCIL_VALUE_MASK = 0xB93;
    public static final int GL_STENCIL_FAIL = 0xB94;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0xB95;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 0xB96;
    public static final int GL_STENCIL_REF = 0xB97;
    public static final int GL_STENCIL_WRITEMASK = 0xB98;
    public static final int GL_MATRIX_MODE = 0xBA0;
    public static final int GL_NORMALIZE = 0xBA1;
    public static final int GL_VIEWPORT = 0xBA2;
    public static final int GL_MODELVIEW_STACK_DEPTH = 0xBA3;
    public static final int GL_PROJECTION_STACK_DEPTH = 0xBA4;
    public static final int GL_TEXTURE_STACK_DEPTH = 0xBA5;
    public static final int GL_MODELVIEW_MATRIX = 0xBA6;
    public static final int GL_PROJECTION_MATRIX = 0xBA7;
    public static final int GL_TEXTURE_MATRIX = 0xBA8;
    public static final int GL_ATTRIB_STACK_DEPTH = 0xBB0;
    public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 0xBB1;
    public static final int GL_ALPHA_TEST = 0xBC0;
    public static final int GL_ALPHA_TEST_FUNC = 0xBC1;
    public static final int GL_ALPHA_TEST_REF = 0xBC2;
    public static final int GL_DITHER = 0xBD0;
    public static final int GL_BLEND_DST = 0xBE0;
    public static final int GL_BLEND_SRC = 0xBE1;
    public static final int GL_BLEND = 0xBE2;
    public static final int GL_LOGIC_OP_MODE = 0xBF0;
    public static final int GL_INDEX_LOGIC_OP = 0xBF1;
    public static final int GL_COLOR_LOGIC_OP = 0xBF2;
    public static final int GL_AUX_BUFFERS = 0xC00;
    public static final int GL_DRAW_BUFFER = 0xC01;
    public static final int GL_READ_BUFFER = 0xC02;
    public static final int GL_SCISSOR_BOX = 0xC10;
    public static final int GL_SCISSOR_TEST = 0xC11;
    public static final int GL_INDEX_CLEAR_VALUE = 0xC20;
    public static final int GL_INDEX_WRITEMASK = 0xC21;
    public static final int GL_COLOR_CLEAR_VALUE = 0xC22;
    public static final int GL_COLOR_WRITEMASK = 0xC23;
    public static final int GL_INDEX_MODE = 0xC30;
    public static final int GL_RGBA_MODE = 0xC31;
    public static final int GL_DOUBLEBUFFER = 0xC32;
    public static final int GL_STEREO = 0xC33;
    public static final int GL_RENDER_MODE = 0xC40;
    public static final int GL_PERSPECTIVE_CORRECTION_HINT = 0xC50;
    public static final int GL_POINT_SMOOTH_HINT = 0xC51;
    public static final int GL_LINE_SMOOTH_HINT = 0xC52;
    public static final int GL_POLYGON_SMOOTH_HINT = 0xC53;
    public static final int GL_FOG_HINT = 0xC54;
    public static final int GL_TEXTURE_GEN_S = 0xC60;
    public static final int GL_TEXTURE_GEN_T = 0xC61;
    public static final int GL_TEXTURE_GEN_R = 0xC62;
    public static final int GL_TEXTURE_GEN_Q = 0xC63;
    public static final int GL_PIXEL_MAP_I_TO_I = 0xC70;
    public static final int GL_PIXEL_MAP_S_TO_S = 0xC71;
    public static final int GL_PIXEL_MAP_I_TO_R = 0xC72;
    public static final int GL_PIXEL_MAP_I_TO_G = 0xC73;
    public static final int GL_PIXEL_MAP_I_TO_B = 0xC74;
    public static final int GL_PIXEL_MAP_I_TO_A = 0xC75;
    public static final int GL_PIXEL_MAP_R_TO_R = 0xC76;
    public static final int GL_PIXEL_MAP_G_TO_G = 0xC77;
    public static final int GL_PIXEL_MAP_B_TO_B = 0xC78;
    public static final int GL_PIXEL_MAP_A_TO_A = 0xC79;
    public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 0xCB0;
    public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 0xCB1;
    public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 0xCB2;
    public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 0xCB3;
    public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 0xCB4;
    public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 0xCB5;
    public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 0xCB6;
    public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 0xCB7;
    public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 0xCB8;
    public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 0xCB9;
    public static final int GL_UNPACK_SWAP_BYTES = 0xCF0;
    public static final int GL_UNPACK_LSB_FIRST = 0xCF1;
    public static final int GL_UNPACK_ROW_LENGTH = 0xCF2;
    public static final int GL_UNPACK_SKIP_ROWS = 0xCF3;
    public static final int GL_UNPACK_SKIP_PIXELS = 0xCF4;
    public static final int GL_UNPACK_ALIGNMENT = 0xCF5;
    public static final int GL_PACK_SWAP_BYTES = 0xD00;
    public static final int GL_PACK_LSB_FIRST = 0xD01;
    public static final int GL_PACK_ROW_LENGTH = 0xD02;
    public static final int GL_PACK_SKIP_ROWS = 0xD03;
    public static final int GL_PACK_SKIP_PIXELS = 0xD04;
    public static final int GL_PACK_ALIGNMENT = 0xD05;
    public static final int GL_MAP_COLOR = 0xD10;
    public static final int GL_MAP_STENCIL = 0xD11;
    public static final int GL_INDEX_SHIFT = 0xD12;
    public static final int GL_INDEX_OFFSET = 0xD13;
    public static final int GL_RED_SCALE = 0xD14;
    public static final int GL_RED_BIAS = 0xD15;
    public static final int GL_ZOOM_X = 0xD16;
    public static final int GL_ZOOM_Y = 0xD17;
    public static final int GL_GREEN_SCALE = 0xD18;
    public static final int GL_GREEN_BIAS = 0xD19;
    public static final int GL_BLUE_SCALE = 0xD1A;
    public static final int GL_BLUE_BIAS = 0xD1B;
    public static final int GL_ALPHA_SCALE = 0xD1C;
    public static final int GL_ALPHA_BIAS = 0xD1D;
    public static final int GL_DEPTH_SCALE = 0xD1E;
    public static final int GL_DEPTH_BIAS = 0xD1F;
    public static final int GL_MAX_EVAL_ORDER = 0xD30;
    public static final int GL_MAX_LIGHTS = 0xD31;
    public static final int GL_MAX_CLIP_PLANES = 0xD32;
    public static final int GL_MAX_TEXTURE_SIZE = 0xD33;
    public static final int GL_MAX_PIXEL_MAP_TABLE = 0xD34;
    public static final int GL_MAX_ATTRIB_STACK_DEPTH = 0xD35;
    public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 0xD36;
    public static final int GL_MAX_NAME_STACK_DEPTH = 0xD37;
    public static final int GL_MAX_PROJECTION_STACK_DEPTH = 0xD38;
    public static final int GL_MAX_TEXTURE_STACK_DEPTH = 0xD39;
    public static final int GL_MAX_VIEWPORT_DIMS = 0xD3A;
    public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0xD3B;
    public static final int GL_SUBPIXEL_BITS = 0xD50;
    public static final int GL_INDEX_BITS = 0xD51;
    public static final int GL_RED_BITS = 0xD52;
    public static final int GL_GREEN_BITS = 0xD53;
    public static final int GL_BLUE_BITS = 0xD54;
    public static final int GL_ALPHA_BITS = 0xD55;
    public static final int GL_DEPTH_BITS = 0xD56;
    public static final int GL_STENCIL_BITS = 0xD57;
    public static final int GL_ACCUM_RED_BITS = 0xD58;
    public static final int GL_ACCUM_GREEN_BITS = 0xD59;
    public static final int GL_ACCUM_BLUE_BITS = 0xD5A;
    public static final int GL_ACCUM_ALPHA_BITS = 0xD5B;
    public static final int GL_NAME_STACK_DEPTH = 0xD70;
    public static final int GL_AUTO_NORMAL = 0xD80;
    public static final int GL_MAP1_COLOR_4 = 0xD90;
    public static final int GL_MAP1_INDEX = 0xD91;
    public static final int GL_MAP1_NORMAL = 0xD92;
    public static final int GL_MAP1_TEXTURE_COORD_1 = 0xD93;
    public static final int GL_MAP1_TEXTURE_COORD_2 = 0xD94;
    public static final int GL_MAP1_TEXTURE_COORD_3 = 0xD95;
    public static final int GL_MAP1_TEXTURE_COORD_4 = 0xD96;
    public static final int GL_MAP1_VERTEX_3 = 0xD97;
    public static final int GL_MAP1_VERTEX_4 = 0xD98;
    public static final int GL_MAP2_COLOR_4 = 0xDB0;
    public static final int GL_MAP2_INDEX = 0xDB1;
    public static final int GL_MAP2_NORMAL = 0xDB2;
    public static final int GL_MAP2_TEXTURE_COORD_1 = 0xDB3;
    public static final int GL_MAP2_TEXTURE_COORD_2 = 0xDB4;
    public static final int GL_MAP2_TEXTURE_COORD_3 = 0xDB5;
    public static final int GL_MAP2_TEXTURE_COORD_4 = 0xDB6;
    public static final int GL_MAP2_VERTEX_3 = 0xDB7;
    public static final int GL_MAP2_VERTEX_4 = 0xDB8;
    public static final int GL_MAP1_GRID_DOMAIN = 0xDD0;
    public static final int GL_MAP1_GRID_SEGMENTS = 0xDD1;
    public static final int GL_MAP2_GRID_DOMAIN = 0xDD2;
    public static final int GL_MAP2_GRID_SEGMENTS = 0xDD3;
    public static final int GL_TEXTURE_1D = 0xDE0;
    public static final int GL_TEXTURE_2D = 0xDE1;
    public static final int GL_FEEDBACK_BUFFER_POINTER = 0xDF0;
    public static final int GL_FEEDBACK_BUFFER_SIZE = 0xDF1;
    public static final int GL_FEEDBACK_BUFFER_TYPE = 0xDF2;
    public static final int GL_SELECTION_BUFFER_POINTER = 0xDF3;
    public static final int GL_SELECTION_BUFFER_SIZE = 0xDF4;
    public static final int GL_TEXTURE_WIDTH = 0x1000;
    public static final int GL_TEXTURE_HEIGHT = 0x1001;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
    public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
    public static final int GL_TEXTURE_BORDER = 0x1005;
    public static final int GL_DONT_CARE = 0x1100;
    public static final int GL_FASTEST = 0x1101;
    public static final int GL_NICEST = 0x1102;
    public static final int GL_LIGHT0 = 0x4000;
    public static final int GL_LIGHT1 = 0x4001;
    public static final int GL_LIGHT2 = 0x4002;
    public static final int GL_LIGHT3 = 0x4003;
    public static final int GL_LIGHT4 = 0x4004;
    public static final int GL_LIGHT5 = 0x4005;
    public static final int GL_LIGHT6 = 0x4006;
    public static final int GL_LIGHT7 = 0x4007;
    public static final int GL_AMBIENT = 0x1200;
    public static final int GL_DIFFUSE = 0x1201;
    public static final int GL_SPECULAR = 0x1202;
    public static final int GL_POSITION = 0x1203;
    public static final int GL_SPOT_DIRECTION = 0x1204;
    public static final int GL_SPOT_EXPONENT = 0x1205;
    public static final int GL_SPOT_CUTOFF = 0x1206;
    public static final int GL_CONSTANT_ATTENUATION = 0x1207;
    public static final int GL_LINEAR_ATTENUATION = 0x1208;
    public static final int GL_QUADRATIC_ATTENUATION = 0x1209;
    public static final int GL_COMPILE = 0x1300;
    public static final int GL_COMPILE_AND_EXECUTE = 0x1301;
    public static final int GL_CLEAR = 0x1500;
    public static final int GL_AND = 0x1501;
    public static final int GL_AND_REVERSE = 0x1502;
    public static final int GL_COPY = 0x1503;
    public static final int GL_AND_INVERTED = 0x1504;
    public static final int GL_NOOP = 0x1505;
    public static final int GL_XOR = 0x1506;
    public static final int GL_OR = 0x1507;
    public static final int GL_NOR = 0x1508;
    public static final int GL_EQUIV = 0x1509;
    public static final int GL_INVERT = 0x150A;
    public static final int GL_OR_REVERSE = 0x150B;
    public static final int GL_COPY_INVERTED = 0x150C;
    public static final int GL_OR_INVERTED = 0x150D;
    public static final int GL_NAND = 0x150E;
    public static final int GL_SET = 0x150F;
    public static final int GL_EMISSION = 0x1600;
    public static final int GL_SHININESS = 0x1601;
    public static final int GL_AMBIENT_AND_DIFFUSE = 0x1602;
    public static final int GL_COLOR_INDEXES = 0x1603;
    public static final int GL_MODELVIEW = 0x1700;
    public static final int GL_PROJECTION = 0x1701;
    public static final int GL_TEXTURE = 0x1702;
    public static final int GL_COLOR = 0x1800;
    public static final int GL_DEPTH = 0x1801;
    public static final int GL_STENCIL = 0x1802;
    public static final int GL_COLOR_INDEX = 0x1900;
    public static final int GL_STENCIL_INDEX = 0x1901;
    public static final int GL_DEPTH_COMPONENT = 0x1902;
    public static final int GL_RED = 0x1903;
    public static final int GL_GREEN = 0x1904;
    public static final int GL_BLUE = 0x1905;
    public static final int GL_ALPHA = 0x1906;
    public static final int GL_RGB = 0x1907;
    public static final int GL_RGBA = 0x1908;
    public static final int GL_LUMINANCE = 0x1909;
    public static final int GL_LUMINANCE_ALPHA = 0x190A;
    public static final int GL_BITMAP = 0x1A00;
    public static final int GL_POINT = 0x1B00;
    public static final int GL_LINE = 0x1B01;
    public static final int GL_FILL = 0x1B02;
    public static final int GL_RENDER = 0x1C00;
    public static final int GL_FEEDBACK = 0x1C01;
    public static final int GL_SELECT = 0x1C02;
    public static final int GL_FLAT = 0x1D00;
    public static final int GL_SMOOTH = 0x1D01;
    public static final int GL_KEEP = 0x1E00;
    public static final int GL_REPLACE = 0x1E01;
    public static final int GL_INCR = 0x1E02;
    public static final int GL_DECR = 0x1E03;
    public static final int GL_VENDOR = 0x1F00;
    public static final int GL_RENDERER = 0x1F01;
    public static final int GL_VERSION = 0x1F02;
    public static final int GL_EXTENSIONS = 0x1F03;
    public static final int GL_S = 0x2000;
    public static final int GL_T = 0x2001;
    public static final int GL_R = 0x2002;
    public static final int GL_Q = 0x2003;
    public static final int GL_MODULATE = 0x2100;
    public static final int GL_DECAL = 0x2101;
    public static final int GL_TEXTURE_ENV_MODE = 0x2200;
    public static final int GL_TEXTURE_ENV_COLOR = 0x2201;
    public static final int GL_TEXTURE_ENV = 0x2300;
    public static final int GL_EYE_LINEAR = 0x2400;
    public static final int GL_OBJECT_LINEAR = 0x2401;
    public static final int GL_SPHERE_MAP = 0x2402;
    public static final int GL_TEXTURE_GEN_MODE = 0x2500;
    public static final int GL_OBJECT_PLANE = 0x2501;
    public static final int GL_EYE_PLANE = 0x2502;
    public static final int GL_NEAREST = 0x2600;
    public static final int GL_LINEAR = 0x2601;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
    public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
    public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
    public static final int GL_TEXTURE_WRAP_S = 0x2802;
    public static final int GL_TEXTURE_WRAP_T = 0x2803;
    public static final int GL_CLAMP = 0x2900;
    public static final int GL_REPEAT = 0x2901;
    public static final int GL_CLIENT_PIXEL_STORE_BIT = 0x1;
    public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 0x2;
    public static final int GL_ALL_CLIENT_ATTRIB_BITS = 0xFFFFFFFF;
    public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
    public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
    public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
    public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
    public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
    public static final int GL_ALPHA4 = 0x803B;
    public static final int GL_ALPHA8 = 0x803C;
    public static final int GL_ALPHA12 = 0x803D;
    public static final int GL_ALPHA16 = 0x803E;
    public static final int GL_LUMINANCE4 = 0x803F;
    public static final int GL_LUMINANCE8 = 0x8040;
    public static final int GL_LUMINANCE12 = 0x8041;
    public static final int GL_LUMINANCE16 = 0x8042;
    public static final int GL_LUMINANCE4_ALPHA4 = 0x8043;
    public static final int GL_LUMINANCE6_ALPHA2 = 0x8044;
    public static final int GL_LUMINANCE8_ALPHA8 = 0x8045;
    public static final int GL_LUMINANCE12_ALPHA4 = 0x8046;
    public static final int GL_LUMINANCE12_ALPHA12 = 0x8047;
    public static final int GL_LUMINANCE16_ALPHA16 = 0x8048;
    public static final int GL_INTENSITY = 0x8049;
    public static final int GL_INTENSITY4 = 0x804A;
    public static final int GL_INTENSITY8 = 0x804B;
    public static final int GL_INTENSITY12 = 0x804C;
    public static final int GL_INTENSITY16 = 0x804D;
    public static final int GL_R3_G3_B2 = 0x2A10;
    public static final int GL_RGB4 = 0x804F;
    public static final int GL_RGB5 = 0x8050;
    public static final int GL_RGB8 = 0x8051;
    public static final int GL_RGB10 = 0x8052;
    public static final int GL_RGB12 = 0x8053;
    public static final int GL_RGB16 = 0x8054;
    public static final int GL_RGBA2 = 0x8055;
    public static final int GL_RGBA4 = 0x8056;
    public static final int GL_RGB5_A1 = 0x8057;
    public static final int GL_RGBA8 = 0x8058;
    public static final int GL_RGB10_A2 = 0x8059;
    public static final int GL_RGBA12 = 0x805A;
    public static final int GL_RGBA16 = 0x805B;
    public static final int GL_TEXTURE_RED_SIZE = 0x805C;
    public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
    public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
    public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
    public static final int GL_TEXTURE_LUMINANCE_SIZE = 0x8060;
    public static final int GL_TEXTURE_INTENSITY_SIZE = 0x8061;
    public static final int GL_PROXY_TEXTURE_1D = 0x8063;
    public static final int GL_PROXY_TEXTURE_2D = 0x8064;
    public static final int GL_TEXTURE_PRIORITY = 0x8066;
    public static final int GL_TEXTURE_RESIDENT = 0x8067;
    public static final int GL_TEXTURE_BINDING_1D = 0x8068;
    public static final int GL_TEXTURE_BINDING_2D = 0x8069;
    public static final int GL_VERTEX_ARRAY = 0x8074;
    public static final int GL_NORMAL_ARRAY = 0x8075;
    public static final int GL_COLOR_ARRAY = 0x8076;
    public static final int GL_INDEX_ARRAY = 0x8077;
    public static final int GL_TEXTURE_COORD_ARRAY = 0x8078;
    public static final int GL_EDGE_FLAG_ARRAY = 0x8079;
    public static final int GL_VERTEX_ARRAY_SIZE = 0x807A;
    public static final int GL_VERTEX_ARRAY_TYPE = 0x807B;
    public static final int GL_VERTEX_ARRAY_STRIDE = 0x807C;
    public static final int GL_NORMAL_ARRAY_TYPE = 0x807E;
    public static final int GL_NORMAL_ARRAY_STRIDE = 0x807F;
    public static final int GL_COLOR_ARRAY_SIZE = 0x8081;
    public static final int GL_COLOR_ARRAY_TYPE = 0x8082;
    public static final int GL_COLOR_ARRAY_STRIDE = 0x8083;
    public static final int GL_INDEX_ARRAY_TYPE = 0x8085;
    public static final int GL_INDEX_ARRAY_STRIDE = 0x8086;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE = 0x8088;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE = 0x8089;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = 0x808A;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE = 0x808C;
    public static final int GL_VERTEX_ARRAY_POINTER = 0x808E;
    public static final int GL_NORMAL_ARRAY_POINTER = 0x808F;
    public static final int GL_COLOR_ARRAY_POINTER = 0x8090;
    public static final int GL_INDEX_ARRAY_POINTER = 0x8091;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 0x8092;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER = 0x8093;
    public static final int GL_V2F = 0x2A20;
    public static final int GL_V3F = 0x2A21;
    public static final int GL_C4UB_V2F = 0x2A22;
    public static final int GL_C4UB_V3F = 0x2A23;
    public static final int GL_C3F_V3F = 0x2A24;
    public static final int GL_N3F_V3F = 0x2A25;
    public static final int GL_C4F_N3F_V3F = 0x2A26;
    public static final int GL_T2F_V3F = 0x2A27;
    public static final int GL_T4F_V4F = 0x2A28;
    public static final int GL_T2F_C4UB_V3F = 0x2A29;
    public static final int GL_T2F_C3F_V3F = 0x2A2A;
    public static final int GL_T2F_N3F_V3F = 0x2A2B;
    public static final int GL_T2F_C4F_N3F_V3F = 0x2A2C;
    public static final int GL_T4F_C4F_N3F_V4F = 0x2A2D;
    public static final int GL_LOGIC_OP = 0xBF1;
    public static final int GL_TEXTURE_COMPONENTS = 0x1003;

    static {
        FieldHelper.copyStaticFields(org.lwjgl.opengl.GL11.class, GL11.class);
    }

    private GL11(){}

    public static void glAccum(int op, float value){
        org.lwjgl.opengl.GL11.glAccum(op, value);
    }

    public static void glAlphaFunc(int func, float ref){
        org.lwjgl.opengl.GL11.glAlphaFunc(func, ref);
    }

    public static boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences){
        return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
    }

    public static void glArrayElement(int i){
        org.lwjgl.opengl.GL11.glArrayElement(i);
    }

    public static void glBegin(int mode){
        org.lwjgl.opengl.GL11.glBegin(mode);
    }

    public static void glBindTexture(int target, int texture){
        org.lwjgl.opengl.GL11.glBindTexture(target, texture);
    }

    public static void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, ByteBuffer bitmap){
        org.lwjgl.opengl.GL11.glBitmap(width, height, xorig, yorig, xmove, ymove, bitmap);
    }

    public static void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, long bitmap_buffer_offset){
        org.lwjgl.opengl.GL11.glBitmap(width, height, xorig, yorig, xmove, ymove, bitmap_buffer_offset);
    }

    public static void glBlendFunc(int sfactor, int dfactor){
        org.lwjgl.opengl.GL11.glBlendFunc(sfactor, dfactor);
    }

    public static void glCallList(int list){
        org.lwjgl.opengl.GL11.glCallList(list);
    }

    public static void glCallLists(ByteBuffer lists){
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    public static void glCallLists(IntBuffer lists){
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    public static void glCallLists(ShortBuffer lists){
        org.lwjgl.opengl.GL11.glCallLists(lists);
    }

    public static void glClear(int mask){
        org.lwjgl.opengl.GL11.glClear(mask);
    }

    public static void glClearAccum(float red, float green, float blue, float alpha){
        org.lwjgl.opengl.GL11.glClearAccum(red, green, blue, alpha);
    }

    public static void glClearColor(float red, float green, float blue, float alpha){
        org.lwjgl.opengl.GL11.glClearColor(red, green, blue, alpha);
    }

    public static void glClearDepth(double depth){
        org.lwjgl.opengl.GL11.glClearDepth(depth);
    }

    public static void glClearStencil(int s){
        org.lwjgl.opengl.GL11.glClearStencil(s);
    }

    public static void glClipPlane(int plane, DoubleBuffer equation){
        org.lwjgl.opengl.GL11.glClipPlane(plane, equation);
    }

    public static void glColor3b(byte red, byte green, byte blue){
        org.lwjgl.opengl.GL11.glColor3b(red, green, blue);
    }

    public static void glColor3d(double red, double green, double blue){
        org.lwjgl.opengl.GL11.glColor3d(red, green, blue);
    }

    public static void glColor3f(float red, float green, float blue){
        org.lwjgl.opengl.GL11.glColor3f(red, green, blue);
    }

    public static void glColor3ub(byte red, byte green, byte blue){
        org.lwjgl.opengl.GL11.glColor3ub(red, green, blue);
    }

    public static void glColor4b(byte red, byte green, byte blue, byte alpha){
        org.lwjgl.opengl.GL11.glColor4b(red, green, blue, alpha);
    }

    public static void glColor4d(double red, double green, double blue, double alpha){
        org.lwjgl.opengl.GL11.glColor4d(red, green, blue, alpha);
    }

    public static void glColor4f(float red, float green, float blue, float alpha){
        org.lwjgl.opengl.GL11.glColor4f(red, green, blue, alpha);
    }

    public static void glColor4ub(byte red, byte green, byte blue, byte alpha){
        org.lwjgl.opengl.GL11.glColor4ub(red, green, blue, alpha);
    }

    public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha){
        org.lwjgl.opengl.GL11.glColorMask(red, green, blue, alpha);
    }

    public static void glColorMaterial(int face, int mode){
        org.lwjgl.opengl.GL11.glColorMaterial(face, mode);
    }

    public static void glColorPointer(int size, boolean unsigned, int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glColorPointer(size, unsigned ? GL_UNSIGNED_BYTE : GL_BYTE, stride, pointer);
    }

    public static void glColorPointer(int size, int stride, DoubleBuffer pointer){
        throw new NotImplementedException();
    }

    public static void glColorPointer(int size, int stride, FloatBuffer pointer){
        org.lwjgl.opengl.GL11.glColorPointer(size, GL_FLOAT, stride, pointer);
    }

    public static void glColorPointer(int size, int type, int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer);
    }

    public static void glColorPointer(int size, int type, int stride, long pointer_buffer_offset){
        org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer_buffer_offset);
    }

    public static void glCopyPixels(int x, int y, int width, int height, int type){
        org.lwjgl.opengl.GL11.glCopyPixels(x, y, width, height, type);
    }

    public static void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border){
        org.lwjgl.opengl.GL11.glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
    }

    public static void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height, int border){
        org.lwjgl.opengl.GL11.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
    }

    public static void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width){
        org.lwjgl.opengl.GL11.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
    }

    public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height){
        org.lwjgl.opengl.GL11.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    public static void glCullFace(int mode){
        org.lwjgl.opengl.GL11.glCullFace(mode);
    }

    public static void glDeleteLists(int list, int range){
        org.lwjgl.opengl.GL11.glDeleteLists(list, range);
    }

    public static void glDeleteTextures(int texture){
        org.lwjgl.opengl.GL11.glDeleteTextures(texture);
    }

    public static void glDeleteTextures(IntBuffer textures){
        org.lwjgl.opengl.GL11.glDeleteTextures(textures);
    }

    public static void glDepthFunc(int func){
        org.lwjgl.opengl.GL11.glDepthFunc(func);
    }

    public static void glDepthMask(boolean flag){
        org.lwjgl.opengl.GL11.glDepthMask(flag);
    }

    public static void glDepthRange(double zNear, double zFar){
        org.lwjgl.opengl.GL11.glDepthRange(zNear, zFar);
    }

    public static void glDisable(int cap){
        org.lwjgl.opengl.GL11.glDisable(cap);
    }

    public static void glDisableClientState(int cap){
        org.lwjgl.opengl.GL11.glDisableClientState(cap);
    }

    public static void glDrawArrays(int mode, int first, int count){
        org.lwjgl.opengl.GL11.glDrawArrays(mode, first, count);
    }

    public static void glDrawBuffer(int mode){
        org.lwjgl.opengl.GL11.glDrawBuffer(mode);
    }

    public static void glDrawElements(int mode, ByteBuffer indices){
        org.lwjgl.opengl.GL11.glDrawElements(mode, GL_BYTE, indices);
    }

    public static void glDrawElements(int mode, IntBuffer indices){
        throw new NotImplementedException();
    }

    public static void glDrawElements(int mode, int count, int type, ByteBuffer indices){
        throw new NotImplementedException();
    }

    public static void glDrawElements(int mode, int indices_count, int type, long indices_buffer_offset){
        org.lwjgl.opengl.GL11.glDrawElements(mode, indices_count, type, indices_buffer_offset);
    }

    public static void glDrawElements(int mode, ShortBuffer indices){
        throw new NotImplementedException();
    }

    public static void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels){
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public static void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels){
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public static void glDrawPixels(int width, int height, int format, int type, long pixels_buffer_offset){
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels_buffer_offset);
    }

    public static void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels){
        org.lwjgl.opengl.GL11.glDrawPixels(width, height, format, type, pixels);
    }

    public static void glEdgeFlag(boolean flag){
        org.lwjgl.opengl.GL11.glEdgeFlag(flag);
    }

    public static void glEdgeFlagPointer(int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer);
    }

    public static void glEdgeFlagPointer(int stride, long pointer_buffer_offset){
        org.lwjgl.opengl.GL11.glEdgeFlagPointer(stride, pointer_buffer_offset);
    }

    public static void glEnable(int cap){
        org.lwjgl.opengl.GL11.glEnable(cap);
    }

    public static void glEnableClientState(int cap){
        org.lwjgl.opengl.GL11.glEnableClientState(cap);
    }

    public static void glEnd(){
        org.lwjgl.opengl.GL11.glEnd();
    }

    public static void glEndList(){
        org.lwjgl.opengl.GL11.glEndList();
    }

    public static void glEvalCoord1d(double u){
        org.lwjgl.opengl.GL11.glEvalCoord1d(u);
    }

    public static void glEvalCoord1f(float u){
        org.lwjgl.opengl.GL11.glEvalCoord1f(u);
    }

    public static void glEvalCoord2d(double u, double v){
        org.lwjgl.opengl.GL11.glEvalCoord2d(u, v);
    }

    public static void glEvalCoord2f(float u, float v){
        org.lwjgl.opengl.GL11.glEvalCoord2f(u, v);
    }

    public static void glEvalMesh1(int mode, int i1, int i2){
        org.lwjgl.opengl.GL11.glEvalMesh1(mode, i1, i2);
    }

    public static void glEvalMesh2(int mode, int i1, int i2, int j1, int j2){
        org.lwjgl.opengl.GL11.glEvalMesh2(mode, i1, i2, j1, j2);
    }

    public static void glEvalPoint1(int i){
        org.lwjgl.opengl.GL11.glEvalPoint1(i);
    }

    public static void glEvalPoint2(int i, int j){
        org.lwjgl.opengl.GL11.glEvalPoint2(i, j);
    }

    public static void glFeedbackBuffer(int type, FloatBuffer buffer){
        org.lwjgl.opengl.GL11.glFeedbackBuffer(type, buffer);
    }

    public static void glFinish(){
        org.lwjgl.opengl.GL11.glFinish();
    }

    public static void glFlush(){
        org.lwjgl.opengl.GL11.glFlush();
    }

    public static void glFog(int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glFogfv(pname, params);
    }

    public static void glFog(int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glFogiv(pname, params);
    }

    public static void glFogf(int pname, float param){
        org.lwjgl.opengl.GL11.glFogf(pname, param);
    }

    public static void glFogi(int pname, int param){
        org.lwjgl.opengl.GL11.glFogi(pname, param);
    }

    public static void glFrontFace(int mode){
        org.lwjgl.opengl.GL11.glFrontFace(mode);
    }

    public static void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar){
        org.lwjgl.opengl.GL11.glFrustum(left, right, bottom, top, zNear, zFar);
    }

    public static int glGenLists(int range){
        return org.lwjgl.opengl.GL11.glGenLists(range);
    }

    public static int glGenTextures(){
        return org.lwjgl.opengl.GL11.glGenTextures();
    }

    public static void glGenTextures(IntBuffer textures){
        org.lwjgl.opengl.GL11.glGenTextures(textures);
    }

    public static boolean glGetBoolean(int pname){
        return org.lwjgl.opengl.GL11.glGetBoolean(pname);
    }

    public static void glGetBoolean(int pname, ByteBuffer params){
        org.lwjgl.opengl.GL11.glGetBooleanv(pname, params);
    }

    public static void glGetClipPlane(int plane, DoubleBuffer equation){
        org.lwjgl.opengl.GL11.glGetClipPlane(plane, equation);
    }

    public static double glGetDouble(int pname){
        return org.lwjgl.opengl.GL11.glGetDouble(pname);
    }

    public static void glGetDouble(int pname, DoubleBuffer params){
        org.lwjgl.opengl.GL11.glGetDoublev(pname, params);
    }

    public static int glGetError(){
        return org.lwjgl.opengl.GL11.glGetError();
    }

    public static float glGetFloat(int pname){
        return org.lwjgl.opengl.GL11.glGetFloat(pname);
    }

    public static void glGetFloat(int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glGetFloatv(pname, params);
    }

    public static int glGetInteger(int pname){
        return org.lwjgl.opengl.GL11.glGetInteger(pname);
    }

    public static void glGetInteger(int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, params);
    }

    public static void glGetLight(int light, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glGetLightfv(light, pname, params);
    }

    public static void glGetLight(int light, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glGetLightiv(light, pname, params);
    }

    public static void glGetMap(int target, int query, DoubleBuffer v){
        org.lwjgl.opengl.GL11.glGetMapdv(target, query, v);
    }

    public static void glGetMap(int target, int query, FloatBuffer v){
        org.lwjgl.opengl.GL11.glGetMapfv(target, query, v);
    }

    public static void glGetMap(int target, int query, IntBuffer v){
        org.lwjgl.opengl.GL11.glGetMapiv(target, query, v);
    }

    public static void glGetMaterial(int face, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glGetMaterialfv(face, pname, params);
    }

    public static void glGetMaterial(int face, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glGetMaterialiv(face, pname, params);
    }

    public static void glGetPixelMap(int map, FloatBuffer values){
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, values);
    }

    public static void glGetPixelMapfv(int map, long values_buffer_offset){
        org.lwjgl.opengl.GL11.glGetPixelMapfv(map, values_buffer_offset);
    }

    public static void glGetPixelMapu(int map, IntBuffer values){
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, values);
    }

    public static void glGetPixelMapu(int map, ShortBuffer values){
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, values);
    }

    public static void glGetPixelMapuiv(int map, long values_buffer_offset){
        org.lwjgl.opengl.GL11.glGetPixelMapuiv(map, values_buffer_offset);
    }

    public static void glGetPixelMapusv(int map, long values_buffer_offset){
        org.lwjgl.opengl.GL11.glGetPixelMapusv(map, values_buffer_offset);
    }

    public static ByteBuffer glGetPointer(int pname, long result_size){
        throw new NotImplementedException();
    }

    public static void glGetPolygonStipple(ByteBuffer mask){
        org.lwjgl.opengl.GL11.glGetPolygonStipple(mask);
    }

    public static void glGetPolygonStipple(long mask_buffer_offset){
        org.lwjgl.opengl.GL11.glGetPolygonStipple(mask_buffer_offset);
    }

    public static String glGetString(int name){
        return org.lwjgl.opengl.GL11.glGetString(name);
    }

    public static void glGetTexEnv(int coord, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glGetTexEnvfv(coord, pname, params);
    }

    public static void glGetTexEnv(int coord, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glGetTexEnviv(coord, pname, params);
    }

    public static float glGetTexEnvf(int coord, int pname){
        return org.lwjgl.opengl.GL11.glGetTexEnvf(coord, pname);
    }

    public static int glGetTexEnvi(int coord, int pname){
        return org.lwjgl.opengl.GL11.glGetTexEnvi(coord, pname);
    }

    public static void glGetTexGen(int coord, int pname, DoubleBuffer params){
        org.lwjgl.opengl.GL11.glGetTexGendv(coord, pname, params);
    }

    public static void glGetTexGen(int coord, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glGetTexGenfv(coord, pname, params);
    }

    public static void glGetTexGen(int coord, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glGetTexGeniv(coord, pname, params);
    }

    public static double glGetTexGend(int coord, int pname){
        return org.lwjgl.opengl.GL11.glGetTexGend(coord, pname);
    }

    public static float glGetTexGenf(int coord, int pname){
        return org.lwjgl.opengl.GL11.glGetTexGenf(coord, pname);
    }

    public static int glGetTexGeni(int coord, int pname){
        return org.lwjgl.opengl.GL11.glGetTexGeni(coord, pname);
    }

    public static void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels){
        org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, pixels);
    }

    public static void glGetTexImage(int target, int level, int format, int type, DoubleBuffer pixels){
        org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, pixels);
    }

    public static void glGetTexImage(int target, int level, int format, int type, FloatBuffer pixels){
        org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, pixels);
    }

    public static void glGetTexImage(int target, int level, int format, int type, IntBuffer pixels){
        org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, pixels);
    }

    public static void glGetTexImage(int target, int level, int format, int type, long pixels_buffer_offset){
        org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, pixels_buffer_offset);
    }

    public static void glGetTexImage(int target, int level, int format, int type, ShortBuffer pixels){
        org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, pixels);
    }

    public static void glGetTexLevelParameter(int target, int level, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glGetTexLevelParameterfv(target, level, pname, params);
    }

    public static void glGetTexLevelParameter(int target, int level, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glGetTexLevelParameteriv(target, level, pname, params);
    }

    public static float glGetTexLevelParameterf(int target, int level, int pname){
        return org.lwjgl.opengl.GL11.glGetTexLevelParameterf(target, level, pname);
    }

    public static int glGetTexLevelParameteri(int target, int level, int pname){
        return org.lwjgl.opengl.GL11.glGetTexLevelParameteri(target, level, pname);
    }

    public static void glGetTexParameter(int target, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glGetTexParameterfv(target, pname, params);
    }

    public static void glGetTexParameter(int target, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glGetTexParameteriv(target, pname, params);
    }

    public static float glGetTexParameterf(int target, int pname){
        return org.lwjgl.opengl.GL11.glGetTexParameterf(target, pname);
    }

    public static int glGetTexParameteri(int target, int pname){
        return org.lwjgl.opengl.GL11.glGetTexParameteri(target, pname);
    }

    public static void glHint(int target, int mode){
        org.lwjgl.opengl.GL11.glHint(target, mode);
    }

    public static void glInitNames(){
        org.lwjgl.opengl.GL11.glInitNames();
    }

    public static void glInterleavedArrays(int format, int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public static void glInterleavedArrays(int format, int stride, DoubleBuffer pointer){
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public static void glInterleavedArrays(int format, int stride, FloatBuffer pointer){
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public static void glInterleavedArrays(int format, int stride, IntBuffer pointer){
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public static void glInterleavedArrays(int format, int stride, long pointer_buffer_offset){
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer_buffer_offset);
    }

    public static void glInterleavedArrays(int format, int stride, ShortBuffer pointer){
        org.lwjgl.opengl.GL11.glInterleavedArrays(format, stride, pointer);
    }

    public static boolean glIsEnabled(int cap){
        return org.lwjgl.opengl.GL11.glIsEnabled(cap);
    }

    public static boolean glIsList(int list){
        return org.lwjgl.opengl.GL11.glIsList(list);
    }

    public static boolean glIsTexture(int texture){
        return org.lwjgl.opengl.GL11.glIsTexture(texture);
    }

    public static void glLight(int light, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glLightfv(light, pname, params);
    }

    public static void glLight(int light, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glLightiv(light, pname, params);
    }

    public static void glLightf(int light, int pname, float param){
        org.lwjgl.opengl.GL11.glLightf(light, pname, param);
    }

    public static void glLighti(int light, int pname, int param){
        org.lwjgl.opengl.GL11.glLighti(light, pname, param);
    }

    public static void glLightModel(int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glLightModelfv(pname, params);
    }

    public static void glLightModel(int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glLightModeliv(pname, params);
    }

    public static void glLightModelf(int pname, float param){
        org.lwjgl.opengl.GL11.glLightModelf(pname, param);
    }

    public static void glLightModeli(int pname, int param){
        org.lwjgl.opengl.GL11.glLightModeli(pname, param);
    }

    public static void glLineStipple(int factor, short pattern){
        org.lwjgl.opengl.GL11.glLineStipple(factor, pattern);
    }

    public static void glLineWidth(float width){
        org.lwjgl.opengl.GL11.glLineWidth(width);
    }

    public static void glListBase(int base){
        org.lwjgl.opengl.GL11.glListBase(base);
    }

    public static void glLoadIdentity(){
        org.lwjgl.opengl.GL11.glLoadIdentity();
    }

    public static void glLoadMatrix(DoubleBuffer m){
        org.lwjgl.opengl.GL11.glLoadMatrixd(m);
    }

    public static void glLoadMatrix(FloatBuffer m){
        org.lwjgl.opengl.GL11.glLoadMatrixf(m);
    }

    public static void glLoadName(int name){
        org.lwjgl.opengl.GL11.glLoadName(name);
    }

    public static void glLogicOp(int opcode){
        org.lwjgl.opengl.GL11.glLogicOp(opcode);
    }

    public static void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points){
        org.lwjgl.opengl.GL11.glMap1d(target, u1, u2, stride, order, points);
    }

    public static void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points){
        org.lwjgl.opengl.GL11.glMap1f(target, u1, u2, stride, order, points);
    }

    public static void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, DoubleBuffer points){
        org.lwjgl.opengl.GL11.glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    public static void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, FloatBuffer points){
        org.lwjgl.opengl.GL11.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
    }

    public static void glMapGrid1d(int un, double u1, double u2){
        org.lwjgl.opengl.GL11.glMapGrid1d(un, u1, u2);
    }

    public static void glMapGrid1f(int un, float u1, float u2){
        org.lwjgl.opengl.GL11.glMapGrid1f(un, u1, u2);
    }

    public static void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2){
        org.lwjgl.opengl.GL11.glMapGrid2d(un, u1, u2, vn, v1, v2);
    }

    public static void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2){
        org.lwjgl.opengl.GL11.glMapGrid2f(un, u1, u2, vn, v1, v2);
    }

    public static void glMaterial(int face, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glMaterialfv(face, pname, params);
    }

    public static void glMaterial(int face, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glMaterialiv(face, pname, params);
    }

    public static void glMaterialf(int face, int pname, float param){
        org.lwjgl.opengl.GL11.glMaterialf(face, pname, param);
    }

    public static void glMateriali(int face, int pname, int param){
        org.lwjgl.opengl.GL11.glMateriali(face, pname, param);
    }

    public static void glMatrixMode(int mode){
        org.lwjgl.opengl.GL11.glMatrixMode(mode);
    }

    public static void glMultMatrix(DoubleBuffer m){
        org.lwjgl.opengl.GL11.glMultMatrixd(m);
    }

    public static void glMultMatrix(FloatBuffer m){
        org.lwjgl.opengl.GL11.glMultMatrixf(m);
    }

    public static void glNewList(int list, int mode){
        org.lwjgl.opengl.GL11.glNewList(list, mode);
    }

    public static void glNormal3b(byte nx, byte ny, byte nz){
        org.lwjgl.opengl.GL11.glNormal3b(nx, ny, nz);
    }

    public static void glNormal3d(double nx, double ny, double nz){
        org.lwjgl.opengl.GL11.glNormal3d(nx, ny, nz);
    }

    public static void glNormal3f(float nx, float ny, float nz){
        org.lwjgl.opengl.GL11.glNormal3f(nx, ny, nz);
    }

    public static void glNormal3i(int nx, int ny, int nz){
        org.lwjgl.opengl.GL11.glNormal3i(nx, ny, nz);
    }

    public static void glNormalPointer(int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glNormalPointer(GL_BYTE, stride, pointer);
    }

    public static void glNormalPointer(int stride, DoubleBuffer pointer){
        throw new NotImplementedException();
    }

    public static void glNormalPointer(int stride, FloatBuffer pointer){
        org.lwjgl.opengl.GL11.glNormalPointer(GL_FLOAT, stride, pointer);
    }

    public static void glNormalPointer(int stride, IntBuffer pointer){
        org.lwjgl.opengl.GL11.glNormalPointer(GL_INT, stride, pointer);
    }

    public static void glNormalPointer(int type, int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer);
    }

    public static void glNormalPointer(int type, int stride, long pointer_buffer_offset){
        org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer_buffer_offset);
    }

    public static void glOrtho(double left, double right, double bottom, double top, double zNear, double zFar){
        org.lwjgl.opengl.GL11.glOrtho(left, right, bottom, top, zNear, zFar);
    }

    public static void glPassThrough(float token){
        org.lwjgl.opengl.GL11.glPassThrough(token);
    }

    public static void glPixelMap(int map, FloatBuffer values){
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values);
    }

    public static void glPixelMapfv(int map, int values_mapsize, long values_buffer_offset){
        org.lwjgl.opengl.GL11.glPixelMapfv(map, values_mapsize, values_buffer_offset);
    }

    public static void glPixelMapu(int map, IntBuffer values){
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values);
    }

    public static void glPixelMapu(int map, ShortBuffer values){
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values);
    }

    public static void glPixelMapuiv(int map, int values_mapsize, long values_buffer_offset){
        org.lwjgl.opengl.GL11.glPixelMapuiv(map, values_mapsize, values_buffer_offset);
    }

    public static void glPixelMapusv(int map, int values_mapsize, long values_buffer_offset){
        org.lwjgl.opengl.GL11.glPixelMapusv(map, values_mapsize, values_buffer_offset);
    }

    public static void glPixelStoref(int pname, float param){
        throw new NotImplementedException();
    }

    public static void glPixelStorei(int pname, int param){
        org.lwjgl.opengl.GL11.glPixelStorei(pname, param);
    }

    public static void glPixelTransferf(int pname, float param){
        org.lwjgl.opengl.GL11.glPixelTransferf(pname, param);
    }

    public static void glPixelTransferi(int pname, int param){
        org.lwjgl.opengl.GL11.glPixelTransferi(pname, param);
    }

    public static void glPixelZoom(float xfactor, float yfactor){
        org.lwjgl.opengl.GL11.glPixelZoom(xfactor, yfactor);
    }

    public static void glPointSize(float size){
        org.lwjgl.opengl.GL11.glPointSize(size);
    }

    public static void glPolygonMode(int face, int mode){
        org.lwjgl.opengl.GL11.glPolygonMode(face, mode);
    }

    public static void glPolygonOffset(float factor, float units){
        org.lwjgl.opengl.GL11.glPolygonOffset(factor, units);
    }

    public static void glPolygonStipple(ByteBuffer mask){
        org.lwjgl.opengl.GL11.glPolygonStipple(mask);
    }

    public static void glPolygonStipple(long mask_buffer_offset){
        org.lwjgl.opengl.GL11.glPolygonStipple(mask_buffer_offset);
    }

    public static void glPopAttrib(){
        org.lwjgl.opengl.GL11.glPopAttrib();
    }

    public static void glPopClientAttrib(){
        org.lwjgl.opengl.GL11.glPopClientAttrib();
    }

    public static void glPopMatrix(){
        org.lwjgl.opengl.GL11.glPopMatrix();
    }

    public static void glPopName(){
        org.lwjgl.opengl.GL11.glPopName();
    }

    public static void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities){
        org.lwjgl.opengl.GL11.glPrioritizeTextures(textures, priorities);
    }

    public static void glPushAttrib(int mask){
        org.lwjgl.opengl.GL11.glPushAttrib(mask);
    }

    public static void glPushClientAttrib(int mask){
        org.lwjgl.opengl.GL11.glPushClientAttrib(mask);
    }

    public static void glPushMatrix(){
        org.lwjgl.opengl.GL11.glPushMatrix();
    }

    public static void glPushName(int name){
        org.lwjgl.opengl.GL11.glPushName(name);
    }

    public static void glRasterPos2d(double x, double y){
        org.lwjgl.opengl.GL11.glRasterPos2d(x, y);
    }

    public static void glRasterPos2f(float x, float y){
        org.lwjgl.opengl.GL11.glRasterPos2f(x, y);
    }

    public static void glRasterPos2i(int x, int y){
        org.lwjgl.opengl.GL11.glRasterPos2i(x, y);
    }

    public static void glRasterPos3d(double x, double y, double z){
        org.lwjgl.opengl.GL11.glRasterPos3d(x, y, z);
    }

    public static void glRasterPos3f(float x, float y, float z){
        org.lwjgl.opengl.GL11.glRasterPos3f(x, y, z);
    }

    public static void glRasterPos3i(int x, int y, int z){
        org.lwjgl.opengl.GL11.glRasterPos3i(x, y, z);
    }

    public static void glRasterPos4d(double x, double y, double z, double w){
        org.lwjgl.opengl.GL11.glRasterPos4d(x, y, z, w);
    }

    public static void glRasterPos4f(float x, float y, float z, float w){
        org.lwjgl.opengl.GL11.glRasterPos4f(x, y, z, w);
    }

    public static void glRasterPos4i(int x, int y, int z, int w){
        org.lwjgl.opengl.GL11.glRasterPos4i(x, y, z, w);
    }

    public static void glReadBuffer(int mode){
        org.lwjgl.opengl.GL11.glReadBuffer(mode);
    }

    public static void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels){
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(int x, int y, int width, int height, int format, int type, DoubleBuffer pixels){
        throw new NotImplementedException();
    }

    public static void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels){
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels){
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels_buffer_offset){
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels_buffer_offset);
    }

    public static void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels){
        org.lwjgl.opengl.GL11.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glRectd(double x1, double y1, double x2, double y2){
        org.lwjgl.opengl.GL11.glRectd(x1, y1, x2, y2);
    }

    public static void glRectf(float x1, float y1, float x2, float y2){
        org.lwjgl.opengl.GL11.glRectf(x1, y1, x2, y2);
    }

    public static void glRecti(int x1, int y1, int x2, int y2){
        org.lwjgl.opengl.GL11.glRecti(x1, y1, x2, y2);
    }

    public static int glRenderMode(int mode){
        return org.lwjgl.opengl.GL11.glRenderMode(mode);
    }

    public static void glRotated(double angle, double x, double y, double z){
        org.lwjgl.opengl.GL11.glRotated(angle, x, y, z);
    }

    public static void glRotatef(float angle, float x, float y, float z){
        org.lwjgl.opengl.GL11.glRotatef(angle, x, y, z);
    }

    public static void glScaled(double x, double y, double z){
        org.lwjgl.opengl.GL11.glScaled(x, y, z);
    }

    public static void glScalef(float x, float y, float z){
        org.lwjgl.opengl.GL11.glScalef(x, y, z);
    }

    public static void glScissor(int x, int y, int width, int height){
        org.lwjgl.opengl.GL11.glScissor(x, y, width, height);
    }

    public static void glSelectBuffer(IntBuffer buffer){
        org.lwjgl.opengl.GL11.glSelectBuffer(buffer);
    }

    public static void glShadeModel(int mode){
        org.lwjgl.opengl.GL11.glShadeModel(mode);
    }

    public static void glStencilFunc(int func, int ref, int mask){
        org.lwjgl.opengl.GL11.glStencilFunc(func, ref, mask);
    }

    public static void glStencilMask(int mask){
        org.lwjgl.opengl.GL11.glStencilMask(mask);
    }

    public static void glStencilOp(int fail, int zfail, int zpass){
        org.lwjgl.opengl.GL11.glStencilOp(fail, zfail, zpass);
    }

    public static void glTexCoord1d(double s){
        org.lwjgl.opengl.GL11.glTexCoord1d(s);
    }

    public static void glTexCoord1f(float s){
        org.lwjgl.opengl.GL11.glTexCoord1f(s);
    }

    public static void glTexCoord2d(double s, double t){
        org.lwjgl.opengl.GL11.glTexCoord2d(s, t);
    }

    public static void glTexCoord2f(float s, float t){
        org.lwjgl.opengl.GL11.glTexCoord2f(s, t);
    }

    public static void glTexCoord3d(double s, double t, double r){
        org.lwjgl.opengl.GL11.glTexCoord3d(s, t, r);
    }

    public static void glTexCoord3f(float s, float t, float r){
        org.lwjgl.opengl.GL11.glTexCoord3f(s, t, r);
    }

    public static void glTexCoord4d(double s, double t, double r, double q){
        org.lwjgl.opengl.GL11.glTexCoord4d(s, t, r, q);
    }

    public static void glTexCoord4f(float s, float t, float r, float q){
        org.lwjgl.opengl.GL11.glTexCoord4f(s, t, r, q);
    }

    public static void glTexCoordPointer(int size, int stride, DoubleBuffer pointer){
        throw new NotImplementedException();
    }

    public static void glTexCoordPointer(int size, int stride, FloatBuffer pointer){
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, GL_FLOAT, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int stride, IntBuffer pointer){
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, GL_INT, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }

    public static void glTexCoordPointer(int size, int type, int stride, long pointer_buffer_offset){
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer_buffer_offset);
    }

    public static void glTexCoordPointer(int size, int stride, ShortBuffer pointer){
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, GL_SHORT, stride, pointer);
    }

    public static void glTexEnv(int target, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, params);
    }

    public static void glTexEnv(int target, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glTexEnviv(target, pname, params);
    }

    public static void glTexEnvf(int target, int pname, float param){
        org.lwjgl.opengl.GL11.glTexEnvf(target, pname, param);
    }

    public static void glTexEnvi(int target, int pname, int param){
        org.lwjgl.opengl.GL11.glTexEnvi(target, pname, param);
    }

    public static void glTexGen(int coord, int pname, DoubleBuffer params){
        org.lwjgl.opengl.GL11.glTexGendv(coord, pname, params);
    }

    public static void glTexGen(int coord, int pname, FloatBuffer params){
        org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, params);
    }

    public static void glTexGen(int coord, int pname, IntBuffer params){
        org.lwjgl.opengl.GL11.glTexGeniv(coord, pname, params);
    }

    public static void glTexGend(int coord, int pname, double param){
        org.lwjgl.opengl.GL11.glTexGend(coord, pname, param);
    }

    public static void glTexGenf(int coord, int pname, float param){
        org.lwjgl.opengl.GL11.glTexGenf(coord, pname, param);
    }

    public static void glTexGeni(int coord, int pname, int param){
        org.lwjgl.opengl.GL11.glTexGeni(coord, pname, param);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ByteBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, DoubleBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, FloatBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, IntBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels_buffer_offset){
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels_buffer_offset);
    }

    public static void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, ShortBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, DoubleBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels_buffer_offset){
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels_buffer_offset);
    }

    public static void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels){
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexParameter(int target, int pname, FloatBuffer param){
        org.lwjgl.opengl.GL11.glTexParameterfv(target, pname, param);
    }

    public static void glTexParameter(int target, int pname, IntBuffer param){
        org.lwjgl.opengl.GL11.glTexParameteriv(target, pname, param);
    }

    public static void glTexParameterf(int target, int pname, float param){
        org.lwjgl.opengl.GL11.glTexParameterf(target, pname, param);
    }

    public static void glTexParameteri(int target, int pname, int param){
        org.lwjgl.opengl.GL11.glTexParameteri(target, pname, param);
    }

    public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ByteBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, FloatBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels_buffer_offset){
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels_buffer_offset);
    }

    public static void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, ShortBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels_buffer_offset){
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels_buffer_offset);
    }

    public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels){
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTranslated(double x, double y, double z){
        org.lwjgl.opengl.GL11.glTranslated(x, y, z);
    }

    public static void glTranslatef(float x, float y, float z){
        org.lwjgl.opengl.GL11.glTranslatef(x, y, z);
    }

    public static void glVertex2d(double x, double y){
        org.lwjgl.opengl.GL11.glVertex2d(x, y);
    }

    public static void glVertex2f(float x, float y){
        org.lwjgl.opengl.GL11.glVertex2f(x, y);
    }

    public static void glVertex2i(int x, int y){
        org.lwjgl.opengl.GL11.glVertex2i(x, y);
    }

    public static void glVertex3d(double x, double y, double z){
        org.lwjgl.opengl.GL11.glVertex3d(x, y, z);
    }

    public static void glVertex3f(float x, float y, float z){
        org.lwjgl.opengl.GL11.glVertex3f(x, y, z);
    }

    public static void glVertex3i(int x, int y, int z){
        org.lwjgl.opengl.GL11.glVertex3i(x, y, z);
    }

    public static void glVertex4d(double x, double y, double z, double w){
        org.lwjgl.opengl.GL11.glVertex4d(x, y, z, w);
    }

    public static void glVertex4f(float x, float y, float z, float w){
        org.lwjgl.opengl.GL11.glVertex4f(x, y, z, w);
    }

    public static void glVertex4i(int x, int y, int z, int w){
        org.lwjgl.opengl.GL11.glVertex4i(x, y, z, w);
    }

    public static void glVertexPointer(int size, int stride, DoubleBuffer pointer){
        throw new NotImplementedException();
    }

    public static void glVertexPointer(int size, int stride, FloatBuffer pointer){
        org.lwjgl.opengl.GL11.glVertexPointer(size, GL_FLOAT, stride, pointer);
    }

    public static void glVertexPointer(int size, int stride, IntBuffer pointer){
        org.lwjgl.opengl.GL11.glVertexPointer(size, GL_INT, stride, pointer);
    }

    public static void glVertexPointer(int size, int type, int stride, ByteBuffer pointer){
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer);
    }

    public static void glVertexPointer(int size, int type, int stride, long pointer_buffer_offset){
        org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer_buffer_offset);
    }

    public static void glVertexPointer(int size, int stride, ShortBuffer pointer){
        org.lwjgl.opengl.GL11.glVertexPointer(size, GL_SHORT, stride, pointer);
    }

    public static void glViewport(int x, int y, int width, int height){
        org.lwjgl.opengl.GL11.glViewport(x, y, width, height);
    }

}
