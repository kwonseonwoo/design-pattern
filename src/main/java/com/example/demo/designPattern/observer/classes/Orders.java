package com.example.demo.designPattern.observer.classes;

import com.example.demo.designPattern.observer.interfaces.Observer;
import com.example.demo.designPattern.observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

public class Orders implements Publisher {

    private final List<Observer> observers;

    public Orders() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void help() {
        System.out.println("[Publisher] 도움핑 발생...");
        noti();
    }

    @Override
    public void back() {
        System.out.println("[Publisher] 퇴각 신호 발생...");
        noti();
    }

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void ignore(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void noti() {
        this.observers.forEach(Observer::accept);
    }
}
