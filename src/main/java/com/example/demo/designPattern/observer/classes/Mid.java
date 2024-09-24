package com.example.demo.designPattern.observer.classes;

import com.example.demo.designPattern.observer.interfaces.Observer;
import com.example.demo.designPattern.observer.interfaces.Publisher;

public class Mid implements Observer {

    public Mid(Publisher publisher) {
        publisher.add(this);
    }

    @Override
    public void accept() {
        System.out.println("[Observer-Mid] Accept...");
    }

}
