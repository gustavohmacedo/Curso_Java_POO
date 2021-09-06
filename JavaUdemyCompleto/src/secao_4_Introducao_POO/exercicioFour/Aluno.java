package secao_4_Introducao_POO.exercicioFour;

public class Aluno {
    public String nomeDoAluno;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;


    public double calcularNotaFinal() {

        return notaPrimeiroTrimestre + notaSegundoTrimestre
                + notaTerceiroTrimestre;
    }

    public void calcularAprovacao() {

        if (calcularNotaFinal() >= 60) {
            System.out.println("Parabéns! Você está aprovado.");

        } else {
            System.out.println("Aluno, você está reprovado.");
            System.out.println("Pontos que faltam para aprovação: " + (60 - calcularNotaFinal()));

        }

    }

    @Override
    public String toString() {
        return "\nNome: " + nomeDoAluno + ", " +
                "Nota 1: " + String.format("%.2f", notaPrimeiroTrimestre) + ", " +
                "Nota 2: " + String.format("%.2f", notaSegundoTrimestre) + ", " +
                "Nota 3: " + String.format("%.2f", notaTerceiroTrimestre) + "\n";
    }
}
