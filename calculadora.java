import java.util.Scanner;

class Calculadora {
    private double numeroUm;
    private double numeroDois;

    public Calculadora(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public String dividir() {
        if (numeroDois == 0) {
            return "Impossível realizar uma divisão por zero.";
        } else {
            return "Resultado: " + (numeroUm / numeroDois);
        }
    }

    public double potencia() {
        if (numeroDois == 0) {
            return 1;
        }
        return Math.pow(numeroUm, numeroDois);
    }

    public String raizQuadrada() {
        if (numeroUm < 0) {
            return "Não existe raiz de número negativo.";
        } else {
            return "Resultado: " + Math.sqrt(numeroUm);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner computador = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Informe o primeiro número: ");
            double numeroUm = computador.nextDouble();

            System.out.println("Informe o segundo número: ");
            double numeroDois = computador.nextDouble();

            Calculadora calc = new Calculadora(numeroUm, numeroDois);

            System.out.println("Escolha a operação:");
            System.out.println("[1] - Adição");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[5] - Potência");
            System.out.println("[6] - Raiz quadrada do primeiro número");
            System.out.println("Digite 'Q' para sair.");

            opcao = computador.next();

            switch (opcao.toUpperCase()) {
                case "1":
                    System.out.println("Resultado: " + calc.somar());
                    break;
                case "2":
                    System.out.println("Resultado: " + calc.subtrair());
                    break;
                case "3":
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case "4":
                    System.out.println(calc.dividir());
                    break;
                case "5":
                    System.out.println("Resultado: " + calc.potencia());
                    break;
                case "6":
                    System.out.println(calc.raizQuadrada());
                    break;
                case "Q":
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("----------------------------------------");

        } while (!opcao.equalsIgnoreCase("Q"));

        computador.close();
    }
}