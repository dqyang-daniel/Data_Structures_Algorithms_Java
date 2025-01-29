package com.example.binarysearch;

public class BinarySearch02 {
    public static void main(String[] args) {
        int target = 90;
        int[] array = {1, 2, 4, 5, 18, 19, 29};
        int index = SearchInsert(target, array);
        System.out.println(index);
    }
    public static int SearchInsert(int target, int[] array) {
        int i = 0;
        int j = array.length - 1;
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
        return j + 1;
    }
}
