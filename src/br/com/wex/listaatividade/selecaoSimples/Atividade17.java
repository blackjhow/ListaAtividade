package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int av1;
        
		int av2;
        
        int calculo;

        System.out.print("Digite a primeira nota do Aluno: ");
        
        av1 = scan.nextInt();
        
        System.out.print("Digite a segunda nota do Aluno: ");
        
        av2 = scan.nextInt();
        
        calculo = (av1 + av2) / 2 ;
        
        if( calculo >= 6) {
        	
        	System.out.println("O aluno foi aprovado !");
        	
        } else {
        	
        	System.out.println("O aluno foi reprovado !");
        	
        }
        
        
        

	}

}
