package javacurso;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class auladois {

	public static void main(String[] args) {
	
	// hora e data atuais do sistema.
		
		Date relogio = new Date();
		System.out.println("a hora do sistema �: "+relogio.toString());
		
	// idioma do seu sistema operacional.
		
		Locale loc = Locale.getDefault();
		System.out.println("seu sistema est� em: "+loc.getDisplayLanguage());
		
	// resolu��o da sua tela.
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("sua tela tem resolu��o: "+d.width+"x"+d.height);
		
	}

}
