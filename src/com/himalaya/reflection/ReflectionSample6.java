package com.himalaya.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSample6 {

    public static void main(String[] args) {
        ReflectionSample6 sample = new ReflectionSample6();
        sample.dynamicInstantiation();
    }

    private void dynamicInstantiation() {
        Class<WorkerValue> clazz = WorkerValue.class;
        try {
            Constructor<WorkerValue> paramCons = clazz.getConstructor(String.class, Integer.TYPE);

            Object[] params = new Object[] {
                    new String("Trevi"), WorkerValue.POSITION_ASSISTANT
            };

            WorkerValue workerVo = paramCons.newInstance(params);

            System.out.println(workerVo.toString());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
