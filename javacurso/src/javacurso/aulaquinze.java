package javacurso;

public class aulaquinze {

	public static void main(String[] args) {
		
		int n1, n2, r;
		n1 = 4;
		n2 = 8;
		r = (n1>n2)?n1:n2;
		// r = (n1>n2)?n1+n2:n1-n2;
		System.out.println(r);
		
		
		String nome1 = "Daniell";
		String nome2 = "Daniell";
		String nome3 = new String("Daniell");
		String res;
		res = (nome1==nome2)?"igual":"diferente";
		// res = (nome1.equals(nome3))?"igual":"diferente";
		System.out.println(res);
		
		int x, y, z;
		x = 4;
		y = 7;
		z = 12;
		boolean resu;
		resu = (x<y && y<z)?true:false;
		// resu = (x<y || y<z)?true:false;
		// resu = (x<y ^ y<z)?true:false;
		System.out.println(resu);
		
		
		
		
	}

}
