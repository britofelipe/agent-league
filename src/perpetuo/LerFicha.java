package perpetuo;

import java.util.ArrayList;

import models.personagem.Personagem;

public class LerFicha {

  public static ArrayList<Personagem> lerFichaDesserializacao() {
    // desserialização: recupera o array de personagem gravados no arquivo binário
    // "ficha.dat"
    ArrayList<Personagem> personagem = Empacotamento.lerArquivoBinario("ficha.dat");
    return personagem;
  }
}