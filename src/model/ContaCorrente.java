package model;

public class ContaCorrente extends Conta {


	void exibirDados() {
		System.out.println("Voc� est� em conta corrente");
		System.out.println("Nome: " + this.getNomeDono());
		System.out.println("Ag�ncia: " + this.getAgencia() + " N�mero da conta: " + this.getNumero());
	}
@Override
public void depositar (double valorD) {
		double valorCpmf = valorD * this.getCpmf();
		double novoValorD = valorD - valorCpmf;
		this.setSaldo(this.getSaldo() + novoValorD);
		System.out.println("Valor depositado com CPMF" + novoValorD);
		}



}
