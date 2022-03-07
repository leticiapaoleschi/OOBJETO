package POO;

public class Aviao {
	//ATRIBUTOS
String modelo; 
int ano;
String marca;
int capacidade;
double velocidade;

void acelerando(int acelera)
{
	velocidade += acelera;
	if (velocidade>=400);
	{
		System.out.print("o aviao ira decolar...");
		
	}
}
   void reduzindo(int reduz)
	{
		velocidade -= reduz;
		if (velocidade<=200);
		{
			System.out.print("o aviao ira pusar...");
			

				
			}
		
	}

}
