package br.com.wex.listaatividade.selecaoAninhada;

import java.util.Scanner;

public class Atividade30 {

	public static void main(String[] args){
			 
		  
		 int a = 0;
		 
		 int b = 0;
		  
		 int c = 0;
		  
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite o 1º numero: ");
		  
		 a = scan.nextInt();
		  
		 System.out.println("Digite o 2º numero: ");
		  
		 b = scan.nextInt();
		 
		 System.out.println("Digite o 3º numero: ");
		  
		 c = scan.nextInt();
		 
		 scan.close();
		  
		 if((a <= b ) && (a <= c)){
			
			if(b <= c){
				
				System.out.println("A ordem certa é :" + a + "," + b + ","+ c);}
			
			else{
				
				System.out.println("A ordem certa é :" + a + "," + c + "," + b );}
			
		 }
		 
		 else if((b <= a) && (b <= c)){
				 
			if(a < c){
				
				 System.out.println("A ordem certa é :" + b + "," + a + "," + c );}
				 
		    else{
				
				System.out.println("A ordem certa é :" + b + "," + c + "," + a );}
			 
		 }
		 
		 else if((c <= a) && (c <= b)){
			 
			 if(a < b){
				 
				 System.out.println("A ordem certa é :" + c +"," + a + "," + b );}
			 
			 else{
				
				System.out.println("A ordem certa é :" + c +"," + b + "," + a );
			}
				
		}
			
	}

}
	

