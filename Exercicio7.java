package POO;

public class Exercicio7 {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		
		paciente.ficha();
		paciente.nome= "leticia";
		paciente.cpf= "*********-66";
		paciente.genero= "feminino";
		paciente.preferencial= true;
		paciente.idade= 70;
		paciente.convênio= "unibrasil";
		
		System.out.println("[proximo paciente]");
		System.out.println( "nome: [ " + paciente.nome + " ]" );
		System.out.print("digite seu cpf: " + paciente.cpf);
		System.out.print("digite sua idade: " + paciente.idade);
		System.out.print("precisa de ficha preferencial: "+ paciente.preferencial);
		System.out.print("escreva seu convênio: "+ paciente.convênio);
		
		
		
		

	}

}
