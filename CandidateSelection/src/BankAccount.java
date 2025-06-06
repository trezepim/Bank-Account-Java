import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o nome do cliente: ");
		String nome = sc.nextLine();

		System.out.println("Informe o número da conta do cliente " + nome + ":");
		int num = sc.nextInt();

		sc.nextLine();

		System.out.println("Informe a agência do cliente " + nome + ":");
		String agencia = sc.nextLine();

		System.out.println("Informe o saldo do cliente " + nome + ":");
		Double saldo = sc.nextDouble();

		System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco.");
		System.out.println("Conta: " + num);
		System.out.println("Sua agência é: " + agencia);
		System.out.println("Seu saldo de R$" + saldo + " já está disponível para saque.");

		sc.close();
	}

}
