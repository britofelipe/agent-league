package grafics;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import javax.swing.ListCellRenderer;

import game.AgentLeague;
import game.exception.PersonagemExistenteException;
import grafics.dado.DadoFrame;
import grafics.ficha.FichaPersonagem;
import grafics.ficha.InformacaoBasica;
import models.personagem.Personagem;

public class Administrador extends JFrame implements ActionListener {
    private JButton acrescentarButton;
    private JButton rolagemDadosButton;
    private JList<Personagem> fichasList;
    private DefaultListModel<Personagem> listModel;
    private AgentLeague game;

    public Administrador(AgentLeague game) {
    	super("Administrador");
        this.game = game;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocation(400, 200);

        acrescentarButton = new JButton("+ Acrescentar Ficha de Personagem");
        acrescentarButton.addActionListener(this);
        
        rolagemDadosButton = new JButton("Rolagem de dados");
        rolagemDadosButton.addActionListener(this);
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(acrescentarButton);
        buttonPanel.add(rolagemDadosButton);

        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        fichasList = new JList<>(listModel);
        fichasList.setCellRenderer(new PersonagemListRenderer());
        JScrollPane scrollPane = new JScrollPane(fichasList);

        add(scrollPane, BorderLayout.CENTER);
        add(acrescentarButton, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == acrescentarButton) {
	        String nomeJogador = JOptionPane.showInputDialog(Administrador.this, "Digite o nome do jogador:");
	        if (nomeJogador != null) {
	            Personagem personagem = new Personagem(game.getNumeroPersonagens() + 1, nomeJogador);
	            try {
	            	game.addPersonagem(personagem);
	            } catch (PersonagemExistenteException pee) {
	            	System.out.println(pee.getMessage());
	            }
	            listModel.addElement(personagem);
	            FichaPersonagem fichaPersonagem = new FichaPersonagem(personagem);
	        }
        } else if (e.getSource() == rolagemDadosButton) {
            DadoFrame dadoFrame = new DadoFrame();
        }
    }
    
    private class PersonagemListRenderer extends JLabel implements ListCellRenderer<Personagem> {
        public PersonagemListRenderer() {
            setOpaque(true);
            setBorder(new EmptyBorder(5, 10, 5, 10));
            setFont(getFont().deriveFont(Font.PLAIN, 16));
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Personagem> list, Personagem personagem,
                                                      int index, boolean isSelected, boolean cellHasFocus) {
            setText("ID: " + personagem.getId() + "  Jogador: " + personagem.getJogador());

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            return this;
        }
    }
}
