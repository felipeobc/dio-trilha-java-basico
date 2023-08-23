import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        int numero = 0;
        String agencia = null;
        String nomeCliente = "";
        double saldo = 0.0;

        numero = gerador.nextInt(999);
        saldo = gerador.nextDouble(9999);
        System.out.println("Digite o Numero da Agencia: ");
        agencia = sc.nextLine();
        System.out.println("Digite o Nome do Cliete: ");
        nomeCliente = sc.nextLine();

        System.out.println("\"Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo " +String.format("%.2f",saldo)+" já está disponível para saque\"");

    }
}
