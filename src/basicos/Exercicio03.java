package basicos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Programa para converter os valores de duas variaveis A e B
		
		
		// Precisamos de um leitor para ler os dados digitados pelo usu�rio
		Scanner leitor = new Scanner (System.in);
		
		// Declarando as variaveis e fazendo a leitora!
		int a,b;
		
		// Lendo o primeiro valor 
		System.out.println("Receber� dois valores e inverter� entre si as variaveis!");
		System.out.print("Informe o primeiro n�mero inteiro que ser� armazenado em A: ");
		a = leitor.nextInt();
		
		System.out.print("Informe o segundo n�mero inteiro que ser� armazenado em B: ");
		b = leitor.nextInt();

		// Vamos acumular e usando os m�todos matem�ticos, converter os valores das vari�veis entre si
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("A convers�o dos n�meros inteiros entre as variaveis � a = " + a + " e b = " + b);
	}

}
