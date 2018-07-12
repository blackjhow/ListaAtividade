package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		
		int valor1;
		
		int valor2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor :");
		
		valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo valor :");
		
		valor2 = scan.nextInt();
		
		if (valor1 < valor2){
			
			System.out.println("A ordem crescente é : " + valor1 + "," + valor2);
			
		}else{
			System.out.println("A ordem crescente é : " + valor2 + "," + valor1);
		}

	}

}
