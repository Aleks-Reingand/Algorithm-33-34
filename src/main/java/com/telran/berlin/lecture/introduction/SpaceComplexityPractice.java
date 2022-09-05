package com.telran.berlin.lecture.introduction;

import java.util.Arrays;

public class SpaceComplexityPractice {
    /*
    START
    step 1: get array and key number
    step 2: start form the left element into array
    step 3: compare each element with key
    step 4: if key == element return true, else return false
    END
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 0 }; // 1
        int key = 6; // 1
        System.out.println("number is " + hasNumber(arr, key));

        String[] arrayNames = {"Aleks", "Thea", "Thomas", "Sergey"}; // 1
        System.out.println(Arrays.toString(getNames(arrayNames)));
    }

    private static String[] getNames(String[] arrayNames) { // 1
        String[] names = new String[arrayNames.length]; // 1
        for (int i = 0; i < arrayNames.length; i++) {
            names[i] = arrayNames[i]; // n
        }
        System.out.println(names == arrayNames);
        System.out.println(names[0] == arrayNames[0]);
        return names;
    }

    // space complexity = arr[] = 1, key = 1
    // S(A) = 1 + 1 + 1 = S(A) = 3.
    // space complexity = S(A) = 1
    // (1 + 1) + ((1+1) * n) = 4n = 1n = n -> S(A) = n
    private static boolean hasNumber(int[] arr, int key) { // 1 , 1
        int res = 0; // 1

        for (int i = 0; i < arr.length; i++) { // 1
//            int temp = arr[i]; // -> n (i < length) n * length
            res = arr[i];
            if (res == key) {
                return true;
            }
        }
        return false;
    }


    // C - constant part
    // SP - space value part
    // I - type element
    // S(A) = C + SP(I)


}
