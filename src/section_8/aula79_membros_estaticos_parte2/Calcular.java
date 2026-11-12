package section_8.aula79_membros_estaticos_parte2;

public class Calcular {

    public final double IOF = 0.06;

    public double dolarParaReal(double quantidade, double cotacao) {
        return quantidade * cotacao * (1.0 + IOF);
    }
}
