package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemCultistaArrependido extends OrigemAbstrata {

    public OrigemCultistaArrependido(Atributos atributos) {
        this.nome = "Cultista Arrependido";
        this.periciaTreinada1 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.periciaTreinada2 = new Pericia("", "Treinado", 5, atributos, false, false, false);
        this.poder = new Poder("", "");
        this.descricao = "";
    }

}
