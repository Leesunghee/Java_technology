package com.himalaya.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionSample7 {

    public static void main(String[] args) {
        WorkerValue benVo = new WorkerValue("Trevi", WorkerValue.POSITION_MANAGER);
        WorkerValue hamVo = new WorkerValue("Orangina", WorkerValue.POSITION_ASSISTANT);

        Class<WorkerValue> clazz1 = WorkerValue.class;

        try {
            Method m1 = clazz1.getMethod("getName", new Class[]{});

            Object rt1 = m1.invoke(benVo, new Object[]{});
            Object rt2 = m1.invoke(hamVo, new Object[]{});

            System.out.println("rt1 = " + rt1);
            System.out.println("rt2 = " + rt2);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
