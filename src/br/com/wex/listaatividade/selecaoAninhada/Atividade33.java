package br.com.wex.listaatividade.selecaoAninhada;

import java.util.Scanner;

public class Atividade33 {

	public static void main(String[] args) {
		
		int A;
		int B;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		
		A = scan.nextInt();
		
		System.out.println("Digite o segundo valor");
		
		B = scan.nextInt();
		
		if(A == B){
			
			System.out.println("Os números são iguais !");
		} 
		else if(A > B){
			
			System.out.println("O primeiro valor é maior !");
		} 
		else{
			
			System.out.println("O segundo valor é maior !");
			
		}
		
		

	}

}
