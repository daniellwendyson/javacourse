package javacurso;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class auladois {

	public static void main(String[] args) {
	
	// hora e data atuais do sistema.
		
		Date relogio = new Date();
		System.out.println("a hora do sistema é: "+relogio.toString());
		
	// idioma do seu sistema operacional.
		
		Locale loc = Locale.getDefault();
		System.out.println("seu sistema está em: "+loc.getDisplayLanguage());
		
	// resolução da sua tela.
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("sua tela tem resolução: "+d.width+"x"+d.height);
		
	}

}
