package br.com.wex.listaatividade.selecaoAninhada;

import java.util.Scanner;

public class Atividade31 {

	public static void main(String[] args) {
		
		double A;
		
		double B;
		
		double C;
		
		double lado1;
		
		double lado2;
		
		double lado3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor A do triângulo ");
		
		A = scan.nextDouble();
		
		System.out.println("Digite o valor B do triângulo ");
		
		B = scan.nextDouble();
		
		System.out.println("Digite o valor C do triângulo ");
		
		C = scan.nextDouble();
		
		lado1 = A + B;
		
		lado2 = B + C;
		
		lado3 = C + A;
		
		if(lado1 < C){
			System.out.println("Triângulo não Formado !");
		}
		else if(lado2 < A){
			System.out.println("Triângulo não Formado !");
		}
		else if(lado3 < B){
			System.out.println("Triângulo não Formado!");
		} 
		else{
			System.out.println("Podem formar um triângulo !");
		}

	}

}
