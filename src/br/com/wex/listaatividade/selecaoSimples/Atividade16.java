package br.com.wex.listaatividade.selecaoSimples;

import java.math.BigDecimal;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		double macas = 1.30;
        
		double quantMacas = 0;
        
		double multiplicacao;

        System.out.print("Digite a quantidade de maçãs: ");
        
        quantMacas = scan.nextInt();

        if (quantMacas < 12) 
            { multiplicacao = quantMacas * macas; }
        else
            { multiplicacao = quantMacas * 1 ;}

        System.out.print("o valor a ser pago é: R$ " + multiplicacao);
        

	}

}
