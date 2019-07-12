package com.caohuijun.helloWorld;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        // 每门课的名字
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";
        Scanner in = new Scanner(System.in);
        System.out.println("你想保存几年的成绩？");
        int yearsToStore = in.nextInt();
        double[][] scores = new double[yearsToStore][names.length];
        for (int i = 0; i < yearsToStore; i++) {
            for (int j = 0; j < names.length; j++) {
                scores[i][j] = 80 + Math.random() * 20;
            }
        }
        System.out.println("你想查看第几年的成绩？");
        int year = in.nextInt() - 1;
        System.out.println("请输入想查看的课程编号");
        int scoresTake = in.nextInt() - 1;
        System.out.println("第" + (year + 1) + "年的" + (scoresTake + 1) + "课程的成绩为：" + scores[year][scoresTake]);
    }
}
