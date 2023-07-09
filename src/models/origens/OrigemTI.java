package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemTI extends OrigemAbstrata {

    public OrigemTI(Atributos atributos) {
        this.nome = "T.I.";
        this.periciaTreinada1 = new Pericia("Investigação", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.periciaTreinada2 = new Pericia("Tecnologia", "Treinado", 5, atributos.getIntelecto(), true, false, true);
        this.poder = new Poder("Motor de Busca", "A crit\u00E9rio do Mestre, sempre que tiver acesso a internet, voc\u00EA pode gastar 2 PE para substituir um teste de per\u00EDcia qualquer por um teste de Tecnologia.");
        this.descricao = "Programador, engenheiro de software ou simplesmente \u201Co cara da T.I\u00BA, voc\u00EA tem treinamento e experi\u00EAncia para lidar com sistemas informatizados. Seu talento (ou curiosidade exagerada) chamou a aten\u00E7\u00E3o da Ordem.";
    }

}