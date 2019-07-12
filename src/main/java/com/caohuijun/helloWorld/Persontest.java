package com.caohuijun.helloWorld;

public class Persontest {
    public static void main(String[] args) {
        Person jun = new Person("caohuijun");
        Person b = jun;
        b.setName("xxxxz");
        System.out.println(jun.getName());
    }
}
