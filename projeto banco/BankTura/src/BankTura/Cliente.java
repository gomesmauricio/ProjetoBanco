package BankTura;

public class Cliente extends Pessoa {
//	Atributo
	private boolean vip;
	
	
//	Métodos construtores de permissão de acesso
	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	public Cliente(){
		
	}
	
//	Mesmo nome de métodos, mais com retornos diferentes
	public void clienteVip(String teste){
	}
	
	public void clienteVip(int teste){
	}
	
}
