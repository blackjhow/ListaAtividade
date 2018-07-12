package br.com.wex.listaatividade.selecaoAninhada;

import java.util.Scanner;

public class Atividade29 {

	public static void main(String[] args) {

		double valor1;
		
		double valor2;
		
		double valor3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		
		valor1 = scan.nextDouble();
		
		System.out.println("Digite o segundo valor");
		
		valor2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro valor");
		
		valor3 = scan.nextDouble();
		
		if ((valor1 > valor2) & (valor2 > valor3 )){
			System.out.println("O resultado é " + (valor1 + valor2) );
		}
		
		else if((valor2 > valor1)&(valor3 > valor1)){
			
			System.out.println("O resultado é " + (valor2 + valor3) );
			
		}else{
			System.out.println("O resultado é " + (valor3 + valor1) );
		}

	}

}
