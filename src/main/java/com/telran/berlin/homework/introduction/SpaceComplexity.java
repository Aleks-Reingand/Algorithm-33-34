package com.telran.berlin.homework.introduction;

public class SpaceComplexity {
    public static void main(String[] args) {

        /*
        1. Linear Search
	        Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[].
	        Алгоритм:
	        Шаг 1: Обойти массив
	        Шаг 2: Сравнить данный элемент x с элементами в массиве
	        Шаг 3: Если найден верни индекс элемента
	        Шаг 4: Если элемен не найден верни -1


	    2. Find the element that appears once in a sorted array
	        Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.

         */
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {  // traverse the array
            if (arr[i] == key) { // match the key element with array element
                return i; // return index
            }
        }
        return -1; // not found element
    }
    // space complexity O(1)
    // best tc O(1)
    // average tc O(n/2)
    // worst tc O(n)

    // time complexity O(n)

    public static int findElement(int arr[]) {
        int size = arr.length;

        if (size == 1) {
            return arr[size - 1];
        }

        if (arr[size - 2] != arr[size - 1]) {
            return arr[size - 1];
        }

        for (int i = 0; i < size; i = i + 2) { //
            if (arr[i] != arr[i + 1]) { // 1
                return arr[i]; // 1
            }
        }

        return -1;
    }
    // space complexity O(1)
    // time complexity O(n)

    // += , -= ,
    // i += 2 -> i = i + 2
    // i -= 2 -> i = i - 2
    // i += 10 -> i = i + 10


}
