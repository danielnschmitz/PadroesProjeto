package refactoring.basic;

import java.util.Scanner;

public class VerificaPoliedro {

	static boolean isTetraedro(int numeroArestas, int numeroVertices){
		if((numeroVertices==4) && (numeroArestas==6)){
			return true;
		}else{
			return false;
		}
	}

	static boolean isHexaedro(int numeroArestas, int numeroVertices){
		if((numeroVertices==8) && (numeroArestas==12)){
			return true;
		}else{
			return false;
		}
	}

	static boolean isOctaedro(int numeroArestas, int numeroVertices){
		if((numeroVertices==6) && (numeroArestas==12)){
			return true;
		}else{
			return false;
		}
	}

	static boolean isDodecaedro(int numeroArestas, int numeroVertices){
		if((numeroVertices==20) && (numeroArestas==30)) {
			return true;
		}else{
			return false;
		}
	}

	static boolean isIcosaedro(int numeroArestas, int numeroVertices){
		if((numeroVertices==12) && (numeroArestas==30)){
			return true;
		}else{
			return false;
		}
	}

	static int retornaNumeroFaces(int numeroArestas, int numeroVertices){
		return 2+numeroArestas-numeroVertices;
	}
	
	static void determinarPoliedro(int numeroArestas, int numeroVertices){
		int numeroFaces;

		numeroFaces = retornaNumeroFaces(numeroArestas,numeroVertices);

		if(isTetraedro(numeroArestas,numeroVertices)){
			System.out.println("Tetraedro:"+ numeroFaces+" faces");
			System.out.println("Forma face: Triângulo");
		}else if(isHexaedro(numeroArestas,numeroVertices)){
			System.out.println("Hexaedro:"+numeroFaces+" faces");
			System.out.println("Forma face: Quadrado");
		}else if(isOctaedro(numeroArestas,numeroVertices)){
			System.out.println("Octaedro:"+numeroFaces+" faces");
			System.out.println("Forma face: Triângulo");
		}else if(isDodecaedro(numeroArestas,numeroVertices)) {
			System.out.println("Dodecaedro:" + numeroFaces + " faces");
			System.out.println("Forma face: Pentágono");
		}else if(isIcosaedro(numeroArestas,numeroVertices)){
			System.out.println("Icosaedro:"+numeroFaces+" faces");
			System.out.println("Forma face: Triângulo");
		} else {
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
