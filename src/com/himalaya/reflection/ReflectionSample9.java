package com.himalaya.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionSample9 {

    public static void main(String[] args) {
        WorkerValue benVo = new WorkerValue("Trevi", WorkerValue.POSITION_MANAGER);


        Class<WorkerValue> clazz = WorkerValue.class;

        try {
            Field f = clazz.getDeclaredField("position");
            f.setAccessible(true);
            Object vlu = f.get(benVo);
            System.out.println("Field Modifiler : " + ReflectionSample8.parseModifier(f.getModifiers())
                    + ", Field Name : " + f.getName() + ", Field Value : " + vlu);

            f.set(benVo, WorkerValue.POSITION_EMPLOYEE);
            vlu = f.get(benVo);
            System.out.println("Field Modifiler : " + ReflectionSample8.parseModifier(f.getModifiers())
                    + ", Field Name : " + f.getName() + ", Field Value : " + vlu);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
