package desvios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		
		//Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� menos de 70c  de distancia . Fa�a um programa onde o usu�rio informe a dist�ncia do inimigo e sejam exibidas as mensagens "ATIVADO" ou " DESATIVADO" dependendo do status da arma
		
		Scanner leitor = new Scanner (System.in);
		
		double distancia;
		
		System.out.println("Programa para verificar a distancia minima para ativa��o da arma principal!");
		System.out.print("Informe a distancia do inimigo: ");
		distancia = leitor.nextDouble();
		
		// Usando os desvios condicionais vamos verificar se a distancia informada pelo usu�rio � valida para ativa��o da arma principal
		
		if (distancia >= 70) {
			System.out.println("ATIVAD0");
		} else {
			System.out.println("DESATIVAD0");
		}
	}

}
