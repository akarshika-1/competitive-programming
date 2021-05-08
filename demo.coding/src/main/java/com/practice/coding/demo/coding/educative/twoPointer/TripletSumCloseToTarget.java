package com.practice.coding.demo.coding.educative.twoPointer;

import java.util.Arrays;

public class TripletSumCloseToTarget {

    public static int findTriplet(int[] a, int targetSum) {
        if (a == null || a.length < 2) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(a);
        int smallestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 2; i++) {
            int left = i + 1;
            int right = a.length - 1;
            while (left < right) {
                int targetDiff = targetSum - a[i] - a[left] - a[right];
                if (targetDiff == 0) {
                    return targetSum;
                }

                if (Math.abs(targetDiff) < Math.abs(smallestDiff) ||
                        (Math.abs(targetDiff) == Math.abs(smallestDiff) && targetDiff > smallestDiff)) {
                    smallestDiff = targetDiff;
                }

                if(targetDiff>0){
                    left++;
                }
                else{
                   right--;
                }
            }
        }
        return targetSum - smallestDiff;
    }

    public static void main(String[] args) {
        System.out.println(findTriplet(new int[]{-2, 0, 1, 2}, 2));
        System.out.println(findTriplet(new int[]{-3, -1, 1, 2}, 1));
        System.out.println(findTriplet(new int[]{1, 0, 1, 1},100));

    }
}
