package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int anoAtual = 2018;
        
		int anoNascimento;
        
		int calculo;
		
		System.out.print("Digite o ano atual : ");
		anoAtual = scan.nextInt();
		
		System.out.print("Digite o ano que você nasceu : ");
		anoNascimento = scan.nextInt();
		
		calculo = anoAtual - anoNascimento;
        
        if( calculo >= 16) {
        	
        	System.out.println("Você já pode votar !");
        	
        } else {
        	
        	System.out.println("Você ainda não pode votar !");
        	
        }

	}

}
