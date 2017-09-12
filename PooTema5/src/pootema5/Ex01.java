/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootema5;

import java.util.Stack;

/**
 *
 * @author 50enta
 */
public class Ex01 {

    /**
     * Recebe um número inteiro e retorna em binário
     *
     * @param numero
     * @return numeroBinario
     */
    public static String converter(int numero) {
        if (numero == 1 || numero == 0) {
            return Integer.toString(numero);
        }
        return converter(numero / 2) + Integer.toString(numero % 2);
    }

    public static void main(String[] args) {
        System.out.println(converter(13));
    }
}
