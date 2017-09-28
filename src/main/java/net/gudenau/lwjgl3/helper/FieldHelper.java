package net.gudenau.lwjgl3.helper;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by gudenau on 6/8/2017.
 * <p>
 * LWJGL3
 */
public class FieldHelper{
    public static void copyStaticFields(Class<?> source, Class<?> destination){
        try{
            Map<String, Field> ourFields = Arrays.stream(destination.getDeclaredFields())
                .filter(field -> Modifier.isStatic(field.getModifiers()))
                .collect(Collectors.toMap(Field::getName, field->field));
            Map<String, Field> thereFields = Arrays.stream(source.getDeclaredFields())
                .filter(field -> Modifier.isStatic(field.getModifiers()))
                .collect(Collectors.toMap(Field::getName, field->field));

            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);

            ourFields.values().forEach(field->{
                int modifiers = field.getModifiers();
                modifiers = modifiers & ~Modifier.FINAL;
                try{
                    modifiersField.set(field, modifiers);
                }catch(IllegalAccessException e){
                    throw new RuntimeException(e);
                }
            });

            ourFields.forEach((name, ourField)->{
                Field thereField = thereFields.get(name);
                if(thereField != null && ourField.getType().equals(thereField.getType())){
                    try{
                        ourField.set(null, thereField.get(null));
                    }catch(IllegalAccessException e){
                        throw new RuntimeException(e);
                    }
                }
            });
        }catch(Throwable t){
            throw new RuntimeException(t);
        }
    }
}
