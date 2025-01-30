package com.example.binarysearch;

public class BinarySearch05 {
    public static void main(String[] args) {
        int num = 168;
        int index = findroot(num);
        if (index == -1) {
            System.out.println(num + " is not a perfect square");
        } else {
            System.out.println(num+" is a prefect square, whose root is:" + index);
        }
    }
    public static int findroot(int num){
        int i = 0;
        int j = num;
        while (i <= j){
            int m = (i + j) / 2;
            if (m * m < num){
                i = m + 1;
            } else if (m * m > num) {
                j = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
