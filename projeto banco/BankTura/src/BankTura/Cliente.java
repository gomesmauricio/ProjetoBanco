package BankTura;

public class Cliente extends Pessoa {
//	Atributo
	private boolean vip;
	
	
//	M�todos construtores de permiss�o de acesso
	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	public Cliente(){
		
	}
	
//	Mesmo nome de m�todos, mais com retornos diferentes
	public void clienteVip(String teste){
	}
	
	public void clienteVip(int teste){
	}
	
}
