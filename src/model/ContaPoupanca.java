package model;

public class ContaPoupanca extends Conta {

	void exibirDados() {
		System.out.println("Você está em conta poupança");
		System.out.println("Nome: " + this.getNomeDono());
		System.out.println("Agência: " + this.getAgencia() + " Número da conta: " + this.getNumero());
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
		System.out.println("Valor do depósito com rendimento: " + novoValorD);
		}
	
}