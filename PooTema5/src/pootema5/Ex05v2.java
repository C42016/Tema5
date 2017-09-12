/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootema5;

import java.util.Vector;

/**
 *
 * @author 50enta
 */
public class Ex05v2 {

    public static long factorial(long n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 7;
        Vector<String> arr = new Vector<String>();
        do {
            String alfabeto = "abcdefghijklmnopkrstuvwxyz";
            String strAformar = "";
            while (strAformar.length() != alfabeto.substring(0, numero).length()) {
                int pos = (int) (Math.random() * numero);
                if (!strAformar.contains(Character.toString(alfabeto.charAt(pos)))) {
                    strAformar += alfabeto.charAt(pos);
                }
            }
            if (!arr.contains(strAformar)) {
                arr.add(strAformar);
            }
        } while (arr.size() != factorial(numero));

        //impressao
        int i = 0;
        for (String a : arr) {
            System.out.println("pos[" + (i++) + "]: " + a);
        }
    }
}
