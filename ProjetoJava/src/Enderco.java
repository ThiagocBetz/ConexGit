
public class Enderco {
	
	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	//ssssa
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		String texto = "";
		
		texto = "------------------"
				+ "\n Rua: " + getRua()
				+ "\n numero: " + getNumero()
				+ "\n cep: " + getCep()
				+ "\n Cidade: " + getCidade()
				+ "\n Estado: " + getEstado();
		
		return texto;
	}
}
