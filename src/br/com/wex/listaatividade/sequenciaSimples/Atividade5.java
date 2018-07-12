package br.com.wex.listaatividade.sequenciaSimples;

import java.util.Scanner;

public class Atividade5 { 
	
	public static void main (String[] args){
		
		int valor;
		
		int antecessor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor:" );
		valor = scan.nextInt();
		
		antecessor = valor - 1;
		System.out.println("O valor antecessor é "+ antecessor);
		
	}
	

}
