package POO;

public class Paciente {
	String nome, genero, conv�nio;
	int idade;
	String cpf;
	boolean preferencial;
	
	
public void ficha(){
	if (this.preferencial==true)
		System.out.println("O paciente ir� ser chamado!!!");
	else
		System.out.println("Aguarde a sua vez");
}
	
	
}
