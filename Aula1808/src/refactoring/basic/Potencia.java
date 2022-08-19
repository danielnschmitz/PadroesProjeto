package refactoring.basic;

import java.util.Scanner;

public class Potencia 
{
	static int calcularPotencia(int base, int expoente){
		int resultado = 0;
		if(expoente>0)
		{
			for( int j = 0; j < expoente; j++)
				resultado=resultado*base;
		}
		return resultado;
	}

	public static void main(String[] args)
	{
		int base, expoente, resultado;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número a ser potenciado: ");
		base=scan.nextInt();

		System.out.println("Digite a potência desejada: ");
		expoente=scan.nextInt();

		while (expoente < 0 || base <= 1)
		{
			System.out.println("Entrada inválida");
			System.out.println("");

			System.out.println("Digite o número a ser potenciado: ");
			base=scan.nextInt();

			System.out.println("Digite a potência desejada: ");
			expoente=scan.nextInt();
		}

		resultado = calcularPotencia(base,expoente);


		System.out.println("");
		System.out.println(base + " elevado a"+expoente+":"+resultado);
		scan.close();
	}
}
