package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemPolicial extends OrigemAbstrata {

    public OrigemPolicial(Atributos atributos) {
        this.nome = "Policial";
        this.periciaTreinada1 = new Pericia("Percepção", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.periciaTreinada2 = new Pericia("Pontaria", "Treinado", 5, atributos.getAgilidade(), false, false, false);
        this.poder = new Poder("Patrulha", "Voc\u00EA recebe +2 em Defesa");
        this.descricao = "Voc\u00EA fez parte de uma for\u00E7a de seguran\u00E7a p\u00FAblica, civil ou militar. Em alguma patrulha ou chamado se deparou com um caso paranormal e sobreviveu para contar a hist\u00F3ria.";
    }

}