package com.example.binarysearch;

import java.util.Arrays;

public class BinarySearch03 {
    public static void main(String[] args) {
        int target = 6;
        int[] array = {1,2,3,6,6,7};
        int index = SearchInsert(target, array);
        int[] index_array = new int[2];
        if (index == -1) {
            index_array = new int[]{-1, -1};
        } else {
            int left = index;
            int right = index;
            while (left >= 0 && array[left]==target) {
                left--;
            }
            while (right <= array.length && array[right]==target) {
                right++;
            }
            index_array = new int[]{left+1,right-1};
        }
        System.out.println("The index is:"+ Arrays.toString(index_array));
    }

    public static int SearchInsert(int target, int[] array) {
        int i = 0;
        int j = array.length - 1 ;
        while (i <= j) {
            int m = (i + j) / 2;
            if (target < array[m]) {
                j = m - 1;
            } else if (array[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

}
