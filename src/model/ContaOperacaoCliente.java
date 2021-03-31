package model;

import java.util.Scanner;

public class ContaOperacaoCliente {

	public static void main(String[] args) {

//Inicio Dados das contas

		ContaCorrente cc01 = new ContaCorrente();
		ContaCorrente cc02 = new ContaCorrente();
		ContaPoupanca cp01 = new ContaPoupanca();
		ContaPoupanca cp02 = new ContaPoupanca();

		// conta corrente 01
		cc01.setAgencia("1020");
		cc01.setNumero(10201);
		cc01.setNomeDono("André Azevedo");
		cc01.setSaldo(1000);
		cc01.setContaAtiva(true);

		// conta poupanca 01
		cp01.setAgencia("1020");
		cp01.setNumero(10201);
		cp01.setNomeDono("André Azevedo");
		cp01.setSaldo(2000);
		cp01.setContaAtiva(true);

		// conta corrente 02
		cc02.setAgencia("1020");
		cc02.setNumero(10202);
		cc02.setNomeDono("Isabel Azevedo");
		cc02.setSaldo(3000);
		cc02.setContaAtiva(true);

		// conta poupanca 02
		cp02.setAgencia("1020");
		cp02.setNumero(10202);
		cp02.setNomeDono("Isabel Azevedo");
		cp02.setSaldo(4000);
		cp02.setContaAtiva(true);

//fim dados das contas

		Scanner entrada01 = new Scanner(System.in);
		System.out.println("Bem vindo ao BlueBank!");
		System.out.println("Digite sua Conta para acessar");
		int infConta01 = entrada01.nextInt();

		if ((cc01.getNumero() != infConta01) && (cc02.getNumero() != infConta01)) {
			System.err.println("Conta inválida");
			// cc01.validarCC(infConta01);
			// cc02.validarCC(infConta01);

		} else {
			Scanner entrada02 = new Scanner(System.in);
			System.out.println("Digite 1 para CC ou 2 para CP");
			int infTipo01 = entrada02.nextInt();
			if ((cc01.getNumero() == infConta01) && (infTipo01 == 1)) {
				cc01.exibirDados();
			}
			if ((cp01.getNumero() == infConta01) && (infTipo01 == 2)) {
				cp01.exibirDados();
			}
			if ((cc02.getNumero() == infConta01) && (infTipo01 == 1)) {
				cc02.exibirDados();
			}
			if ((cp02.getNumero() == infConta01) && (infTipo01 == 2)) {
				cp02.exibirDados();
			}
			
			Scanner entrada03 = new Scanner(System.in);
			System.out.println();
			System.out.println("Digite 1 para saldo - 2 sacar - 3 depositar - 4 transferir");
			int opcao = entrada03.nextInt();

//opcao 01 - saldo
			if (opcao == 1) {
				if ((cc01.getNumero() == infConta01) && (infTipo01 == 1)) {
					cc01.exibirSaldo();
				}
				if ((cp01.getNumero() == infConta01) && (infTipo01 == 2)) {
					cp01.exibirSaldo();
				}
				if ((cc02.getNumero() == infConta01) && (infTipo01 == 1)) {
					cc02.exibirSaldo();
				}
				if ((cp02.getNumero() == infConta01) && (infTipo01 == 2)) {
					cp02.exibirSaldo();
				}
			}
			entrada03.close();
//opcao 01 - fim

//opcao 02 - sacar
			if (opcao == 2) {

				Scanner entrada04 = new Scanner(System.in);
				System.out.println("Digite o valor do saque");
				double valorSaque = entrada04.nextDouble();

				if ((cc01.getNumero() == infConta01) && (infTipo01 == 1)) {
					cc01.sacar(valorSaque);
					cc01.exibirSaldo();
				}
				if ((cp01.getNumero() == infConta01) && (infTipo01 == 2)) {
					cp01.sacar(valorSaque);
				}
				if ((cc02.getNumero() == infConta01) && (infTipo01 == 1)) {
					cc02.sacar(valorSaque);
				}
				if ((cp02.getNumero() == infConta01) && (infTipo01 == 2)) {
					cp02.sacar(valorSaque);
				}
			}
			
//opcao 02 - fim

//opcao 03 - depositar
			if (opcao == 3) {

				Scanner entrada05 = new Scanner(System.in);
				System.out.println("Digite o valor do depósito");
				double valorDeposito = entrada05.nextDouble();

				if ((cc01.getNumero() == infConta01) && (infTipo01 == 1)) {
					cc01.depositar(valorDeposito);
					cc01.exibirSaldo();
				}
				if ((cp01.getNumero() == infConta01) && (infTipo01 == 2)) {
					cp01.depositar(valorDeposito);
					cp01.exibirSaldo();
				}
				if ((cc02.getNumero() == infConta01) && (infTipo01 == 1)) {
					cc02.depositar(valorDeposito);
					cc02.exibirSaldo();
				}
				if ((cp02.getNumero() == infConta01) && (infTipo01 == 2)) {
					cp02.depositar(valorDeposito);
					cp02.exibirSaldo();
				}
			}
	
//opcao 03 - fim

//opcao 04 - transferir
			if (opcao == 4) {

				Scanner entrada06 = new Scanner(System.in);
				System.out.println("Digite o valor da Transferência");
				double valorTrans = entrada06.nextDouble();
				System.out.println("Digite a conta para depósito");
				int contaDeposito = entrada06.nextInt();
				System.out.println("Tipo de Conta: 1 para CC - 2 para CP");
				int infoTipo02 = entrada06.nextInt();

				// transferir CC01 para CP01
				if ((cc01.getNumero() == infConta01) && (infTipo01 == 1) && (cp01.getNumero() == contaDeposito)
						&& (infoTipo02 == 2)) {
					cc01.transferir(valorTrans, cp01);
					cc01.exibirSaldo();
					cp01.exibirSaldo();
				}
				//ok
				// transferir CC01 para CC02
				if ((cc01.getNumero() == infConta01) && (infTipo01 == 1) && (cc02.getNumero() == contaDeposito)
						&& (infoTipo02 == 1)) {
					cc01.transferir(valorTrans, cc02);
					cc01.exibirSaldo();
					cc02.exibirSaldo();
				}
				// transferir CC01 para CP02
				if ((cc01.getNumero() == infConta01) && (infTipo01 == 1) && (cp02.getNumero() == contaDeposito)
						&& (infoTipo02 == 2)) {
					cc01.transferir(valorTrans, cp02);
					cc01.exibirSaldo();
					cp02.exibirSaldo();
				}
				// transferir CC02 para CC01
				if ((cc02.getNumero() == infConta01) && (infTipo01 == 1) && (cc01.getNumero() == contaDeposito)
						&& (infoTipo02 == 1)) {
					cc02.transferir(valorTrans, cc01);
					cc02.exibirSaldo();
					cc01.exibirSaldo();
				}
				// transferir CC02 para CP01
				if ((cc02.getNumero() == infConta01) && (infTipo01 == 1) && (cp01.getNumero() == contaDeposito)
						&& (infoTipo02 == 2)) {
					cc02.transferir(valorTrans, cp01);
					cc02.exibirSaldo();
					cp01.exibirSaldo();
				}
				// transferir CC02 para CP02
				if ((cc02.getNumero() == infConta01) && (infTipo01 == 1) && (cp02.getNumero() == contaDeposito)
						&& (infoTipo02 == 2)) {
					cc02.transferir(valorTrans, cp02);
					cc02.exibirSaldo();
					cp02.exibirSaldo();
				}
				// transferir CP01 para CC01
				if ((cp01.getNumero() == infConta01) && (infTipo01 == 2) && (cc01.getNumero() == contaDeposito)
						&& (infoTipo02 == 1)) {
					cp01.transferir(valorTrans, cc01);
					cp01.exibirSaldo();
					cc01.exibirSaldo();
				}
				// transferir CP01 para CC02
				if ((cp01.getNumero() == infConta01) && (infTipo01 == 2) && (cc02.getNumero() == contaDeposito)
						&& (infoTipo02 == 1)) {
					cp01.transferir(valorTrans, cc02);
					cp01.exibirSaldo();
					cc02.exibirSaldo();
				}
				// transferir CP01 para CP02
				if ((cp01.getNumero() == infConta01) && (infTipo01 == 2) && (cp02.getNumero() == contaDeposito)
						&& (infoTipo02 == 2)) {
					cp01.transferir(valorTrans, cp02);
					cp01.exibirSaldo();
					cp02.exibirSaldo();
				}
				// transferir CP02 para CC01
				if ((cp02.getNumero() == infConta01) && (infTipo01 == 2) && (cc01.getNumero() == contaDeposito)
						&& (infoTipo02 == 1)) {
					cp02.transferir(valorTrans, cc01);
					cp02.exibirSaldo();
					cc01.exibirSaldo();
					
				}
				// transferir CP02 para CC02
				if ((cp02.getNumero() == infConta01) && (infTipo01 == 2) && (cc02.getNumero() == contaDeposito)
						&& (infoTipo02 == 1)) {
					cp02.transferir(valorTrans, cc02);
					cp02.exibirSaldo();
					cc02.exibirSaldo();
				}
				// transferir CP02 para CP01
				if ((cp02.getNumero() == infConta01) && (infTipo01 == 2) && (cp01.getNumero() == contaDeposito)
						&& (infoTipo02 == 2)) {
					cp02.transferir(valorTrans, cp01);
					cp02.exibirSaldo();
					cp01.exibirSaldo();
				}
			}
		
			entrada01.close();
			entrada02.close();
			entrada03.close();
			
//opcao 04 - transferir

		}
	}
}