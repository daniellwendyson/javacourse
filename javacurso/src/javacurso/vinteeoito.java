package javacurso;

import java.util.Scanner;

public class vinteeoito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cc = 0;
		do {
			System.out.println("cambalhota");
			cc++;
		}while (cc<4);
		
		
		int n, s=0;
		String resp;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("digite um número: ");
			n = teclado.nextInt();
			s += n; // s = s + n;
			System.out.print("quer continuar? [S/N]");
			resp = teclado.next();
		}while (resp.equals("S"));
		System.out.println("a soma de todos os valores é: "+s);
		
	}

}
