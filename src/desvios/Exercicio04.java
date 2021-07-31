package desvios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		
		//Um robô de combate só deve ativar sua arma principal quando o inimigo está menos de 70c  de distancia . Faça um programa onde o usuário informe a distância do inimigo e sejam exibidas as mensagens "ATIVADO" ou " DESATIVADO" dependendo do status da arma
		
		Scanner leitor = new Scanner (System.in);
		
		double distancia;
		
		System.out.println("Programa para verificar a distancia minima para ativação da arma principal!");
		System.out.print("Informe a distancia do inimigo: ");
		distancia = leitor.nextDouble();
		
		// Usando os desvios condicionais vamos verificar se a distancia informada pelo usuário é valida para ativação da arma principal
		
		if (distancia >= 70) {
			System.out.println("ATIVAD0");
		} else {
			System.out.println("DESATIVAD0");
		}
	}

}
