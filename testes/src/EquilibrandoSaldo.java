import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        double saldoAtualizado = calcularSaldoAtualizado(saldoAtual, valorDeposito, valorRetirada);


        System.out.println("Saldo atualizado na conta: " + saldoAtualizado);


        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    }
    private static double calcularSaldoAtualizado(double saldoAtual, double valorDeposito, double valorRetirada){

        saldoAtual += valorDeposito;
        saldoAtual -=valorRetirada;
        return saldoAtual;
    }
}