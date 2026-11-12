package section_8.aula77_exercicios_de_fixacao;

public class exercicio2_class {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    
    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }
}
