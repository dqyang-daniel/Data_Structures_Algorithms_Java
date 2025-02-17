package com.example.binarysearch;

public class BinarySearch04 {
    public static void main(String[] args) {
        int x = 120;
        int root = sqrt(x);
        System.out.println(root);
    }
    public static int sqrt(int x){
        int i = 0;
        int j = x;
        while(i < j) {
            int m = (i + j) / 2;
            if (m * m < x) {
                i = m + 1;
            } else if (m * m > x) {
                j = m - 1;
            } else {
                return m;
            }
        }
        return j;
    }
}
