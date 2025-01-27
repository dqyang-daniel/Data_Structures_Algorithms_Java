package com.example.binarysearch;

import java.util.Arrays;
public class BinarySearch01 {
    public static void main(String[] args) {
        int target = 15;
        int[] array = {15};
        System.out.println("The target is " + target);
        System.out.println("The array is " + Arrays.toString(array));
        int index = BinarySearchBasic(target, array);
        if (index == -1) {
            System.out.println("Target does not exist in the array.");
        } else {
            System.out.println("The index of target in the array is " + index + ".");
        }
    }
    public static int BinarySearchBasic(int target, int[] array) {
        int i = 0;
        int j = array.length - 1;

        while(i <= j) {
            int m = (i + j) / 2;
            if (target < array[m]) {
                j = m - 1;
            } else if(array[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
