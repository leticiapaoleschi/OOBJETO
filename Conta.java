package POO;

import java.util.Scanner;

public class Conta {
//METODOS
String nome;
String senha;
int extrato;
int saque;
int salario;
int extratofinal;
Scanner ler = new Scanner (System.in);


public void sacar() {
	System.out.print("Quantia que você gostaria de sacar" + saque);
	saque = ler.nextInt();
	
}


	
}
