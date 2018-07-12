package br.com.wex.listaatividade.sequenciaSimples;

import java.math.BigDecimal;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args){
		
		BigDecimal totalEleitores;
	
		BigDecimal votBrancos;
	
		BigDecimal votNulos;
		
		BigDecimal votValidos;
		
		BigDecimal percentualNulos;
		
		BigDecimal percentualBrancos;

		BigDecimal percentualValidos;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o número total de eleitores ? ");
		totalEleitores = scan.nextBigDecimal();
		
		System.out.println("Qual a quantidade de votos nulos ? ");
		votNulos = scan.nextBigDecimal();

		System.out.println("Qual a quantidade de votos brancos ? ");
		votBrancos = scan.nextBigDecimal();

		System.out.println("Qual a quantidade de votos válidos ? ");
		votValidos = scan.nextBigDecimal();
		
		percentualNulos = (votNulos.divide(totalEleitores)).multiply((new BigDecimal(100)));
		System.out.println("O percentual de votos nulos é :" + percentualNulos +"%");
		
		percentualBrancos = (votBrancos.divide(totalEleitores)).multiply((new BigDecimal(100)));
		System.out.println("O percentual de votos brancos é :" + percentualBrancos +"%");
		
		percentualValidos = (votValidos.divide(totalEleitores).multiply(new BigDecimal(100)));
		System.out.println("O percentual de votos validos é :" + percentualValidos + "%");
		

	}

}
