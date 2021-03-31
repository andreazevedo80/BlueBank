package model;

public class ContaPoupanca extends Conta {

	void exibirDados() {
		System.out.println("Voc� est� em conta poupan�a");
		System.out.println("Nome: " + this.getNomeDono());
		System.out.println("Ag�ncia: " + this.getAgencia() + " N�mero da conta: " + this.getNumero());
	}
	
	@Override
	boolean sacar(double valorS) {
		this.setSaldo(this.getSaldo() - valorS);
		return true;
	}
	
	@Override
	public void depositar (double valorD) {
			double valorRendimento = valorD * this.getRendimento();
			double novoValorD = valorRendimento + valorD;
			this.setSaldo(this.getSaldo() + novoValorD);
		System.out.println("Valor do dep�sito com rendimento: " + novoValorD);
		}
	
}