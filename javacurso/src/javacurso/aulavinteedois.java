package javacurso;

import java.util.Scanner;

public class aulavinteedois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		System.out.println("quantas pernas?");
		int perna = tec.nextInt();
		String tipo;
		System.out.println("isso � um(a): ");
		switch (perna) {
			case 1:
				tipo = "saci";
				break;
			case 2:
				tipo = "b�pede";
				break;
			case 3:
				tipo = "trip�";
				break;
			case 4:
				tipo = "quadr�pede";
				break;
			case 6, 8:
				tipo = "aranha";
				break;
			default:
				tipo = "et";
				break;
		}	
		System.out.println(tipo);

	}

}
