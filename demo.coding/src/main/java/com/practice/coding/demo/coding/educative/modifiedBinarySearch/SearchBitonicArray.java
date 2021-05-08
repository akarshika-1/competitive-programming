package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class SearchBitonicArray {

    public static int findKey(int[] a, int key){
        int maxIndex = maxIndex(a);
        int keyIndex = binarySearch(a, key, 0, maxIndex);
        if(keyIndex != -1){
            return keyIndex;
        }
        return binarySearch(a, key, maxIndex+1, a.length-1);
    }

    public static int maxIndex(int[] a){
        int start = 0;
        int end = a.length-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if(a[mid]>a[mid+1]){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }

    private static int binarySearch(int[] a, int key, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(key==a[mid]){
                return mid;
            }else if(a[mid]<a[mid+1]){
                if(key>a[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(key<a[mid]){
                    start = mid +1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(findKey(new int[]{1, 3, 8, 4, 3}, 4));
        System.out.println(findKey(new int[]{3,8,3,1}, 8));
        System.out.println(findKey(new int[]{1,3,8,12}, 12));
        System.out.println(findKey(new int[]{10, 9, 8}, 10));
    }
}
