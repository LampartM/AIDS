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
public class Symbol_newtona {

    public static void main(String[] args) {
        System.out.println(Newton(5, 3));
    }

    public static long Newton(int n, int k) {
        int[][] tab = new int[k + 1][n + 1];

        for (int i = 0; 1 < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (j == 0) {
                    tab[i][j] = -1;
                } else if (j < i) {
                    tab[i][j] = -1;
                } else if (i == j || i == 0) {
                    tab[i][j] = -1;
                }
            }
        }
        for(int i=1; i<tab.length;i++){
            for(int j = i+1;j<tab[0].length; j++){
                tab[i][j]=tab[i-1][j-1]+tab[i][j-1];
            }
        }
        
        return tab[k][n];
        

    }
}

//Uzywajac metody dynamicznej rozwiazac program decyzyjnego cos tam... - 2.4.1
