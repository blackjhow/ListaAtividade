package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade25 {

	public static void main(String[] args) {
		
		double contaCliente; 
		
		double saldo;
		
		double debito;
		
		double credito;
		
		double saldoTotal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número da sua conta : ");
		
		contaCliente = scan.nextDouble();
		
		System.out.println("Digite o saldo da sua conta : ");
		
		saldo = scan.nextDouble();
		
		System.out.println("Digite o crédito da sua conta : ");
		
		credito = scan.nextDouble();
		
		System.out.println("Digite o debito da sua conta : ");
		
		debito = scan.nextDouble();
		
		saldoTotal = (saldo - debito + credito);
		
		System.out.println("Seu saldo atual é de : " + saldoTotal );
		
		if (saldoTotal >= 0){
			
			System.out.println("Seu saldo é POSITIVO ! ");
			
		}
		
		else{
			
			System.out.println("Seu saldo é NEGATIVO ! ");
			
		}
		
	}

}
