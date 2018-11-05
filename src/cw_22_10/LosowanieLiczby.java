/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw_22_10;

import java.util.Random;


/*
 /* @author student
 */
public class LosowanieLiczby {

    public static int step = 0;
    

    public static void main(String[] args) {
       
        Random rl = new Random();
        int number = rl.nextInt(1001);
        findNumber(0, 1000, number);
    }

    public static void findNumber(int from, int to, int number) {
        step++;
        int polowa = from + (to - from) / 2;

        if (polowa == number) {
            System.out.println("Liczba" + number + "znaleziona po" + step + "krokach.\n");
        } else {
            if (number < polowa) {
                System.out.println(polowa + "za mala");
                findNumber(from, polowa, number);
                
                if (polowa < number) {
                    System.out.println(polowa + "za duza");
                    findNumber(polowa, to, number);
                }
            }
        }
    }
}
