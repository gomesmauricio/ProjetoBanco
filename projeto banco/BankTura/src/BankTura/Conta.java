package BankTura;

public class Conta {

	// Atributos
	private double saldo;
	private double limite;
	private int numero;

	// Métodos construtores de permissão de acesso
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Método de Depositar
	void depositar(String tipoConta, double valor, double jurosTaxa) {
		if (tipoConta.equalsIgnoreCase("poupança")) {
			this.saldo = saldo + valor;
			this.saldo = saldo + (saldo * jurosTaxa / 100);
			System.out.println(this.saldo);

		} else if (tipoConta.equalsIgnoreCase("corrente")) {
			this.saldo = saldo + valor;
			this.saldo = saldo - (saldo * jurosTaxa / 100);
			System.out.println(this.saldo);
		}
	}
	
	void sacar(String tipoConta, double valor, double jurosTaxa){
		if(this.saldo >= valor && valor <= this.limite){
			if(tipoConta.equalsIgnoreCase("Poupança")){
				this.saldo = saldo - valor;
				this.saldo = saldo - 2.50;
				System.out.println(this.saldo);
			}
			else if(tipoConta.equalsIgnoreCase("Corrente")){
				this.saldo = saldo - valor;
				this.saldo = saldo - 2.50;
				System.out.println(this.saldo);
			}
		}
	}
}
