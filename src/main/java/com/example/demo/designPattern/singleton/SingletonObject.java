package com.example.demo.designPattern.singleton;

public class SingletonObject {

    private final String name;
    private static final SingletonObject object = new SingletonObject();

    private SingletonObject() {
        this.name = "SingleTon Object 입니다...";
    }

    public static SingletonObject getInstance() {
        return object;
    }

    public String getName() {
        return this.name;
    }

}
