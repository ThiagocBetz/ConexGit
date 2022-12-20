import java.util.Scanner;

//ghhgghghRTHRT
public class Teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 1 para pessoa física e 2 para jurídica");
		int escolha = teclado.nextInt();
		if(escolha == 1) {
			PessoaFisica pessoa = new PessoaFisica();
			System.out.println("Digite seu nome");
			String nome = teclado.next();
			pessoa.setNome(nome);
			teclado.nextLine();
			System.out.println("Digite seu id");
			int id = teclado.nextInt();
			pessoa.setClienteid(id);
			teclado.nextLine();
			System.out.println("Digite seu cep");
			String cep = teclado.next();
			pessoa.setCep(cep);
			teclado.nextLine();
			System.out.println("Digite sua cidade");
			String cidade = teclado.next();
			pessoa.setCidade(cidade);
			teclado.nextLine();
			System.out.println("Digite seu cpf");
			String cpf = teclado.next();
			pessoa.setCpf(cpf);
			teclado.nextLine();
			System.out.println("Digite seu estado");
			String estado = teclado.next();
			pessoa.setEstado(estado);
			teclado.nextLine();
			System.out.println("Digite o numero de sua casa");
			int numero = teclado.nextInt();
			pessoa.setNumero(numero);
			teclado.nextLine();
			System.out.println("Digite sua rua");
			String rua = teclado.next();
			pessoa.setRua(rua);
			teclado.nextLine();
			
			System.out.println("-------------------------------------");
			System.out.println("Nome: "+ pessoa.getNome());
			System.out.println("Id: "+ pessoa.getClienteid());
			System.out.println("Cpf: "+ pessoa.getCpf());
			System.out.println("Cidade: "+ pessoa.getCidade());
			System.out.println("Cep: "+ pessoa.getCep());
			System.out.println("Estado: "+ pessoa.getEstado());
			System.out.println("Rua: "+ pessoa.getRua());
			System.out.println("-------------------------------------");
		}
		if(escolha == 2) {
			PessoaJuridica pessoa = new PessoaJuridica();
			Enderco enderco = new Enderco();
			System.out.println("Digite seu nome");
			String nome = teclado.next();
			pessoa.setNome(nome);
			teclado.nextLine();
			System.out.println("Digite seu id");
			int id = teclado.nextInt();
			pessoa.setClienteid(id);
			teclado.nextLine();
			System.out.println("Digite seu cep");
			String cep = teclado.next();
			pessoa.setCep(cep);
			teclado.nextLine();
			System.out.println("Digite sua cidade");
			String cidade = teclado.next();
			pessoa.setCidade(cidade);
			teclado.nextLine();
			System.out.println("Digite seu cpf");
			String cnpj = teclado.next();
			pessoa.setCnpj(cnpj);
			teclado.nextLine();
			System.out.println("Digite seu estado");
			String estado = teclado.next();
			pessoa.setEstado(estado);
			teclado.nextLine();
			System.out.println("Digite o numero de sua casa");
			int numero = teclado.nextInt();
			pessoa.setNumero(numero);
			teclado.nextLine();
			System.out.println("Digite sua rua");
			String rua = teclado.next();
			pessoa.setRua(rua);
			teclado.nextLine();

			System.out.println("-------------------------------------");
			System.out.println("Nome: "+ pessoa.getNome());
			System.out.println("Id: "+ pessoa.getClienteid());
			System.out.println("Cpf: "+ pessoa.getCnpj());
			System.out.println("Cidade: "+ pessoa.getCidade());
			System.out.println("Cep: "+ pessoa.getCep());
			System.out.println("Estado: "+ pessoa.getEstado());
			System.out.println("Rua: "+ pessoa.getRua());
			System.out.println("-------------------------------------");
	
		}
		
				
	}

}
