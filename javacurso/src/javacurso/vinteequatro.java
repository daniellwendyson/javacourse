package javacurso;

public class vinteequatro {

	public static void main(String[] args) {
		int cc = 1;
		while (cc<=4) {
			System.out.println("cambalhota " + cc);
			cc++;
		}
		
		int cc1 = 0;
		while (cc1<10) {
			cc1++;
			if (cc1 == 2 || cc1 == 3 || cc1 == 4) {
				continue;
			}
			if (cc1 == 7) {
				break;
			}
			System.out.println("cambalhotas " + cc1);
		}
		
		

	}

}
