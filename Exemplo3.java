package POO;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner leia = new Scanner (System.in);
		
		produto.capacidade= 128;
		produto.garantia= 12;
		produto.marca= "Aplle";
		produto.modelo= "IPHONEX";
		produto.ligar();
		
		System.out.println("[Informacoes do eletronico]");
		System.out.println("Marca: [ " + produto.marca + " ]" );
		System.out.println("Modelo: [ " +produto.modelo + " ]");
		System.out.println("Garantia em meses: [ " +produto.garantia+ " ]" );
		System.out.println("Capacidade: [ " +produto.capacidade+ " ]" );
		

	}

}
