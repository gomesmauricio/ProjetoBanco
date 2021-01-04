package BankTura;

public class ContaCorrente extends Conta {

	// Atributos
	private double taxa = 0.5;

	// Métodos construtores de permissão de acesso
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
