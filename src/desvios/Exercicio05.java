package desvios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		// Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usu�rio, um programa deve indicar qual deles deve ser carregado pelo drone.
		
		Scanner leitor = new Scanner (System.in);
		
		int lixo01, lixo02, lixo03;
		
		System.out.println("Qual lixo o drone deve carregar!");
		System.out.println("Informe o peso dos 3 lixos: ");
		lixo01 = leitor.nextInt();
		lixo02 = leitor.nextInt();
		lixo03 = leitor.nextInt();
		
		// Usando o desvio condicional encadeado vamos comparar as informa��es e realizar as instru��es conforme o resultado das condi��es
		
		if (lixo01 < lixo02 && lixo01 < lixo03) {
			System.out.println("O primeiro lixo informado � o mais leve!");
		} else if (lixo02 < lixo01 && lixo02 < lixo03) {
			System.out.println("O segundo lixo informado � o mais leve!");
		} else {
			System.out.println("O terceito lixo � o mais leve");
		}
		
		
	}

}
