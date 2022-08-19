package refactoring.basic;

import java.util.Scanner;

public class AreaParalelogramo
{
	public static void main(String args)
	{
		float base, altura, area;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor da base: ");
		base = scan.nextFloat();

		base = Math.abs(base);

		System.out.print("Digite o valor da altura: ");
		altura = scan.nextFloat();

		altura = Math.abs(altura);

		area = calculaAreaParalelogramo(base,altura);

		System.out.println("Área do paralelogramo:"+ area);
		scan.close();
	}

	static float calculaAreaParalelogramo(float base, float altura){
		return base * altura;
	}

}
