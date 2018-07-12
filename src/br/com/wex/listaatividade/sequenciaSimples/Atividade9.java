package br.com.wex.listaatividade.sequenciaSimples;

import java.math.BigDecimal;
import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		
		BigDecimal salario;
		
		BigDecimal percentual;
		
		BigDecimal novoSalario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o salário atual mensal ? ");
		salario = scan.nextBigDecimal();
		
		System.out.println("Qual o percentual de reajuste ? ");
		percentual = scan.nextBigDecimal();
		
		percentual = (percentual.divide(new BigDecimal(100))).multiply(salario);
		
		novoSalario = salario.add(percentual);
		
		System.out.println("O novo salário é : R$" + novoSalario);
		

	}

}
