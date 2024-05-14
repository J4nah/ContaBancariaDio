package com.janaina.contaBancaria;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

		double saldo;
		String nomeCliente;
		int numero;
		String agencia;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número da Agência:");
		agencia = scanner.nextLine();

		System.out.println("Digite o número da Conta:");
		numero = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Digite o Nome do Cliente:");
		nomeCliente = scanner.nextLine();

		System.out.println("Digite o Saldo:");
		saldo = scanner.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
		
		scanner.close();
	}
}