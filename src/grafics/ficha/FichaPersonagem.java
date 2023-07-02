package grafics.ficha;

import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import models.personagem.Personagem;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.*;

public class FichaPersonagem extends JFrame {
    public FichaPersonagem(Personagem personagem) {
        super(personagem.getId() + ": " + personagem.getJogador());

        setLayout(new BorderLayout());
        setSize(350, 600);
        setLocation(500, 50);
        
        InformacaoBasica informacaoBasica = new InformacaoBasica(personagem.getJogador());
        informacaoBasica.setPreferredSize(new Dimension(getWidth() * 3 / 5, getHeight()));
        add(informacaoBasica, BorderLayout.WEST);
        
        getRootPane().setBorder(new EmptyBorder(10, 10, 10, 10));
        
        setVisible(true);
    }
}
