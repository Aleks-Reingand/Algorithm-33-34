package com.telran.berlin.lecture.big_O_practice;

public class BigOpractice {
    public static void main(String[] args) {

    }

    /*
    1 единуцу времени на арифметические операции и логические операции
    1 единуцу времени для операторов присваивания и возврата
     */
    public static int sum(int one, int two) {
        int result = one + two; // 1 + 1
        return result; // 1
    }
    // (Tsum) = 1+1+1 = 3
    // O(3) -> 3 is constant
    // Time complexity = O(1)

    // examples cut constants
    // 4n^3 = O(n^3)
    // n^2+n = O(n^2)
    // log2(n), log10(n) = O(log n)

    public static int listSum(int[] arr) { // [1, 2, 3, 4, 5] n = 5 [1,2,3,4,5........10000] n = 10000 n = 1000 n = 10
        int result = 0; // cost 1, times = 1
        for (int i = 0; i < arr.length / 2; i = i + 1) { // cost 4, times = n/2 + 1  equal i + 1
            result = result + arr[i]; // cost 2, times = i == n
        }
        return result; // cost 1, times 1
    }

    // (TlistSum) = 1*1 + 4*(n+10) + 2*n + 1*1 = 1 + 4n + 10 + 2n + 1 = 6n + 6 = O(16*n + 6) = O(n)

    public static void bubleFor(int n) {
        for (int i = 0; i <= n / 3; i++) { // O(n/3)
            for (int j = 1; j <= n; j = j * 6) { // O(n/6) = n = 36 -> 36 / 6  1*6 = 6, 6*6 = 36
                System.out.println(" !");
            }
        }
    }
}
