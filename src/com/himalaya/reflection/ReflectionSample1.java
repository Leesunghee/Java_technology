package com.himalaya.reflection;

public class ReflectionSample1 {
    public static void main(String[] args) {
        WorkerValue workerVo = new WorkerValue("Trevi", WorkerValue.POSITION_MANAGER);
        System.out.println("Info : " + workerVo.toString());
    }
}
