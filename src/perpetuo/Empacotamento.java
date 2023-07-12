package perpetuo;

import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


import models.personagem.Personagem;

public class Empacotamento {
  // serialização: gravando o objetos no arquivo binário "nomeArq"
  public static void gravarArquivoBinario(ArrayList<Personagem> lista, String nomeArq) {
    String pathDir = "./agent-league/src/arquivo";
    File diretorio = new File(pathDir);
    if (!diretorio.isDirectory()) {
      diretorio.mkdir();
    }
    try{
      String pathArquivo = pathDir + "/" + nomeArq;
      ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(pathArquivo));
      objOutput.writeObject(lista);
      objOutput.close();
    } catch(IOException exp){
      exp.printStackTrace();
    }
  }

  // desserialização: recuperando os objetos gravados no arquivo binário "nomeArq"
  public static ArrayList<Personagem> lerArquivoBinario(String nomeArq)  {
    ArrayList<Personagem> lista = new ArrayList();
    String pathDir = "./agent-league/src/arquivo";
    File diretorio = new File(pathDir);
    if (!diretorio.isDirectory()) {
      diretorio.mkdir();
    }
    File arquivo = new File(diretorio, nomeArq);
    if (arquivo.exists()) {
      try{
        ObjectInputStream objInput = new ObjectInputStream(new             
        FileInputStream(arquivo));
        lista = (ArrayList<Personagem>)objInput.readObject();
        objInput.close();
      } catch(IOException exp){
          exp.printStackTrace();
      } catch(ClassNotFoundException e){
          e.printStackTrace();
      }
    } 
    return(lista);
  }
}