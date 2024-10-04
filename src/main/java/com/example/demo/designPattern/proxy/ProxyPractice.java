package com.example.demo.designPattern.proxy;

public class ProxyPractice {

    public static void main(String[] args) {
        int cash = 3000;
        AbstractStore store = new StoreProxy();
        store.process(null, cash);
    }

}
