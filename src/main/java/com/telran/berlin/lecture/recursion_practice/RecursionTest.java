package com.telran.berlin.lecture.recursion_practice;

public class RecursionTest {
    public static void main(String[] args) {

//        functionIteration(5);
//        functionRecursion(5);
//        sumRecursion(5, 10);
//        sumIteration(5, 10);
        System.out.println(countConsonantIteration("999"));
        countConsonantRecursion("sos", "sos".length());
    }

    public static int functionIteration(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) { // O(n), O(1)
            res = res + i;
        }
        return res;
    }

    public static int functionRecursion(int n) {
        int res = 0;
        if (n == 1) {
            System.out.println("res = " + res + "; n = " + n);
            return 1;
        }

        res = n + functionRecursion(n - 1); // O(n), O(n)
        System.out.println("res = " + res + "; n = " + n);

        return res;
    }

    public static int sumRecursion(int x, int y) {
        if (x == 0) {
            return y;
        }

        int res = sumRecursion(x - 1, x + y);
        System.out.println("res = " + res + "; x = " + x + "; y = " + y);
        return res;
    }

    public static int sumIteration(int x, int y) {
        for (int i = 0; i < x; i++) {
            y = (x - i) + y;
            System.out.println("x = " + (x - i) + " y = " + y);
        }
        return y;
    }

    // метод подсчета букв в слове
    // метод проверка на согласность букву

    private static boolean isConsonant(char letter) {
        letter = Character.toUpperCase(letter);
        if (letter >= 65 && letter <= 90
                && !(letter == 'A' || letter == 'E' || letter == 'O' || letter == 'U')) {
            return true;
        }
        return false;
    }

    public static int countConsonantIteration(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(isConsonant(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonantRecursion(String str, int length) {
        int count = 0;
        if (length == 1) {
            count = isConsonant(str.charAt(0)) ? 1 : 0;
            return count;
        }
        if (isConsonant(str.charAt(length - 1))) {
            count = countConsonantRecursion(str, length - 1) + 1;
            return count;
        } else {
            count = countConsonantRecursion(str, length - 1);
            return count;
        }
    }
}
