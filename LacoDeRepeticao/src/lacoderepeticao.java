import java.util.Scanner;

public class lacoderepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1, resultado;

        do {
            System.out.println("Escolha uma número abaixo Digite \n1: Continuar \n2: Sair");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("digite um número para saber seu a tabuada.");
                n1 = sc.nextInt();

                int vezes = 0;

                while (vezes <= 9) {
                    vezes++;
                    resultado = n1 * vezes;
                    System.out.println(n1 + "X" + vezes + "=" + resultado);
                }

            } else if (n > 2 || n < 0) {
                System.out.println("Opção inválida!");
            }

        }while (n != 2);

        System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");

    }
}
