/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad2_1_1;

/**
 *
 * @author Maciek
 */
public class zad2_1_1 {

    public static void main(String[] args) {
        int x = 6;
        int maxV = 10;
        int[] V = {6, 2, 3, 2, 3, 1};
        int[] W = {6, 4, 5, 7, 10, 2};
        int maxW = 0;
        int v;
        int w;
        int a, b, c, d, e, f;
        int[] tab = new int[x];
        for (a = 0; a <= 1; a++) {
            for (b = 0; b <= 1; b++) {
                for (c = 0; c <= 1; c++) {
                    for (d = 0; d <= 1; d++) {
                        for (e = 0; e <= 1; e++) {
                            for (f = 0; f <= 1; f++) {
                                v = a * V[0] + b * V[1] + c * V[2] + d * V[3] + e * V[4] + f * V[5];
                                if (v <= maxV) {
                                    w = a * W[0] + b * W[1] + c * W[2] + d * W[3] + e * W[4] + f * W[5];
                                    if (w > maxW) {
                                        maxW = w;
                                        tab[0] = a;
                                        tab[1] = b;
                                        tab[2] = c;
                                        tab[3] = d;
                                        tab[4] = e;
                                        tab[5] = f;

                                    }
                                }

                            }

                        }
                    }
                }
            }
            System.out.println("Wartosc w plecaku: " + maxW);
            System.out.println("Przedmioty w plecaku to: ");
            for (int i = 0; i < x; i++) {
                if (tab[i] == 1) {
                    System.out.println(i + "");
                }
            }
            System.out.println();
        }

    }

}
