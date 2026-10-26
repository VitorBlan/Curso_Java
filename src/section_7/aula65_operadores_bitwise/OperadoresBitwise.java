package section_7.aula65_operadores_bitwise;

import java.util.Scanner;

/*
 * Aula 65 - Operadores bitwise
 *
 * RESUMO
 * Operadores bitwise trabalham diretamente nos BITS (0 e 1) dos números
 * inteiros (byte, short, int, long, char). Eles comparam os números
 * bit a bit, posição por posição.
 *
 *   Operador | Significado
 *   ---------+-----------------------------------
 *      &     | Operação "E" bit a bit
 *      |     | Operação "OU" bit a bit
 *      ^     | Operação "OU-exclusivo" (XOR) bit a bit
 *
 * Tabelas verdade (1 = V, 0 = F):
 *
 *   C1 C2 | E (&)     C1 C2 | OU (|)     C1 C2 | XOR (^)
 *   0  0  |  0        0  0  |  0         0  0  |  0
 *   0  1  |  0        0  1  |  1         0  1  |  1
 *   1  0  |  0        1  0  |  1         1  0  |  1
 *   1  1  |  1        1  1  |  1         1  1  |  0
 *
 * Resumindo:
 *   &  -> 1 só se os DOIS bits forem 1
 *   |  -> 1 se PELO MENOS UM bit for 1
 *   ^  -> 1 se os bits forem DIFERENTES
 *
 * Demo com 89 e 60:
 *
 *        89 = 0101 1001
 *        60 = 0011 1100
 *   ----------------------
 *   89 & 60 = 0001 1000  -> 24
 *   89 | 60 = 0111 1101  -> 125
 *   89 ^ 60 = 0110 0101  -> 101
 *
 * APLICAÇÃO COMUM: verificar se um bit está ligado (máscara)
 * Faz-se um & com um número que só tem o bit desejado em 1.
 * Se o resultado for 0, o bit está desligado; senão, está ligado.
 *
 *    89 = 0101 1001          113 = 0111 0001
 *    32 = 0010 0000           32 = 0010 0000
 *    &  = 0000 0000 -> 0      &  = 0010 0000 -> 32
 *    (6º bit desligado)       (6º bit ligado)
 *
 * Observação: && e || são operadores LÓGICOS (boolean, com curto-circuito).
 * Já & | ^ com inteiros operam bit a bit.
 */
public class OperadoresBitwise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2); // 24
        System.out.println(n1 | n2); // 125
        System.out.println(n1 ^ n2); // 101

        // Verificando se o 6º bit (valor 32) está ligado
        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("O 6º bit está ligado");
        } else {
            System.out.println("O 6º bit está desligado");
        }

        sc.close();
    }
}
