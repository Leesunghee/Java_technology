package com.himalaya.reflection;

public class ReflectionSample2 {
    public static void main(String[] args) {
        WorkerValue workerVo = new WorkerValue("Trevi", WorkerValue.POSITION_MANAGER);

        Class clazz1 = WorkerValue.class;
        Class clazz2 = workerVo.getClass();
        Class clazz3 = null;

        try {
            clazz3 = Class.forName("com.himalaya.reflection.WorkerValue");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("HashCode = clazz1 : " + System.identityHashCode(clazz1));
        System.out.println("HashCode = clazz2 : " + System.identityHashCode(clazz2));
        System.out.println("HashCode = clazz3 : " + System.identityHashCode(clazz3));
        System.out.println("HashCode = null : " + System.identityHashCode(null));

    }
}
