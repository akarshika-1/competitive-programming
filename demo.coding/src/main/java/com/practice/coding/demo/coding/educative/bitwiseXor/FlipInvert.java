package com.practice.coding.demo.coding.educative.bitwiseXor;

public class FlipInvert {

    public static void flipAndInvert(int[][] a){
        int c = a[0].length;
        for(int[] row : a){
            for(int i=0; i<(c+1)/2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[c-1-i]^1;
                row[c-1-i] = temp;
            }
        }
        print(a);
    }

    public static void print(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        flipAndInvert(new int[][]{{1,0,1}, {1,1,1}, {0,1,1}});
        flipAndInvert(new int[][]{{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}});
    }
}
