package javacurso;

import java.util.Scanner;

public class auladezoito {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("primeira nota: ");
		float n1 = teclado.nextFloat();
		System.out.print("segunda nota: ");
		float n2 = teclado.nextFloat();
		float m = (n1+n2) / 2;
		System.out.println("sua média foi: "+m);
		if (m>9) {
			System.out.println("parabéns!");
		}
		
		System.out.print("em que ano você nasceu? ");
		int nasc = teclado.nextInt();
		int i = 2022-nasc;
		System.out.println("sua idade é: "+i);
		if (i>=18) {
			System.out.println("maior de idade!");
		}else {
			System.out.println("menor de idade!");
		}
		
		

	}

}
