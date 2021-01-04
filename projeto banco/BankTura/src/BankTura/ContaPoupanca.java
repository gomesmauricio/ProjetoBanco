package BankTura;

public class ContaPoupanca extends Conta{

//	Atributos
	private double juros = 0.5;

//	Métodos construtores de permissão de acesso
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

}
