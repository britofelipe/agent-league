package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemEngenheiro extends OrigemAbstrata {

    public OrigemEngenheiro(Atributos atributos) {
        this.nome = "Engenheiro";
        this.periciaTreinada1 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.periciaTreinada2 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.poder = new Poder("", "");
        this.descricao = "";
    }

}
