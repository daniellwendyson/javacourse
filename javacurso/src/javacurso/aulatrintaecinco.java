package javacurso;

public class aulatrintaecinco {
	
	static int soma1(int a, int b) {
		int s = a + b;
		return s;
	}
	
	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("a soma é: "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		soma(5,2);
		int sm = soma1(5,2);
		System.out.println("a soma vale: "+sm);
		
		
		System.out.println("vai começar a contagem!");
		System.out.println(aulatrintaecinco2.contador(1,5));

	}

}
