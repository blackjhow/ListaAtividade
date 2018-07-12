package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade24 {

	public static void main(String[] args) {
		
		double salario;
		
		double totalVendas;
		
		double acrescimoA;
		
		double acrescimoB;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu salario : ");
		
		salario = scan.nextDouble();
		
		System.out.println("Informe o valor total das vendas : ");
		
		totalVendas = scan.nextDouble();
		
		if (totalVendas <= 1500){
			
			acrescimoA = (totalVendas / 100) * 3;
			
			salario = salario + acrescimoA;
			
			System.out.println("O valor do salario total é R$ " + salario  );
		} 
		
		else {
			
			acrescimoA = (totalVendas / 100) * 3;
			
			acrescimoB = (totalVendas / 100) * 5;
			
			salario = salario + acrescimoA + acrescimoB;
			
			System.out.println("O valor do salario total é R$ " + salario  );
		}
 		
		
	
	}

}
