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
import grafics.ficha.FichaPersonagem;
import grafics.ficha.InformacaoBasica;
import models.personagem.Personagem;

public class Administrador extends JFrame implements ActionListener {
    private JButton acrescentarButton;
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

        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        fichasList = new JList<>(listModel);
        fichasList.setCellRenderer(new PersonagemListRenderer());
        JScrollPane scrollPane = new JScrollPane(fichasList);

        add(scrollPane, BorderLayout.CENTER);
        add(acrescentarButton, BorderLayout.NORTH);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeJogador = JOptionPane.showInputDialog(Administrador.this, "Digite o nome do jogador:");
        if (nomeJogador != null) {
            Personagem personagem = new Personagem(game.getNumeroPersonagens() + 1, nomeJogador);
            game.addPersonagem(personagem);
            listModel.addElement(personagem);
            FichaPersonagem fichaPersonagem = new FichaPersonagem(personagem);
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
