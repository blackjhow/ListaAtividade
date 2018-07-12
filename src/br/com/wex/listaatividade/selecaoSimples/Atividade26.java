package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade26 {

	public static void main(String[] args) {
		
		double quantAtual;
		
		double quantMax;
	
		double quantMin;
		
		double quantMed;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a quantidade atual de produtos no estoque ? ");
		
		quantAtual = scan.nextDouble();
		
		System.out.println("Qual a quantidade máxima de produtos no estoque ? ");
		
		quantMax = scan.nextDouble();
		
		System.out.println("Qual a quantidade mínima de produtos no estoque ?");

		quantMin = scan.nextDouble();
		
		quantMed =((quantMax + quantMin)/2);
		
		if(quantAtual >= quantMed ){
			
			System.out.println("Não efetue a compra, estoque cheio !");
		}else {
			System.out.println("Efetue compras para preencher estoque !");
		}
		
		
	}

}
