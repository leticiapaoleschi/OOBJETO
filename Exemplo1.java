package POO;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Scanner entrada = new Scanner(System.in);		

		String formaPagamento = "";
		int valorCompra = 0;
		cliente.nome = "leticia";
		cliente.genero = "feminino";
		cliente.profissao = "Desenvolvedora de software";
		cliente.renda = 8000;
		cliente.idade = 20;


		System.out.println("Digite o valor da sua compra: ");
		valorCompra = entrada.nextInt();
		System.out.println("Selecione a forma de pagto: cartao / debito");
		formaPagamento = entrada.next();
		for (int i = 0; i < 50; ++i) System.out.println (); //Limpando o console



		// Chamando metodos e passando parametros;
		cliente.formaPagto(formaPagamento);


		System.out.println("[Informacoes do cliente]");
		System.out.println("Nome: [ " + cliente.nome + " ]" );
		System.out.println("Genero: [ " +cliente.genero + " ]");
		System.out.println("Profissao: [ " +cliente.profissao+ " ]" );
		System.out.println("Idade: [ " +cliente.idade+ " ]" );
		System.out.println("Renda: [ R$" +cliente.renda+ " ]" );
		System.out.println();
		System.out.println();
		System.out.println();


		cliente.valorCompra(valorCompra);
		System.out.println(cliente.formaPagto(formaPagamento));
		System.out.println("Aguarde...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pagamento Aprovado!");

		entrada.close();
		}

}
