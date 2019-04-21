package com.himalaya.reflection;

public class ReflectionSample4 {

    public static void main(String[] args) {
        WorkerValue workerVo = new WorkerValue("Trevi", WorkerValue.POSITION_EMPLOYEE);

        Class clazz = workerVo.getClass();

        try {
            Object obj = clazz.newInstance();
            if (obj instanceof WorkerValue) {
                System.out.println("This is WorkerValue class object");
            }

            System.out.println("Variable workerVo : hashcode = " + System.identityHashCode(workerVo));
            System.out.println("Variable workerVo : hashcode = " + System.identityHashCode(obj));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
