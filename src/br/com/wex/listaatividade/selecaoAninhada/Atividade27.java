package br.com.wex.listaatividade.selecaoAninhada;

import java.util.Scanner;

public class Atividade27 {

	public static void main(String[] args) {
		
		double valor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		
		valor = scan.nextDouble();
		
		if(valor > 0){
			System.out.println("O valor é positivo !");
		}
		
		else if(valor == 0){
			System.out.println("O valor é zero !");
		}
		
		else{
			System.out.println("O valor é negativo !");
		}
	}

}
