package section_6.aula51_debug_no_java;

public class TesteDebug {
    public static void main(String[] args) {

        // 1) Breakpoint aqui e use F10 (Step Over) para ver soma e i mudando
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 5 = " + soma);

        // 2) Breakpoint aqui e use F11 (Step Into) para entrar no método dobro
        int resultado = dobro(soma);
        System.out.println("Dobro = " + resultado);

        // 3) Veja o if decidir: observe a variável numero no painel Variables
        int[] numeros = {3, 8, 5, 12, 7};
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("Maior numero = " + maior);

        // 4) Este cálculo tem um bug de propósito: a média deveria ser 7.0
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        double media = total / numeros.length;
        System.out.println("Media = " + media);
    }

    public static int dobro(int x) {
        // Use Shift+F11 (Step Out) para voltar ao main
        int r = x * 2;
        return r;
    }
}
