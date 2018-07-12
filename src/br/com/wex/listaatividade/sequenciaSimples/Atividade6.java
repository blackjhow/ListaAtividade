package br.com.wex.listaatividade.sequenciaSimples;

import java.util.Scanner;

public class Atividade6 {
	
	public static void main (String[] args){
		
		int base ;
		
		int altura;
		
		int area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base :");
		base = scan.nextInt();
		
		System.out.println("Digite a altura :");
		altura = scan.nextInt();
		
		area = base * altura ;
		System.out.println("A área do triângulo é :"+ area );
		
	}

}
