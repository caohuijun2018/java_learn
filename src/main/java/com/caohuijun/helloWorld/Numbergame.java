package com.caohuijun.helloWorld;

import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalCount = 5;
        int correctTotalCount = 0;
        int leftTotalCount = 5;
        boolean Gameover = false;
        int StartRange = 30;
        int EndRange = 50;


        while (!Gameover) {
            //取一个随机的数

            int mod = EndRange - StartRange;
            double RandomNumber = Math.random();
            int GoalNumber = (int) (RandomNumber * EndRange * 100) % mod;
            GoalNumber += StartRange;
            if (GoalNumber <= StartRange) {
                GoalNumber = StartRange + 1;
            }
            if (GoalNumber >= EndRange) {
                GoalNumber = EndRange - 1;
            }


            System.out.println("开始猜数游戏" + "\n" + "猜数范围为：" + StartRange + "到" + EndRange + ",次数为" + totalCount + "输入-1游戏结束");
            //
            boolean gamestart = true;
            boolean StopGames = false;
            boolean  guesscorrect =false;
            while (leftTotalCount > 0) {
                System.out.println("请输入猜测数字，还有" + leftTotalCount + "次机会");
                int guessNumber = in.nextInt();
                if (guessNumber == -1) {
                    System.out.println("输入非法数字，游戏结束");
                    StopGames = true;
                    break;
                }
                while(gamestart==  true) {
                    gamestart = false;

                }
                if (guessNumber < GoalNumber) {
                    System.out.println("目标数字比输入数字大");
                    leftTotalCount--;

                } else if (guessNumber > GoalNumber) {
                    System.out.println("目标数字比输入的数字小");
                    leftTotalCount--;
                } else if (guessNumber == GoalNumber) {
                    System.out.println("猜测正确，游戏结束");
                    leftTotalCount--;
                    correctTotalCount++;
                    StopGames = true;
                    guesscorrect = true;
                    break;
                }
                leftTotalCount  = 5;
            }
            if ( guesscorrect == false) {
                System.out.println("本次猜测数字为" + GoalNumber + "没有猜测正确");
            }

        }
    }
}
