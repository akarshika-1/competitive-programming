package com.practice.coding.demo.coding.educative.fastSlow;

public class CycleInACircularArray {

    public static boolean hasCycle(int[] a){
        for(int i=0; i<a.length; i++){
            boolean isForward = a[i]>=0;
            int fast = i;
            int slow = i;
            do{
                slow = nextIndex(a, isForward, slow);
                fast = nextIndex(a,isForward, fast);
                if(fast!=-1){
                    fast = nextIndex(a, isForward, fast);
                }
            }while (slow!=-1 && fast != -1 && fast != slow);
            if(slow!=-1 && slow==fast){
                return true;
            }
        }
        return false;
    }

    private static int nextIndex(int[] a, boolean isForward, int currIndex){
        boolean direction = a[currIndex]>=0;
        if(isForward!=direction){
            return -1;
        }
        int nextIndex = (currIndex+a[currIndex])%a.length;
        if(nextIndex<0){
            nextIndex += a.length;
        }
        if(nextIndex==currIndex){
            return -1;
        }
        return nextIndex;
    }

    public static void main(String[] args){
        System.out.println(hasCycle(new int[]{1,2,-1,2,2}));
        System.out.println(hasCycle(new int[]{2,2,-1,2}));
        System.out.println(hasCycle(new int[]{2,1,-1,-2}));

    }
}
