
public class PessoaJuridica extends Cliente {
	
private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String toString() {
		String texto = "";
		
		texto = "------------------"
				+ "\n cnpj id: " + getCnpj();
		return texto;
	}

}
//hhg