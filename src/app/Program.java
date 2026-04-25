package app;

import entities.Account;
import exceptions.ExcecaoDeDominio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");

        try {
            System.out.println("Entre com os dados da conta:");
            System.out.print("Número da conta: ");
            Integer numero = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha
            System.out.print("Titular: ");
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            Double limiteDeSaque = sc.nextDouble();

            Account conta = new Account(numero, saldo, titular, limiteDeSaque);

            System.out.println("\nDados da conta criada:");
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: R$ " + String.format("%.2f", conta.getSaldo()));

            System.out.print("\nEntre com o valor para saque: ");
            Double valorSaque = sc.nextDouble();


            conta.saque(valorSaque);
            System.out.println("Novo saldo: R$ " + String.format("%.2f", conta.getSaldo()));
        }catch(InputMismatchException e){
            System.out.println("Erro: Entrada inválida. Por favor, digite um número positivo para o número da conta, saldo e limite de saque.");
        }
        catch (ExcecaoDeDominio e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
