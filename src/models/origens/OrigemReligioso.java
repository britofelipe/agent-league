package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemReligioso extends OrigemAbstrata {

    public OrigemReligioso(Atributos atributos) {
        this.nome = "Religioso";
        this.periciaTreinada1 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.periciaTreinada2 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.poder = new Poder("", "");
        this.descricao = "";
    }

}