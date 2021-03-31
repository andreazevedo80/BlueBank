package model;

public abstract class Conta {

	private String agencia;
	private int numero;
	private String nomeDono;
	private double saldo;
	private boolean contaAtiva = false;

	private double cpmf = 0.038;
	private double rendimento = 0.033;

	void exibirSaldo() {
		System.out.println("Seu saldo é: R$ " + saldo);
	}

//boolean sacar inicio
	boolean saldoOk;

	boolean sacar(double valorS) {
		double valorCpmf = valorS * cpmf;
		double novoValorS = valorCpmf + valorS;
		if (novoValorS > this.saldo) {
			System.err.println("Saldo insuficiente");
			this.saldoOk = false;
			return saldoOk;
		} else {
			this.saldo = saldo - novoValorS;
			System.out.println("Valor do saque: " + valorS);
			System.out.println("Valor CPMF: " + valorCpmf);
			saldoOk = true;
			return saldoOk;
		}
	}
//boolean sacar fim

//transferir inicio

	void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		if (this.saldoOk == true) {
			contaDestino.depositar(valor);
		}
	}

//transferir fim

//depositar inicio

	public abstract void depositar(double valorD);

//depositar fim	

// abrir e fechar conta

	void abrirConta() {

		if (this.contaAtiva == true) {
			System.out.println("Conta já esta aberta");
		} else {

			this.contaAtiva = true;
			System.out.println("Conta aberta com sucesso!");
		}
	}

	void fecharConta() {
		if (this.contaAtiva == false) {
			System.out.println("Conta está inativa");
		} else {
			this.setAgencia(null);
			this.setNomeDono(null);
			this.setNumero(0);
			this.setSaldo(0);
			this.contaAtiva = false;
			System.out.println("Conta fechada com sucesso!");
		}
	}

// abrir e fechar conta fim	

	// Getters and Setters

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getCpmf() {
		return cpmf;
	}

	public void setCpmf(double cpmf) {
		this.cpmf = cpmf;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isContaAtiva() {
		return contaAtiva;
	}

	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
	}

	// Fim Getters and Setters

	// String toString
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", nomeDono=" + nomeDono + ", saldo=" + saldo
				+ ", contaAtiva=" + contaAtiva + "]";
	}

	// Fim String toString

}
