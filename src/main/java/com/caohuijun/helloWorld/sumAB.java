package com.caohuijun.helloWorld;

public class sumAB {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15};
        for(int i=0;i<=nums.length;i++){
            for(int j=i;j<=nums.length;j++){
                if(nums[i] + nums[j]== 9 && i != j ){
                    int a[] = {i, j};
                    System.out.println(a);
                }
            }
        }
    }

}

