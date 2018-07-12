package br.com.wex.listaatividade.selecaoAninhada;

import java.util.Scanner;

public class Atividade32 {

	public static void main(String[] args) {
		
		String timeCasa;
		
		int golCasa;
		
		String timeFora;
		
		int golFora;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o time da casa ? ");
		
		timeCasa = scan.next();
		
		System.out.println("Qual o time de fora ?");
		
		timeFora = scan.next();
		
		System.out.println("Quantos gols fizeram o time da casa ?");
		
		golCasa = scan.nextInt();
		
		System.out.println("Quantos gols fizeram o time de fora ?");
		
		golFora = scan.nextInt();
		
		if(golCasa == golFora){
			
			System.out.println("A partida entre " + timeCasa + " e " + timeFora + " terminou empatada !" );
		}
		else if (golCasa > golFora){
			
			System.out.println("O time " + timeCasa + " ganhou o " + timeFora + " por " + golCasa + " x " + golFora);
		}
		else{
			
			System.out.println("O time " + timeFora + " ganhou o " + timeCasa + " por " + golFora + " x " + golCasa);
		}
	}

}
