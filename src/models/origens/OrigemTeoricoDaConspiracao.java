package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemTeoricoDaConspiracao extends OrigemAbstrata {

    public OrigemTeoricoDaConspiracao(Atributos atributos) {
        this.nome = "Teorico da Conspiração";
        this.periciaTreinada1 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.periciaTreinada2 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.poder = new Poder("", "");
        this.descricao = "";
    }

}