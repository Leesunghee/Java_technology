package com.himalaya.reflection;

import java.lang.reflect.Constructor;

public class ReflectionSample5 {

    public static void main(String[] args) {
        Class<?> clazz = String.class;

        try {

            Constructor<?> c1 = clazz.getConstructor();
            Constructor<?> c2 = clazz.getConstructor(String.class);
            Constructor<?> c3 = clazz.getConstructor(StringBuilder.class);

            Constructor<?> c4 = clazz.getConstructor(byte[].class);

            Constructor<?> c5 = clazz.getConstructor(byte[].class, Integer.TYPE);

            Class<?>[] paramClasses = new Class[] {
              byte[].class, Integer.TYPE, Integer.TYPE
            };

            Constructor<?> c6 = clazz.getConstructor(paramClasses);

            System.out.println(c1.toString());
            System.out.println(c2.toString());
            System.out.println(c3.toString());
            System.out.println(c4.toString());
            System.out.println(c5.toString());
            System.out.println(c6.toString());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
