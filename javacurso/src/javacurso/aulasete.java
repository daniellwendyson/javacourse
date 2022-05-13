package javacurso;

import java.util.Scanner;

public class aulasete {

	public static void main(String[] args) {
		
		/*
		 * float nota = 8.5f;
		 * String nome = "Daniell";
		 * System.out.println("sua nota é: "+nota);
		 * System.out.printf("a nota de %s é: %.1f \n", nome, nota);
		 */
		
	    /*  	
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("digite o nome do aluno: ");
		 * String nome = teclado.nextLine();
		 * System.out.println("digite a nota do aluno: ");
		 * float nota = teclado.nextFloat();
		 * System.out.printf("a nota de "+nome+" é: "+nota);
		 */
		
		int idade = 30;
		String valor = Integer.toString(idade);
		System.out.println(valor);
		
		String valor1 = "30";
		int idade1 = Integer.parseInt(valor1);
		System.out.println(idade1);
		
		String valor2 = "30.5";
		float idade2 = Float.parseFloat(valor2);
		System.out.println(idade2);		
		
		
		
	}

}
