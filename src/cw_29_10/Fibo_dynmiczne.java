/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw_29_10;

/**
 *
 * @author student
 */
public class Fibo_dynmiczne {

    public static void main(String[] args) {
        final int N = 5; // n-ty wyraz ciągu
        System.out.println("F(N) = " + fibo(N));
    }

    static int fibo(int n) {
        int[] tab = new int[n];
        tab[0] = 1;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[tab.length - 1];
    }
}
