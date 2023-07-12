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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import game.AgentLeague;
import game.exception.PersonagemExistenteException;
import grafics.dado.DadoFrame;
import grafics.ficha.FichaPersonagem;
import grafics.ficha.InformacaoBasica;
import models.personagem.Personagem;
import perpetuo.*;

public class Administrador extends JFrame implements ActionListener, MouseListener {
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

    listModel = new DefaultListModel();
    fichasList = new JList(listModel);
    fichasList.setCellRenderer(new PersonagemListRenderer());
    fichasList.addMouseListener(this);
    JScrollPane scrollPane = new JScrollPane(fichasList);

    ArrayList<Personagem> lista = new LerFicha().lerFichaDesserializacao();
    for (Personagem element : lista) {
      try{
        game.addPersonagem(element);
      } catch(PersonagemExistenteException pee){
        System.out.println(pee.getMessage());
      }
      listModel.addElement(element);
    }

    add(scrollPane, BorderLayout.CENTER);
    add(acrescentarButton, BorderLayout.NORTH);
    add(buttonPanel, BorderLayout.SOUTH);

    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        // Executa o processo de serialização antes de fechar a janela
        FazerFicha obj = new FazerFicha(listModel);  
        // Fecha a janela
        dispose();
      }
    });

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
  
  @Override
  public void mouseClicked(MouseEvent e) {
    if (e.getClickCount() == 2) {
      JList<Personagem> list = (JList<Personagem>) e.getSource();
      int index = list.locationToIndex(e.getPoint());
      Personagem personagem = list.getModel().getElementAt(index);
      // Criação do Frame FichaPersonagem para o personagem selecionado
      FichaPersonagem fichaPersonagem = new FichaPersonagem(personagem);
    }
  }
  @Override
  public void mouseExited(MouseEvent e) {
    // Código do método mouseExited, se necessário
  }
  @Override
  public void mouseEntered(MouseEvent e) {
    // Código do método mouseEntered, se necessário
  }
  @Override
  public void mouseReleased(MouseEvent e) {
    // Código do método mouseEntered, se necessário
  }
  @Override
  public void mousePressed(MouseEvent e) {
    // Código do método mouseEntered, se necessário
  }
}
