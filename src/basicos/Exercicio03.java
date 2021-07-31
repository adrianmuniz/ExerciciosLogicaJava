package basicos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Programa para converter os valores de duas variaveis A e B
		
		
		// Precisamos de um leitor para ler os dados digitados pelo usuário
		Scanner leitor = new Scanner (System.in);
		
		// Declarando as variaveis e fazendo a leitora!
		int a,b;
		
		// Lendo o primeiro valor 
		System.out.println("Receberá dois valores e inverterá entre si as variaveis!");
		System.out.print("Informe o primeiro número inteiro que será armazenado em A: ");
		a = leitor.nextInt();
		
		System.out.print("Informe o segundo número inteiro que será armazenado em B: ");
		b = leitor.nextInt();

		// Vamos acumular e usando os métodos matemáticos, converter os valores das variáveis entre si
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("A conversão dos números inteiros entre as variaveis é a = " + a + " e b = " + b);
	}

}
