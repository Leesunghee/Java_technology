package com.himalaya.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSample3 {

    public static void main(String[] args) {
        Class clazz = WorkerValue.class;
        Constructor[] constructors = clazz.getConstructors();
        System.out.println("--Constructor-----------------------------");
        for (int i = 0; constructors != null && i < constructors.length; i++) {
            System.out.println(constructors[i].toString());
        }
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("--Method-----------------------------");

        for (int i = 0; methods != null && i < methods.length; i++) {
            System.out.println(methods[i].toString());
        }

        Field[] fields = clazz.getDeclaredFields();
        System.out.println("--Field-----------------------------");

        for (int i = 0; fields != null && i < fields.length; i++) {
            System.out.println(fields[i].toString());
        }
    }
}
