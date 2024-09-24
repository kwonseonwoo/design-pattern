package com.example.demo.designPattern.observer.classes;

import com.example.demo.designPattern.observer.interfaces.Observer;
import com.example.demo.designPattern.observer.interfaces.Publisher;

public class Jungle implements Observer {

    public Jungle(Publisher publisher) {
        publisher.add(this);
    }

    @Override
    public void accept() {
        System.out.println("[Observer-Jungle] Accept...");
    }

}
