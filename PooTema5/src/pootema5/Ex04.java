package pootema5;

/**
 * Exercício 4, do tema sobre recursividade
 * @author 50enta
 */
public class Ex04 {

    /**
     * método que faz a interface entre o usuário e o método recursivo privado,
     * facilita o uso, dado que o método recursivo com a mesma assinatura exige
     * muitos parâmetros, o que pode complicar a vida do utilizador
     *
     * @param a
     * @param chave
     * @return
     */
    public static int calcular(Long a, int chave) {
        String n = a.toString();
        return calcular(n, chave, n.length() - 1, 0);
    }

    /**
     * Método recursivo, que dado um número e uma chave, retorna o número de
     * repetições da chae o número caso não se registe nenhuma ocorrência, o
     * retorno é o tradicional -1
     *
     * @param a
     * @param chave
     * @param length
     * @param ocorrencia
     * @return ocorrencia
     */
    private static int calcular(String a, int chave, int length, int ocorrencia) {

        if (Integer.parseInt(Character.toString(a.charAt(length))) == chave) {
            ocorrencia++;
        }
        if (length == 0) {
            return ocorrencia;
        }
        return calcular(a, chave, length - 1, ocorrencia);
    }

    /**
     * Método main - para testes
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(calcular(333L, 3));
    }
}
