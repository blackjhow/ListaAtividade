package br.com.wex.listaatividade.selecaoSimples;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		
		int horaInicio = 0;
		
		int horaFinal = 0;
		
		int calculo = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hora de inicio do jogo :");
		
			horaInicio = scan.nextInt();
		
		System.out.println("Hora de término do jogo :");
		
			horaFinal = scan.nextInt();
		
		if(horaInicio == horaFinal){
			
			System.out.println("Tempo máximo de 24 horas atingido, fim de jogo !");}
		
		else if(horaInicio > horaFinal){
			
			calculo = ( 24 - horaInicio) + horaFinal  ;
			
			System.out.println("O jogo teve duração de " + calculo + " horas" );}
		
		else if((horaInicio > 24) && (horaFinal > 24)){
			
			System.out.println("Os horários não podem exceder 24 horas, dados incorretos");}
		
		else {
		
			calculo = horaFinal - horaInicio;
		
			System.out.println("O jogo teve duração de " + calculo + " horas" );
		
		}

	}

}
