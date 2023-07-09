package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemMilitar extends OrigemAbstrata {

    public OrigemMilitar(Atributos atributos) {
        this.nome = "Militar";
        this.periciaTreinada1 = new Pericia("Pontaria", "Treinado", 5, atributos.getAgilidade(), false, false, false);
        this.periciaTreinada2 = new Pericia("Tática", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.poder = new Poder("Para Bellum", "Voc\u00EA recebe +2 em rolagens de dano com armas de fogo.");
        this.descricao = "Voc\u00EA serviu em uma for\u00E7a militar, como o ex\u00E9rcito ou a marinha. Passou muito tempo treinando com armas de fogo, at\u00E9 se tornar um perito no uso delas. Acostumado a obedecer ordens e partir em miss\u00F5es, est\u00E1 em casa na Ordo Realitas. O inimigo \u00E9 diferente, mas um tiro bem dado continua resolvendo o problema.";
    }

}