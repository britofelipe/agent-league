package grafics.ficha;

import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import models.personagem.Personagem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.Border;

public class FichaPersonagem extends JFrame {
    
    /**
     * @param personagem
     */
    public FichaPersonagem(Personagem personagem) {
        super(personagem.getId() + ": " + personagem.getJogador());

        // Criando o container para varias abas em um JFrame
        JTabbedPane fichaCompleta = new JTabbedPane();

        // Criando os Panels para cada aba
        JPanel fichadoAgente = new JPanel();
        JPanel descricaodoAgente = new JPanel();
        JPanel fichadeRituais = new JPanel();

        // Atribuindo a configuração de BorderLayout ao painel Ficha do Agente e configurando para o JFrame ficar maximizado ao abrir a ficha
        fichadoAgente.setLayout(new BorderLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Criando uma borda de linha continua preta para fazer as separações dos blocos da ficha
        Border blackline = BorderFactory.createLineBorder(Color.black);

        // Criando o painel superior que irá conter os nomes do Personagem, Jogador, Origem, Classe e Trilha
        JPanel janelaPrincipalNorth = new JPanel();

        // Atribuindo a configuração de FlowLayout ao painel superior para facilitar o design da ficha
        FlowLayout flowLayout = new FlowLayout();
        janelaPrincipalNorth.setLayout(flowLayout);

        /*InformacaoBasica informacaoBasica = new InformacaoBasica(personagem.getJogador());
        informacaoBasica.setPreferredSize(new Dimension(getWidth() * 3 / 5, getHeight()));
        add(informacaoBasica, BorderLayout.NORTH);*/

        // Criando os sub paineis que irão conter as informações citadas. O sub painel 1 conterá Personagem e Jogador
        // o sub painel 2 conterá Origem Classe e Trilha
        JPanel subJanelaPrincipalNorthParte1 = new JPanel();
        JPanel subJanelaPrincipalNorthParte2 = new JPanel();

        // Atribuindo a configuração de GroupLayout aos sub paineis pois foi analisado que é o Layout mais adequado para a construção
        GroupLayout groupLayoutSubJanelaPrincipalNorthParte1 = new GroupLayout(subJanelaPrincipalNorthParte1);
        groupLayoutSubJanelaPrincipalNorthParte1.setAutoCreateGaps(true);
        groupLayoutSubJanelaPrincipalNorthParte1.setAutoCreateContainerGaps(true);
        subJanelaPrincipalNorthParte1.setLayout(groupLayoutSubJanelaPrincipalNorthParte1);

        GroupLayout groupLayoutSubJanelaPrincipalNorthParte2 = new GroupLayout(subJanelaPrincipalNorthParte2);
        groupLayoutSubJanelaPrincipalNorthParte2.setAutoCreateGaps(true);
        groupLayoutSubJanelaPrincipalNorthParte2.setAutoCreateContainerGaps(true);
        subJanelaPrincipalNorthParte2.setLayout(groupLayoutSubJanelaPrincipalNorthParte2);

        // Criando os Label e TextFields
        JLabel nomePersonagemLabel = new JLabel("Personagem: ");
        JLabel nomeJogadorLabel = new JLabel("Jogador: ");
        JLabel nomeOrigemLabel = new JLabel("Origem: ");
        JLabel nomeClasseLabel = new JLabel("Classe: ");
        JLabel nomeTrilhaLabel = new JLabel("Trilha: ");

        JTextField nomePersonagemTextField = new JTextField(20);
        JTextField nomeJogadorTextField = new JTextField(20);
        JTextField nomeOrigemTextField = new JTextField(20);
        JTextField nomeClasseTextField = new JTextField(20);
        JTextField nomeTrilhaTextField = new JTextField(20);

        // Organizando os elementos na ordem desejada e na posição desejada
        GroupLayout.SequentialGroup groupParte1Horizontal = groupLayoutSubJanelaPrincipalNorthParte1.createSequentialGroup();
        groupParte1Horizontal.addGroup(groupLayoutSubJanelaPrincipalNorthParte1.createParallelGroup()
            .addComponent(nomePersonagemLabel)
            .addComponent(nomeJogadorLabel)
        );
        groupParte1Horizontal.addGroup(groupLayoutSubJanelaPrincipalNorthParte1.createParallelGroup()
            .addComponent(nomePersonagemTextField)
            .addComponent(nomeJogadorTextField)
        );
        groupLayoutSubJanelaPrincipalNorthParte1.setHorizontalGroup(groupParte1Horizontal);

        GroupLayout.SequentialGroup groupParte1Vertical = groupLayoutSubJanelaPrincipalNorthParte1.createSequentialGroup();
        groupParte1Vertical.addGroup(groupLayoutSubJanelaPrincipalNorthParte1.createParallelGroup(Alignment.BASELINE)
            .addComponent(nomePersonagemLabel)
            .addComponent(nomePersonagemTextField)
        );
        groupParte1Vertical.addGroup(groupLayoutSubJanelaPrincipalNorthParte1.createParallelGroup(Alignment.BASELINE)
            .addComponent(nomeJogadorLabel)
            .addComponent(nomeJogadorTextField)
        );
        groupLayoutSubJanelaPrincipalNorthParte1.setVerticalGroup(groupParte1Vertical);

        GroupLayout.SequentialGroup groupParte2Horizontal = groupLayoutSubJanelaPrincipalNorthParte2.createSequentialGroup();
        groupParte2Horizontal.addGroup(groupLayoutSubJanelaPrincipalNorthParte2.createParallelGroup()
            .addComponent(nomeOrigemLabel)
            .addComponent(nomeClasseLabel)
            .addComponent(nomeTrilhaLabel)
            
        );
        groupParte2Horizontal.addGroup(groupLayoutSubJanelaPrincipalNorthParte2.createParallelGroup()
            .addComponent(nomeOrigemTextField)
            .addComponent(nomeClasseTextField)
            .addComponent(nomeTrilhaTextField)
        );
        groupLayoutSubJanelaPrincipalNorthParte2.setHorizontalGroup(groupParte2Horizontal);

        GroupLayout.SequentialGroup groupParte2Vertical = groupLayoutSubJanelaPrincipalNorthParte2.createSequentialGroup();
        groupParte2Vertical.addGroup(groupLayoutSubJanelaPrincipalNorthParte2.createParallelGroup(Alignment.BASELINE)
            .addComponent(nomeOrigemLabel)
            .addComponent(nomeOrigemTextField)
        );
        groupParte2Vertical.addGroup(groupLayoutSubJanelaPrincipalNorthParte2.createParallelGroup(Alignment.BASELINE)
            .addComponent(nomeClasseLabel)
            .addComponent(nomeClasseTextField)
        );
        groupParte2Vertical.addGroup(groupLayoutSubJanelaPrincipalNorthParte2.createParallelGroup(Alignment.BASELINE)
            .addComponent(nomeTrilhaLabel)
            .addComponent(nomeTrilhaTextField)
        );
        groupLayoutSubJanelaPrincipalNorthParte2.setVerticalGroup(groupParte2Vertical);

        janelaPrincipalNorth.add(subJanelaPrincipalNorthParte1);
        janelaPrincipalNorth.add(subJanelaPrincipalNorthParte2);

        janelaPrincipalNorth.setBorder(blackline);

        JPanel janelaPrincipalWest = new JPanel();

        GroupLayout groupLayoutJanelaPrincipalWest = new GroupLayout(janelaPrincipalWest);
        groupLayoutJanelaPrincipalWest.setAutoCreateGaps(true);
        groupLayoutJanelaPrincipalWest.setAutoCreateContainerGaps(true);
        janelaPrincipalWest.setLayout(groupLayoutJanelaPrincipalWest);

        JLabel atributosLabel = new JLabel("Atributos");
        JLabel periciasLabel = new JLabel("Perícias");

        JPanel atributosPanel = new JPanel();
        JPanel periciasPanel = new JPanel();

        JLabel atributoForLabel = new JLabel("Força: ");
        JLabel atributoAgiLabel = new JLabel("Agilidade: ");
        JLabel atributoIntLabel = new JLabel("Inteligência: ");
        JLabel atributoVigLabel = new JLabel("Vigor: ");
        JLabel atributoPreLabel = new JLabel("Presença: ");

        MaskFormatter mascaraValorAtributo = null;

        try{
            mascaraValorAtributo = new MaskFormatter("##");
            mascaraValorAtributo.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        JFormattedTextField valorAtributoForFormattedTextField = new JFormattedTextField(mascaraValorAtributo);
        JFormattedTextField valorAtributoAgiFormattedTextField = new JFormattedTextField(mascaraValorAtributo);
        JFormattedTextField valorAtributoIntFormattedTextField = new JFormattedTextField(mascaraValorAtributo);
        JFormattedTextField valorAtributoVigFormattedTextField = new JFormattedTextField(mascaraValorAtributo);
        JFormattedTextField valorAtributoPreFormattedTextField = new JFormattedTextField(mascaraValorAtributo);

        GroupLayout.SequentialGroup groupAtributosPericiasHorizontal = groupLayoutJanelaPrincipalWest.createSequentialGroup();
        groupAtributosPericiasHorizontal.addGroup(groupLayoutJanelaPrincipalWest.createParallelGroup()
            .addComponent(atributosLabel)
            .addComponent(atributosPanel)
        );
        groupAtributosPericiasHorizontal.addGroup(groupLayoutJanelaPrincipalWest.createParallelGroup()
            .addComponent(periciasLabel)
            .addComponent(periciasPanel)
        );
        groupLayoutJanelaPrincipalWest.setHorizontalGroup(groupAtributosPericiasHorizontal);

        GroupLayout.SequentialGroup groupAtributosPericiasVertical = groupLayoutJanelaPrincipalWest.createSequentialGroup();
        groupAtributosPericiasVertical.addGroup(groupLayoutJanelaPrincipalWest.createParallelGroup(Alignment.BASELINE)
            .addComponent(atributosLabel)
            .addComponent(periciasLabel)
        );
        groupAtributosPericiasVertical.addGroup(groupLayoutJanelaPrincipalWest.createParallelGroup(Alignment.BASELINE)
            .addComponent(atributosPanel)
            .addComponent(periciasPanel)
        );
        groupLayoutJanelaPrincipalWest.setVerticalGroup(groupAtributosPericiasVertical);

        janelaPrincipalWest.setBorder(blackline);
        fichadoAgente.add(janelaPrincipalWest, BorderLayout.WEST);

        fichadoAgente.add(janelaPrincipalNorth, BorderLayout.NORTH);
        
        fichaCompleta.addTab("Ficha do Agente", fichadoAgente);
        fichaCompleta.addTab("Descrição do Agente", descricaodoAgente);
        fichaCompleta.addTab("Ficha de Rituais", fichadeRituais);
        add(fichaCompleta);
        
        setVisible(true);
    }
}
