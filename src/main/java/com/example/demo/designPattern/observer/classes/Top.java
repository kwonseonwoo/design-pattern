package com.example.demo.designPattern.observer.classes;

import com.example.demo.designPattern.observer.interfaces.Observer;
import com.example.demo.designPattern.observer.interfaces.Publisher;

public class Top implements Observer {

    public Top(Publisher publisher) {
        publisher.add(this);
    }

    @Override
    public void accept() {
        System.out.println("[Observer-Top] Accept...");
    }
}
