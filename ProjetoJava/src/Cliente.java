
public class Cliente extends Enderco {
	private int clienteid;
	private String nome;
	private Enderco enderco;
	
	public int getClienteid() {
		return clienteid;
	}
	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Enderco getEnderco() {
		return enderco;
	}
	public void setEnderco(Enderco enderco) {
		this.enderco = enderco;
	}
	public String toString() {
		String texto = "";
		
		texto = "------------------"
				+ "\n cliente id: " + getClienteid()
				+ "\n numero: " + getNome();
		return texto;
	}
}
