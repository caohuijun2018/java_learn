package com.caohuijun.helloWorld;

import java.time.Year;
import java.util.Scanner;

public class YearsScore {
    public static void main(String[] args) {
        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        int totalScoreCount = 6;

        // 每门课的名字
        String[] names = new String[totalScoreCount];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        Scanner in = new Scanner(System.in);

        System.out.println("请问你要保存几年的成绩？");
        int YearCount = in.nextInt();
        double[][] scores = new double[YearCount][totalScoreCount];
        for (int i = 0; i < YearCount; i++) {
            for (int j = 0; j < totalScoreCount; j++) {
                scores[i][j] = 80 + Math.random() * 20;
                System.out.println("第" + (i + 1) + "年的" + names[i] + "成绩为" + scores[i][j]);
            }
        }

        while (true) {
            System.out.println("请输入要进行的操作编号");
            System.out.println("1: 求某年最好成绩\n" +
                    "2: 求某年的平均成绩\n" +
                    "3: 求所有年份最好成绩\n" +
                    "4: 求某门课历年最好成绩");
            int Order = in.nextInt();
            switch (Order) {
                case 1:
                    int BestScore = 0;
                    System.out.println("请输入查询哪一年的");
                    int year = in.nextInt() - 1;
                    if (year < 0 || year >= YearCount){
                        System.out.println("非法的年份");
                        break;
                    }
                    for (int i=0;i<scores[year].length;i++){
                        if(scores[year][BestScore]< scores[year][i] ){
                            BestScore = i;
                        }
                    }
                    System.out.println("第"+ (year+1) +"最好的成绩是" + names[year]+":"+scores[year][BestScore]);
                        break;
                case 2:
                    System.out.println("请输入求哪一年的平均成绩");
                    int year2 = in.nextInt()-1;
                    if (year2 < 0 || year2 >= YearCount){
                        System.out.println("非法的年份");
                        break;
                    }
                    double totalScore = 0;
                    for(int i=0; i< scores[year2].length;i++){
                       totalScore += scores[year2][i];
                    }
                    System.out.println("第"+ (year2+1)+"的平均成绩是"+(totalScore / names.length));
                    break;
                case 3:
                     int BestOfYearsBest = 0;
                     int year3 =0;
                     for( int i=0;i< scores.length;i++){
                         for(int j=0; j<scores[i].length;j++){
                            if(scores[year3][BestOfYearsBest] < scores[i][j]){
                                year3 =i;
                                BestOfYearsBest =j;
                            }
                         }
                     }
                    System.out.println("历年成绩最好的月份是" + year3 +"年的" + names[BestOfYearsBest]+ "成绩为" + scores[year3][BestOfYearsBest]);
                     break;



            }
        }
    }
}
