package com.example.demo.designPattern.observer.interfaces;

public interface Publisher {

    /** 도움핑 */
    void help();

    /** 빽핑 신호 */
    void back();

    void add(Observer observer);
    void ignore(Observer observer);
    void noti();
}
