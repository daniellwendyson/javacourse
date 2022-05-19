package javacurso;

public class aulatrintaeum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int cc=0; cc<=3; cc++) {
			System.out.println("cambalhota");
		}
		
		for (int c=0; c<=100; c+=10) {
			if (c == 0) {
				System.out.println(c + 1);
				continue;
			}
			System.out.println(c);
		}
		
		
		for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println("I = " + i + "  ~~~~~~  J = " + j);
                
            }
        }
		
		
	}

}
