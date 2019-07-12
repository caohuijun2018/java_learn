package com.caohuijun.helloWorld;

public class Maxnumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 66;
        int c = 99;
        if (a == b && b == c) {
            System.out.println("abc等大");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a是最大值");
                } else {
                    if (a == c) {
                        System.out.println("a和c等大，为最大值");
                    } else {
                        System.out.println("c是最大值");
                    }
                }
            } else {
                if (a < b) {
                    if (b == c) {
                        System.out.println("b和c等大");
                    } else {
                        if (b < c) {
                            System.out.println("c是最大值");
                        } else {
                            System.out.println("b是最大值");
                        }
                    }
                } else {
                    if (b < c) {
                        System.out.println("c是最大值");
                    } else {
                        System.out.println("b是最大值");
                    }
                }
            }
        }
    }
}