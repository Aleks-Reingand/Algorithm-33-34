package com.telran.berlin.lecture.merge_sort_practice;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // mergeSort(arr) - method that sort arr using merge()
        // merge(arr, leftArr, rightArr) - merges two subarrays

        int[] arr = {15, 21, 13, 23, 44, 67};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int lengthArr = arr.length; // array length
        if (lengthArr == 1) { // base case
            return;
        }

        int mid = lengthArr / 2; // 3/2=1.5 -> 1
        int[] leftArr = new int[mid]; // size = 1
        int[] rightArr = new int[lengthArr - mid]; // 3 - mid(1) = 2

        // copy elements form arr to left and right
        for(int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for(int i = 0; i < lengthArr - mid; i++) {
            rightArr[i] = arr[i + mid];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        // when we reached base case
        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;

        // контролируем индекс основного массива, левого и правого
        int arrIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftArrLength && rightIndex < rightArrLength) {
            if(leftArr[leftIndex] < rightArr[rightIndex]) {
                arr[arrIndex] = leftArr[leftIndex];
                arrIndex++;
                leftIndex++;
            } else {
                arr[arrIndex] = rightArr[rightIndex];
                arrIndex++;
                rightIndex++;
            }
        }

        while (leftIndex < leftArrLength) {
            arr[arrIndex] = leftArr[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        while (rightIndex < rightArrLength) {
            arr[arrIndex] = rightArr[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}
