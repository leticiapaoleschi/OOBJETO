package POO;

public class Paciente {
	String nome, genero, convênio;
	int idade;
	String cpf;
	boolean preferencial;
	
	
public void ficha(){
	if (this.preferencial==true)
		System.out.println("O paciente irá ser chamado!!!");
	else
		System.out.println("Aguarde a sua vez");
}
	
	
}
