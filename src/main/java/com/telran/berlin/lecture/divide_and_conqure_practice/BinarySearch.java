package com.telran.berlin.lecture.divide_and_conqure_practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr1 = {20, 3, 46, 10, 40};
//
//        int[] arr2 = {90, 30, 50, 50, 100, 66, 66, 66}; // 30, 50, 50, 66, 66, 66, 90, 90, 100
//
//        int key1 = 10;
//        int leftIdx = 0;
//        int rightIdx = arr1.length - 1;
//
//        System.out.println("linear = " + linearSearch(arr1, leftIdx, rightIdx, key1)); // idx = 3
//
//        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//
//        System.out.println("binary = " + binarySearch(arr1, leftIdx, rightIdx, key1)); // idx = 1
//
//
//        System.out.println("linear arr2 = " + linearSearch(arr2, 0, arr2.length - 1, 66)); // idx = 5
//
//        Arrays.sort(arr2); // 30, 50, 50, 66, 90, 100
//
//        System.out.println(binarySearch(arr2, 0, arr2.length - 1, 66)); // idx = 3


        ////
        int[] arr = getFilledArr(1000);
        long timeStart = System.currentTimeMillis();
        // call linearSearch
        linearSearch(arr, 0, arr.length - 1, 999);
        System.out.println(System.currentTimeMillis() - timeStart);

        timeStart = System.currentTimeMillis();
        // call binarySearch
        binarySearch(arr, 0, arr.length - 1, 999);
        System.out.println(System.currentTimeMillis() - timeStart);
    }

    private static int[] getFilledArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static int linearSearch(int[] arr, int leftIdx, int rightIdx, int key) {

        for (int i = leftIdx; i <= rightIdx; i++) { // O(n)
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] arr, int leftIdx, int rightIdx, int key) {
        // если rightIdx == leftIdx return -1;
        // ищем середину medIdx
        // если key == medIdx возвращаем средний индекс
        // если key больше чем medIdx запускаем рекурсию на правую половину, меняет левый на средний
        // иначе key меньше - меняем правый на средний

        if (rightIdx >= leftIdx) {
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2; // search middle index into array

            if (arr[midIdx] == key) {
                return midIdx; // O(1)
            }

            if (arr[midIdx] > key) {
                return binarySearch(arr, leftIdx, midIdx - 1, key);
            }
            return binarySearch(arr, midIdx + 1, rightIdx, key);
        }

        return -1;
    }
}
