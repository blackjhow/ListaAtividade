package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade22 {

	public static void main(String[] args) {
		
		double horasTrabalhadas;
		
		double valorHora;
		
		double salarioTotal;
		 
		double somaHoras;
		
		double horaExtra;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês pelo funcionário :");
		
		horasTrabalhadas = scan.nextDouble();
		
		System.out.println(" Informe o valor que ganha por hora  ");
		
		valorHora = scan.nextDouble();
		
		if (horasTrabalhadas > 160){
			
			horaExtra = (valorHora / 100) * 50;
			
			salarioTotal = 160 * valorHora + horasTrabalhadas + horaExtra ;
		
	
			System.out.println("O número de horas trabalhadas no mês é : " + horasTrabalhadas);
		
			System.out.println("O salário por hora é R$ " + valorHora );
		
			System.out.println("O salário total é R$ " + salarioTotal );
		
		} else {
			
			salarioTotal = 160 * valorHora;
			
			System.out.println("O número de horas trabalhadas no mês é : " + horasTrabalhadas);
			
			System.out.println("O salário por hora é R$ " + valorHora );
			
			System.out.println("O salário total é R$ " + salarioTotal );
		}
	}

}
