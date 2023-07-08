package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemUniversitario extends OrigemAbstrata {

    public OrigemUniversitario(Atributos atributos) {
        this.nome = "Universitário";
        this.periciaTreinada1 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.periciaTreinada2 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.poder = new Poder("", "");
        this.descricao = "";
    }

}