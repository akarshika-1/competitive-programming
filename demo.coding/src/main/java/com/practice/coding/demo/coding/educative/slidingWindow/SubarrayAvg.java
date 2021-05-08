package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.Arrays;

public class SubarrayAvg {

    public static double[] subarravg(double[] a, int k){
        double[] result = new double[a.length-k+1];
        int st = 0;
        double wsum = 0;
        for(int we=0;we<a.length;we++){
            wsum += a[we];
            if(we>= k-1){
                result[st] = wsum/k;
                wsum -= a[st];
                st++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        double[] input = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        System.out.println(Arrays.toString(subarravg(input,5)));
    }
}
