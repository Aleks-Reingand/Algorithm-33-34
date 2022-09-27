package com.telran.berlin.homework.time_complexity;

public class Main {
    public static void main(String[] args) {

    }

    // test 1
    void test1(int n) {
        if (n == 1) {
            return;
        }
        for (int i = 1; i <= n; i++) { // cost = 3 times = n
            for (int j = 1; j <= n; j++) { // cost = 3 times = 1
                System.out.println("*");
                break;
            }
        }
    } // best O(1), worst 3(n)*3+1 = O(n)

    // test 2
    void test2(int n) {
        int a = 0;
        int i;
        int j;
        for (i = 0; i < n; i++) { // cost = 3 times = n + 1
            for (j = n; j > i; j--) { // cost = 3 times = (n - 1)/2
                a = a + i + j;
            }
        }
    } // (3+n)*(n-1)/2 = 2*n^2/2 = O(n^2/2)

    // test 3
    void test3(int n) {
        int a = 0;
        int i;
        int j;
        for (i = n / 2; i <= n; i = i + 1) { // cost = 5 times = n/2
            for (j = 2; j <= n; j = j * 2) { // cost = 4 times = (n = 8) (j = 2,4,8) j^x = n = log(n)
                a = a + n / 2;
            }
        }
    } // 5*n/2*4*log(n) = O((5*0.2)n log n) -- O((5*1000)n log n)

    // test 4
    void test4(int n) {
        int a = 0;
        int i = n;
        while (i > 0) { // cost = 1 times = i/2 = n^x (n = 32 = n/2 = 2^4 = 16)
            a += i;
            i /= 2;
        }
    } // 1+n/2^x = O(log n)
}

