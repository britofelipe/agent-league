package perpetuo;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

import models.personagem.Personagem;

public class FazerFicha {
  public FazerFicha(DefaultListModel<Personagem> listModelFromFichaPersonagem){
    ArrayList<Personagem> personagem;
    // 1) entrada de dados
    personagem = Collections.<Personagem>list(listModelFromFichaPersonagem.elements());
    // 2) serialização: gravando o objeto no arquivo binário "ficha.dat"
    Empacotamento.gravarArquivoBinario(personagem, "ficha.dat");  
  }
}