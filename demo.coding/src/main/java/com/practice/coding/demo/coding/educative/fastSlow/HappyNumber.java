package com.practice.coding.demo.coding.educative.fastSlow;

public class HappyNumber {

    public static boolean isHappyNumber(int num){
        int fast = num, slow = num;
        do{
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        }while(slow!=fast);
        return slow == 1;
    }

    private static int findSquareSum(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(isHappyNumber(23));
        System.out.println(isHappyNumber(12));
    }


}
