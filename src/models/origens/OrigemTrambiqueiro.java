package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemTrambiqueiro extends OrigemAbstrata {

    public OrigemTrambiqueiro(Atributos atributos) {
        this.nome = "Trambiqueiro";
        this.periciaTreinada1 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.periciaTreinada2 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.poder = new Poder("", "");
        this.descricao = "";
    }

}