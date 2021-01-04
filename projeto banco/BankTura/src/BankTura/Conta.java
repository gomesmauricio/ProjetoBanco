package BankTura;

public class Conta {

	// Atributos
	private double saldo;
	private double limite;
	private int numero;

	// M�todos construtores de permiss�o de acesso
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

	// M�todo de Depositar
	void depositar(String tipoConta, double valor, double jurosTaxa) {
		if (tipoConta.equalsIgnoreCase("poupan�a")) {
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
			if(tipoConta.equalsIgnoreCase("Poupan�a")){
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
