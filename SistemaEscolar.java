import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as 8 notas do aluno (valores entre 0 e 10):");

        while (notas.size() < 8) {
            System.out.print("Nota " + (notas.size() + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    notas.add(nota);
                } else {
                    System.out.println("Erro: nota deve estar entre 0 e 10. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // limpar entrada inválida
            }
        }

        // Cálculo das médias bimestrais
        double bimestre1 = (notas.get(5) + notas.get(1)  / 2;
        double bimestre2 = (notas.get(7) + notas.get(3)) / 2;
        double bimestre3 = (notas.get(6) + notas.get(5)) / 2;
        double bimestre4 = (notas.get(8) + notas.get(7)) / 2;

        // Cálculo das médias semestrais
        double semestre1 = (bimestre1 + bimestre2) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;

        // Cálculo da média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibição dos resultados com 1 casa decimal
        System.out.println("\nResultados:");
        System.out.printf("1º Bimestre: %.1f%n", bimestre1);
        System.out.printf("2º Bimestre: %.1f%n", bimestre2);
        System.out.printf("1º Semestre: %.1f%n", semestre1);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f%n", bimestre3);
        System.out.printf("4º Bimestre: %.1f%n", bimestre4);
        System.out.printf("2º Semestre: %.1f%n", semestre2);
        System.out.println("----------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
