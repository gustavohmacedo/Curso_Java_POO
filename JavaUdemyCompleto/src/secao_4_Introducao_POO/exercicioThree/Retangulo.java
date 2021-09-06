package secao_4_Introducao_POO.exercicioThree;

public class Retangulo {
    public double altura;
    public double base;

    public double areaDoRetangulo() {

        return altura * base;
    }

    public double perimetroDoRetangulo() {

        return ((altura + base) * 2);

    }

    public double DiagonalDoRetangulo() {

        return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

    }

    @Override
    public String toString() {
        return "Altura: " + String.format("%.2f", altura) + ", "
                + "Base: " + String.format("%.2f", base);
    }

}
