import java.util.Scanner;

//ghhgghghRTHRT
public class Teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		PessoaFisica pessoa = new PessoaFisica();
		Enderco enderco = new Enderco();
		System.out.println("Digite seu nome");
		String nome = teclado.next();
		pessoa.setNome(nome);
		System.out.println("Digite seu id");
		int id = teclado.nextInt();
		pessoa.setClienteid(id);
		System.out.println("Digite seu cep");
		String cep = teclado.next();
		pessoa.setCep(cep);
		System.out.println("Digite sua cidade");
		String cidade = teclado.next();
		pessoa.setCidade(cidade);
		System.out.println("Digite seu cpf");
		String cpf = teclado.next();
		pessoa.setCpf(cpf);
		System.out.println("Digite seu estado");
		String estado = teclado.next();
		pessoa.setEstado(estado);
		System.out.println("Digite o numero de sua casa");
		int numero = teclado.nextInt();
		pessoa.setNumero(numero);
		System.out.println("Digite sua rua");
		String rua = teclado.next();
		pessoa.setRua(rua);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getClienteid());
		System.out.println(pessoa.getCep());
		System.out.println(pessoa.getCidade());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getEstado());
		System.out.println(pessoa.getRua());
		
	}

}
