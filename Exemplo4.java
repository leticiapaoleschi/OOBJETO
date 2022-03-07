package POO;

public class Exemplo4 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		
		funcionario.nome= "leticia";
		funcionario.salario= 10000;
		funcionario.idade=26;
		funcionario.horaextra=4;
		funcionario.extra();
		
		System.out.println("[Informacoes sobre a funcionaria]");
		System.out.println( "nome: [ " + funcionario.nome + " ]" );
		System.out.print("a idade da funcionaria é: " + funcionario.idade);
		System.out.print("o salario com acrescimos de hora extra: " + funcionario.salario * funcionario.horaextra/2);
		

	}

}
