package POO;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Patinete patinete = new Patinete();
		
		
		patinete.capacidade= 100;
		patinete.garantia= 12;
		patinete.marca= "oxelo";
		patinete.modelo= "patineteXD";
		patinete.valor= 1200;
		patinete.andar();
		
		System.out.println("[Informacoes do patinete]");
		System.out.println("Marca: [ " + patinete.marca + " ]" );
		System.out.println("Modelo: [ " +patinete.modelo + " ]");
		System.out.println("Garantia em meses: [ " +patinete.garantia+ " ]" );
		System.out.println("Capacidade em quilos: [ " +patinete.capacidade+ " ]" );
		System.out.println("Valor: [ " +patinete.valor + " ]");

	}

}
