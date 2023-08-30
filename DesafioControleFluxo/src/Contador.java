import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            if (parametroDois > parametroUm){
                contar(parametroUm, parametroDois);
            }

        } catch (Exception e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroDois < parametroUm) {
            throw new ArithmeticException("O segundo parâmetro deve ser maior que o primeiro");
        }else {
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            System.out.println("Valor da contagem: " + contagem);
            System.out.println("Contando\n");

            for (int i = 0; i < contagem; i++) {

                System.out.println(i);
            }
        }

    }
}