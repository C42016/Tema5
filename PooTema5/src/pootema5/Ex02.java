/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootema5;

/**
 *
 * @author 50enta
 */
public class Ex02 {

    public static int multiplicar(int a, int b) {

        if (b == 1) {
            return a;
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiplicar(2, 3));
    }
}
