package pootema5;

import java.util.Vector;

/**
 * Exercício número 5, da ficha sobre recursividade - Programação Orientada a
 * Objectos
 *
 * @author 50enta
 */
public class Ex05 {

    /**
     * Calcula o factorial de uma determinado número inteiro n passado por
     * parâmetro
     *
     * @param numero
     * @return factorial
     */
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Método recursivo que recebe o número inteiro n e um Vector para
     * armazenar os valores gerados durante o preenchimento
     *
     * @param numero
     * @param array
     * @return
     */
    public static Vector<String> preencher(int n, Vector<String> vector) {
        if (vector.size() == factorial(n)) {
            return vector;
        }
        String proximaString = preencher(n, new String(""));
        if (!vector.contains(proximaString)) {
            vector.add(proximaString);
        }
        return preencher(n, vector);
    }

    /**
     * Método que recebe uma String e um número inteiro n e preenche o a String
     * com caracteres aleatórios entre os constidos nas n primeiras posições do
     * alfabeto até as n posições da String tendo em conta as restrição de não
     * repetição.
     *
     * @param n
     * @param strAPreencher
     * @return strAPreecnher
     */
    public static String preencher(int n, String strAPreencher) {
        if (n == strAPreencher.length()) {
            return strAPreencher;
        }
        Character caractere = preencher(n);
        if (!strAPreencher.contains(caractere.toString())) {
            strAPreencher += caractere;
        }
        return preencher(n, strAPreencher);
    }

    /**
     * Recebe um parâmetro e retorna um caractere aleatório contido nos n
     * primeiros caracteres do alfabeto
     *
     * @param n
     * @return char
     */
    public static char preencher(int n) {
        String alfabeto = "abcdefghijklmnopkrstuvwxyz";
        return alfabeto.charAt((int) (Math.random() * n));
    }

    
    public static void main(String[] args) {
        int i = 0;
        for (String a : preencher(5, new Vector<>())) {
            System.out.println("pos[" +(i++)+ "]: " + a);
        }
    }
}
