package model;

import java.util.Scanner;

public class ContaOperacaoGerente {

	public static void main(String[] args) {

		//Inicio Dados das contas

				ContaCorrente cc03 = new ContaCorrente();
				ContaCorrente cc04 = new ContaCorrente();
				ContaPoupanca cp03 = new ContaPoupanca();
				ContaPoupanca cp04 = new ContaPoupanca();

				// conta corrente 01
				cc03.setAgencia("1020");
				cc03.setNumero(10201);
				cc03.setNomeDono("André Azevedo");
				cc03.setSaldo(1000);
				cc03.setContaAtiva(true);

				// conta poupanca 01
				cp03.setAgencia("1020");
				cp03.setNumero(10201);
				cp03.setNomeDono("André Azevedo");
				cp03.setSaldo(2000);
				cp03.setContaAtiva(true);

				// conta corrente 02
				cc04.setAgencia("1020");
				cc04.setNumero(10202);
				cc04.setNomeDono("Isabel Azevedo");
				cc04.setSaldo(3000);
				cc04.setContaAtiva(true);

				// conta poupanca 02
				cp04.setAgencia("1020");
				cp04.setNumero(10202);
				cp04.setNomeDono("Isabel Azevedo");
				cp04.setSaldo(4000);
				cp04.setContaAtiva(true);

		//fim dados das contas
					
				cc03.abrirConta();
				cc04.fecharConta();
				cc04.exibirDados();
}
	//fim
}