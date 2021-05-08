package com.practice.coding.demo.coding.educative.twoPointer;

public class CompareStringWithBackspaces {
    public static boolean compare(String s1, String s2){
        int i1= s1.length()-1;
        int i2 = s2.length()-1;
        while(i1>=0 && i2>=0){
            i1 = compareString(s1, i1);
            i2 = compareString(s2, i2);
            if(i1<0 && i2<0)
                return true;
            if(i1<0 || i2<0)
                return false;
            if(s1.charAt(i1)!=s2.charAt(i2))
                return false;
            i1=i1-1;
            i2=i2-1;
        }
        return true;
    }

    public static int compareString(String s, int i){
        int backspaceCount=0;
        while(i>=0){
            if(s.charAt(i)=='#'){
                backspaceCount++;
            }else if(backspaceCount>0){
                backspaceCount--;
            }else{
                break;
            }
            i--;
        }
        return i;
    }

    public static void main(String[] args){
        System.out.println(compare("xy#z", "xyz#"));
        System.out.println(compare("xp#", "xyz##"));
        System.out.println(compare("xywrrmp", "xywrrmu#p"));
    }
}
