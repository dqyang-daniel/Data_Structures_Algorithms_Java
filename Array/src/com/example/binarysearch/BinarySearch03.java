package com.example.binarysearch;

public class BinarySearch03 {
    public static void main(String[] args) {
        int target = 6;
        int[] array = {1,2,3,6,6,7};
        int[] index = SearchInsert(target, array);
    }

    public static int[] SearchInsert(int target, int[] array) {
        int i = 0;
        int j = array.length - 1 ;
        while (i <= j) {
            int m = (i + j) / 2;
            if (target < array[m]) {
                j = m - 1;
            } else if (array[m] < target) {
                i = m + 1;
            } else {

            }
        }
    }

}
