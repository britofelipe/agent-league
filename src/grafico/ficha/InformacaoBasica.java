package grafico.ficha;

import javax.swing.*;
import java.awt.*;

public class InformacaoBasica extends JPanel {
    private JLabel nomePersonagemLabel;
    private JLabel nomeJogadorLabel;
    
    public InformacaoBasica(String nomeJogador) {
        setLayout(new BorderLayout());
        
        nomeJogadorLabel = new JLabel("Nome do Jogador: " + nomeJogador);

        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        infoPanel.add(nomeJogadorLabel);

        add(infoPanel, BorderLayout.NORTH);
    }

    public InformacaoBasica(String nomePersonagem, String nomeJogador) {
        setLayout(new BorderLayout());

        nomePersonagemLabel = new JLabel("Nome do Personagem: " + nomePersonagem);
        nomeJogadorLabel = new JLabel("Nome do Jogador: " + nomeJogador);

        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        infoPanel.add(nomePersonagemLabel);
        infoPanel.add(nomeJogadorLabel);

        add(infoPanel, BorderLayout.NORTH);
    }
}
