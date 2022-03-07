package POO;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		 Aviao aviao = new Aviao ();
	    aviao.marca = "aero";
	    aviao.ano = 2021;
	    aviao.capacidade = 98;
	    aviao.modelo = "aerox";
	    aviao.velocidade = 400;
	    

		System.out.println("[Informacoes do aviao]");
		System.out.println("Marca: [ " + aviao.marca + " ]" );
		System.out.println("Modelo: [ " +aviao.modelo + " ]");
		System.out.println("Ano: [ " +aviao.ano+ " ]" );
		System.out.println("Capacidade: [ " +aviao.capacidade+ " ]" );
		System.out.println("Velocidade: [ " +aviao.velocidade+ "km/h ]" );
		System.out.println("Acelerando...");
	    
	    

	}

}
