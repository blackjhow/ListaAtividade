package br.com.wex.listaatividade.sequenciaSimples;

import java.math.BigDecimal;
import java.util.Scanner;

public class Atividade11 {
	 
   
    public static void main(String[] args) {
    	
    	BigDecimal carrosVendidos = new BigDecimal(0);
    	
    	BigDecimal totalVendas = new BigDecimal(0) ;
    	
    	BigDecimal comissaoFixa = new BigDecimal(50);
    	
    	BigDecimal porcentagem = new BigDecimal (5);

    	BigDecimal salarioFixo;
    	
    	BigDecimal salarioFinal;
    	
    	BigDecimal valorFinalVendas;
    	
    	BigDecimal valorFVPOR;
    	
    	Scanner scan = new Scanner(System.in);
    	
    	
    	System.out.println("Qual o número de carros vendidos ?");
    
    	carrosVendidos = scan.nextBigDecimal();
    	
    	comissaoFixa = new BigDecimal(50).multiply(carrosVendidos);
    	
    	
    	System.out.println("Qual valor total de suas vendas ? ");
    	
    	totalVendas = scan.nextBigDecimal();
    	
    	valorFinalVendas = totalVendas.divide(carrosVendidos);
    	
    	valorFVPOR = valorFinalVendas.divide(new BigDecimal(100)).multiply(porcentagem);
    	
    	
    	System.out.println("Digite o seu salario fixo :");
    	
    	salarioFixo = scan.nextBigDecimal();
    	
    	salarioFixo = salarioFixo.add(valorFVPOR);
    	
    	salarioFinal = salarioFixo.add(comissaoFixa);
    	
    	System.out.println("O seu salário final é : R$" + salarioFinal);

    	
    }
}
