import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");


        double valorInicial = scanner.nextDouble();


        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        valorInicial = calculoJurosAnual(valorInicial, taxaJuros,periodo );

        double valorFinal = valorInicial;


        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        System.out.println("Valor final do investimento: R$:  " + new DecimalFormat("0.##").format(valorFinal));

        scanner.close();
    }

    public static double calculoJurosAnual(double valorEmprestimo, double jurosAnual, int periodoCalculo){

        double montante = valorEmprestimo * Math.pow((1 + jurosAnual), periodoCalculo);

        return montante;

    }
}