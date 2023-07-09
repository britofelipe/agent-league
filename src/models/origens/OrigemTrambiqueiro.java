package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemTrambiqueiro extends OrigemAbstrata {

    public OrigemTrambiqueiro(Atributos atributos) {
        this.nome = "Trambiqueiro";
        this.periciaTreinada1 = new Pericia("Crime", "Treinado", 5, atributos.getAgilidade(), true, true, true);
        this.periciaTreinada2 = new Pericia("Enganação", "Treinado", 5, atributos.getPresenca(), false, false, true);
        this.poder = new Poder("Impostor", "Uma vez por cena, voc\u00EA pode gastar 2 PE para substituir um teste de per\u00EDcia qualquer por um teste de Engana\u00E7\u00E3o.");
        this.descricao = "Uma vida digna exige muito trabalho, ent\u00E3o \u00E9 melhor nem tentar. Voc\u00EA vivia de pequenos golpes, jogatina ilegale falcatruas. Certo dia, enganou a pessoa errada; no dia seguinte, se viu servindo \u00E0 Ordem. Pelo menos agora tem a chance de usar sua l\u00E1bia para o bem.";
    }

}