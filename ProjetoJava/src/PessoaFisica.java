
public class PessoaFisica extends Cliente { 
	
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		String texto = "";
		
		texto = "------------------"
				+ "\n cpf id: " + getCpf();
		return texto;
	}

}
