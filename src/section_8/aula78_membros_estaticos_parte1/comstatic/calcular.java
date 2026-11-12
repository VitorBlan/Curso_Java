package section_8.aula78_membros_estaticos_parte1.comstatic;

public class calcular {

    // static: pertence a CLASSE, nao ao objeto
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
