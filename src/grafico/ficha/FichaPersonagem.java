package grafico.ficha;

import javax.swing.UIManager;

import models.personagem.Personagem;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.*;

public class FichaPersonagem extends JFrame {
	public FichaPersonagem(Personagem personagem) {
	    super(personagem.getJogador());
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(350, 350);
	    setLocation(400, 200);

	    setLayout(new BorderLayout());

	    setVisible(true);
	  }
}
