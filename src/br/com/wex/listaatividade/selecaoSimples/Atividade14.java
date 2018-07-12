package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
	
		int valor = 10;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		valor = scan.nextInt();
		if (valor > 10) {
			System.out.println("O VALOR É MAIOR QUE 10");
			
			
			}else{
				System.out.println("O VALOR NÃO É MAIOR QUE 10");
			}
			
	}

}
