package BankTura;

public class ContaPoupanca extends Conta{

//	Atributos
	private double juros = 0.5;

//	M�todos construtores de permiss�o de acesso
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

}
