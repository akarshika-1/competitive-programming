package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

class ArrayReader {
    int[] ar;

    ArrayReader(int[] ar) {
        this.ar = ar;
    }

    public int get(int index) {
        if (index >= ar.length) {
            return Integer.MAX_VALUE;
        }
        return ar[index];
    }
}
