package com.caohuijun.helloWorld;

public class Print26char {
    public static void main(String[] args) {
        char ch ='A';
        int num =ch;
        /*System.out.println(num+ "\t"+ (char)(num++));
        System.out.println(num+ "\t"+ (char)(num++));
        System.out.println(num+ "\t"+ (char)(num++));
        System.out.println(num+ "\t"+ (char)(num++));
        System.out.println(num+ "\t"+ (char)(num++));
        System.out.println(num+ "\t"+ (char)(num++));*/
        for(int i=0;i<26;i++){
            System.out.println((num+i)+"\t"+ (char)(num+i));
        }

    }
}
