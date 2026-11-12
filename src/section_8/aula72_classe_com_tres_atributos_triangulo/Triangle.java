package section_8.aula72_classe_com_tres_atributos_triangulo; /*Entidade do nosso negocios */


public class Triangle {

    public double a;
    public double b;
    public double c;
    

    public double area (){
    
      double p =(a+b+c)/2.0;
      return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}