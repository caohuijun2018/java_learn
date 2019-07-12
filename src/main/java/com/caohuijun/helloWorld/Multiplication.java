package com.caohuijun.helloWorld;

/*public class com.caohuijun.helloWorld.Multiplication {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            String line="";
            for(int j=1;j<=9;j++){
                line=i+"*"+j+"="+i*j;
            }
            System.out.println(line);
        }
    }
}*/
public class Multiplication {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= 9; j++) {
                if (i < j) {
                    break;
                }
                line = line + j + "*" + i + "=" + (j * i) + "\t";
            }
            System.out.println(line);
        }
    }
}
