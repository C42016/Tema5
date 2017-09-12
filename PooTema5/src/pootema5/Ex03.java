package pootema5;

/**
 *
 * @author 50enta
 */
public class Ex03 {

    /**
     * Interface netre o método recursivo e o usuário
     *
     * @param a
     * @return soma
     */
    public static int somar(String a) {
        return somar(a, a.length() - 1);
    }

    /**
     * Dado uma String de valores, este método retorna a soma dos valores
     * contidos na String.
     *
     * @param a - String com os valores
     * @param pos - posição a analisar
     * @return soma
     */
    public static int somar(String a, int b) { //recebe a String do conteúdo e o índice do último elemento
        if (b == 0) {
            return Integer.parseInt(Character.toString(a.charAt(b))); //retorna o primeiro elemento
        } else {
            return Integer.parseInt(Character.toString(a.charAt(b))) + somar(a, b - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println(somar("12"));
    }
}
