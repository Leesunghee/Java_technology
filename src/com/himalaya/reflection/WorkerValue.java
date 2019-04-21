package com.himalaya.reflection;

public class WorkerValue {
    public static int POSITION_MANAGER = 0;
    public static int POSITION_ASSISTANT = 1;
    public static int POSITION_EMPLOYEE = 2;

    private String name;
    private int position;

    public WorkerValue() {
        name = null;
        position = Integer.MAX_VALUE;
    }

    public WorkerValue(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("WorkerValue [name=");
        builder.append(name);
        builder.append(", position=");
        builder.append(position);
        builder.append("]");
        return builder.toString();
    }
}
