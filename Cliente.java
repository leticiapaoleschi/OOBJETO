package POO;

public class Cliente {
	//Atributos do Cliente
		String nome;
		String profissao;
		String genero;
		double renda;
		int idade;



		//METODOS DO CLIENTE

		String formaPagto(String formaPagamento) {
			String cartao = "cartao", debito = "debito";
			String resultado = "";
			if(formaPagamento.equals(cartao)) {
				resultado = "A forma de pagto escolhida foi: " + cartao;

			}
			if(formaPagamento.equals(debito)) {
				resultado = "A forma de pagto escolhida foi " + debito;
			}
			return resultado;
		}


		void valorCompra(int valorCompra) {
			System.out.println("O valor da sua compra foi: R$" + valorCompra);
		}

}
