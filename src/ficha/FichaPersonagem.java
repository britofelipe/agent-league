package ficha;

import javax.swing.UIManager;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.*;

public class FichaPersonagem extends JFrame {
	public FichaPersonagem() {
	    super("Personagem");
	   
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(350, 350);
	    setLocation(400, 200);

	    setLayout(new BorderLayout());

	    setVisible(true);
	  }
}
