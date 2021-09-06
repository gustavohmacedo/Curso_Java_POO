package secao_4_Introducao_POO.exercicioOne.entidades;

public class Triangulo {

    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double calculaArea() {
        //fórmula de Heron):
        double p = (ladoA + ladoB + ladoC) / 2.0;

        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

}
