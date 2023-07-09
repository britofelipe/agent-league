package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemMercenario extends OrigemAbstrata {

    public OrigemMercenario(Atributos atributos) {
        this.nome = "Mercenário";
        this.periciaTreinada1 = new Pericia("Iniciativa", "Treinado", 5, atributos.getAgilidade(), false, false, false);
        this.periciaTreinada2 = new Pericia("Intimidação", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.poder = new Poder("Posição de Combate", "No primeiro turno de cada cena de a\u00E7\u00E3o, voc\u00EA pode gastar 2 PE para receber uma a\u00E7\u00E3o de movimento adicional.");
        this.descricao = "Voc\u00EA \u00E9 um soldado de aluguel, que trabalha sozinho ou como parte de alguma organiza\u00E7\u00E3o que vende servi\u00E7os militares. Escoltas e assassinatos fizeram parte de.sua rotina por tempo o suficiente para voc\u00EA se envolver em alguma situa\u00E7\u00E3o com o paranormal.";
    }

}