//Informar um saldo e imprimir o saldo com reajuste de 1%.

import java.util.Scanner;

public class Saldo {
    public static void main(String[] Args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe saldo atual: ");
        double saldoAtual = input.nextDouble();

        float porcentagem = (float)  1 / 100;

        double reajuste = saldoAtual * porcentagem;

        double saldoReajustado = saldoAtual + reajuste;

        System.out.printf("%.2f", saldoReajustado);
    }
}
