package bankAccount;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		float saldo = 0;
		String nome = "";
		String agencia = "";
		
		System.out.println("Informe o nome do cliente: ");
		nome = sc.next();
		
		System.out.println("Informe o número da conta do cliente " + nome);
		num = sc.nextInt();
		
		System.out.println("Informe a agência do cliente " + nome);
		agencia = sc.next();
		
		System.out.println("Informe o saldo do cliente " + nome);
		saldo = sc.nextFloat();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
		System.out.println("Conta " + num);
		System.out.println("Sua agência é " + agencia);
		System.out.println("Seu saldo de R$" + saldo + " já está disponível para saque.");
		
		sc.close();
	}

}
