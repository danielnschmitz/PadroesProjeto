package refactoring.basic;

import java.util.Scanner;

public class VerificaPoliedro {
	
	static void determinarPoliedro(int numeroArestas, int numeroVertices){
		boolean	encontrouResultado;
		int numeroFaces;
		
		encontrouResultado=false;
		numeroFaces=2+numeroArestas-numeroVertices;

		if((numeroVertices==4) && (numeroArestas==6)){
			System.out.println("Tetraedro:"+ numeroFaces+" faces");
			System.out.println("Forma face: Triângulo");
			encontrouResultado=true;
		}else {
			if((numeroVertices==8) && (numeroArestas==12)){
				System.out.println("Hexaedro:"+numeroFaces+" faces");
				System.out.println("Forma face: Quadrado");
				encontrouResultado=true;
			}
			if((numeroVertices==6) && (numeroArestas==12)){
				System.out.println("Octaedro:"+numeroFaces+" faces");
				System.out.println("Forma face: Triângulo");
				encontrouResultado=true;
			}
			if((numeroVertices==20) && (numeroArestas==30)) {
				System.out.println("Dodecaedro:"+numeroFaces+" faces");
				System.out.println("Forma face: Pentágono");
				encontrouResultado=true;
			}
			if((numeroVertices==12) && (numeroArestas==30)){
				System.out.println("Icosaedro:"+numeroFaces+" faces");
				System.out.println("Forma face: Triângulo");
				encontrouResultado=true;
			}
		}
		if(encontrouResultado==false){
			System.out.println("Os dados não indicam nenhum poliedro regular.");
		}
	}
	
	public static void main(String args[]) {
		int numeroVertices, numeroArestas;
		
		Scanner scan = new Scanner(System.in);

		do{
			System.out.print("Digite o número de vértices do poliedro [4-6-8-12-20]: ");
			numeroVertices = scan.nextInt();
		}while(numeroVertices != 4 && numeroVertices != 6 && numeroVertices!= 8 && numeroVertices!= 12 && numeroVertices != 20);
		
		System.out.println("");

		do {
			System.out.print("Digite o número de numeroArestas do poliedro [6-12-30]: ");
			numeroArestas=scan.nextInt();
		}while( (numeroArestas!=6) && (numeroArestas!=12) && !(numeroArestas==30) );

		determinarPoliedro(numeroArestas,numeroVertices);
	}
}
