package BankTura;

public class ContaCorrente extends Conta {

	// Atributos
	private double taxa = 0.5;

	// M�todos construtores de permiss�o de acesso
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}
