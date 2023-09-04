import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        if (saldoTotal >= valorSaque) {

            int saldoAtulizado = calcularSaldoAtualizado(saldoTotal, valorSaque);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoAtulizado);

        } else {

            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }

        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    }

    private static int calcularSaldoAtualizado(int saldoAtual, int valorRetirada) {

        saldoAtual -= valorRetirada;
        return saldoAtual;
    }
}