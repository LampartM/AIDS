/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw_22_10;

/**
 *
 * @author student
 */
public class Fibonacci {

    public static int fib(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("F(5) " + fib(n));

    }
}
