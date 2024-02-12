package com.tij4awesome.chapter1;

public interface Light {
    Boolean on(int num);
    void on();
    Boolean off(int num);
    void off();
    Integer brighten(int num);
    void brighten();
    void dim();
}
