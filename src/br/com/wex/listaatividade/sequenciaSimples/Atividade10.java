package br.com.wex.listaatividade.sequenciaSimples;

import java.math.BigDecimal;
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		BigDecimal custoCarroNovo = new BigDecimal(0);
		
		BigDecimal custoFabrica = new BigDecimal(0);
		
		BigDecimal porcentagemDistribuidor = new BigDecimal(0);
		
		BigDecimal imposto = new BigDecimal(0);
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Qual o custo de fábrica ?");
		
		custoFabrica = scan.nextBigDecimal();
				
		porcentagemDistribuidor = (custoFabrica.multiply(new BigDecimal(28))).divide(new BigDecimal(100));
		
		imposto = (custoFabrica.multiply(new BigDecimal(60))).divide(new BigDecimal(100));
		
		custoCarroNovo = custoFabrica.add(porcentagemDistribuidor).add(imposto);
		
		System.out.println("Então o valor de um carro novo para o consumidor é R$" + custoCarroNovo );
		
		
		
		}

}
