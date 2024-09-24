package com.example.demo.designPattern.observer;

import com.example.demo.designPattern.observer.classes.*;
import com.example.demo.designPattern.observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

public class ProcessClass {

    public static void main(String[] args) {
        // Publisher
        Publisher publisher = new Orders();

        // Observers
        Top top = new Top(publisher);
        Mid mid = new Mid(publisher);
        Bottom bottom = new Bottom(publisher);
        Jungle jungle = new Jungle(publisher);

        publisher.help();

        System.out.println("=================================");
        System.out.println("=================================");

        publisher.back();

        System.out.println("=================================");
        System.out.println("=================================");

        publisher.ignore(top);
        publisher.back();
    }

}
