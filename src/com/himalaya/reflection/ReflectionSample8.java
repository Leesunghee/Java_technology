package com.himalaya.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionSample8 {

    public static void main(String[] args) {
        WorkerValue benVo = new WorkerValue("Trevi", WorkerValue.POSITION_MANAGER);


        Class<WorkerValue> clazz = WorkerValue.class;
        Field[] fields = clazz.getFields();

        for (int i = 0; fields != null && i < fields.length; i++) {

            Field f = fields[i];

            try {
                Object obj = f.get(benVo);
                System.out.println("Field Modifiler : " + ReflectionSample8.parseModifier(f.getModifiers())
                        + ", Field Name : " + f.getName() + ", Field Value : " + obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String parseModifier(int modifier) {

        StringBuffer sb = new StringBuffer();

        if (Modifier.isAbstract(modifier)) {
            sb.append("abstract ");
        }
        if (Modifier.isFinal(modifier)) {
            sb.append("final ");
        }
        if (Modifier.isPrivate(modifier)) {
            sb.append("private ");
        }
        if (Modifier.isProtected(modifier)) {
            sb.append("protected ");
        }
        if (Modifier.isPublic(modifier)) {
            sb.append("public ");
        }
        if (Modifier.isStatic(modifier)) {
            sb.append("static ");
        }
        if (Modifier.isSynchronized(modifier)) {
            sb.append("synchronized ");
        }

        return sb.toString();
    }
}
