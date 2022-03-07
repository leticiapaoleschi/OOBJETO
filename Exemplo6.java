package POO;

import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Scanner ler = new Scanner  (System.in);
		
        conta.nome= "Leticia";
		conta.senha= "###";
		conta.extrato= 10000;
		conta.sacar();
		conta.extratofinal= conta.extrato-conta.saque;
		

		System.out.println("[Informacoes sobre a conta]");
		System.out.println( "nome: [ " + conta.nome + " ]" );
		System.out.print("digite sua senha: " + conta.senha);
		System.out.print("veja seu extrato: " + conta.extrato);
		System.out.print("quanto voce gostaria de sacar: "+ conta.saque);
		System.out.print("seu extrato final pós saque é: "+ conta.extratofinal);
		
		
		

	}

}
