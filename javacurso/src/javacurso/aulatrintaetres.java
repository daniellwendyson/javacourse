package javacurso;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class aulatrintaetres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = {3,2,8,7,5,4};
		
		for(int c=0; c<n.length; c++) {
			System.out.println("na posição "+c+" temos o valor "+n[c]);
		}
		
		Calendar calendario = GregorianCalendar.getInstance();
		int ano = calendario.get(Calendar.YEAR);
		
		String mes[] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int c=0; c<mes.length; c++) {
			if ((ano % 4 ==0) && (ano % 100 != 0) || (ano % 400 == 0)) {
				tot[1] = 29;
				System.out.println("o mês de "+ mes[c] + " tem " + tot[c] + " dias ao todo.");
			}else {
				System.out.println("o mês de "+ mes[c] + " tem " + tot[c] + " dias ao todo.");
			}
		}
		
		
		
		double v[] = {3.5,2.75,9,-4.5};
		Arrays.sort(v);
		for(double valor: v) {
			System.out.println(valor);
		}
		
		
		int vet[] = {3,7,6,1,9,4,2};
		for(int val:vet) {
			System.out.print(val + " ");
		}
		System.out.println("");
		int p = Arrays.binarySearch(vet, 1);
		System.out.println("encontrei o valor na posição "+p);
		
		
		int ve[] = new int[20];
		Arrays.fill(ve, 0);
		for(int valval: ve) {
			System.out.print(valval + " ");
		}
		
		
		
		
	}

}
