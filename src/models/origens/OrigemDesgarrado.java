package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemDesgarrado extends OrigemAbstrata {

    public OrigemDesgarrado(Atributos atributos) {
        this.nome = "Desgarrado";
        this.periciaTreinada1 = new Pericia("Fortitude", "Treinado", 5, atributos.getVigor(), false, false, false);
        this.periciaTreinada2 = new Pericia("Sobrevivência", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.poder = new Poder("Calejado", "Voc\u00EA recebe +1 PV para cada 5% de NEX");
        this.descricao = "Voc\u00EA n\u00E3o vivia de acordo com as normas da sociedade. Podia ser um eremita, uma pessoa em situa\u00E7\u00E3o de rua ou simplesmente algu\u00E9m que descobriu o paranormal e abandonou sua rotina \u2014 sabendo o qu\u00E3o fr\u00E1gil era a exist\u00EAncia humana, n\u00E3o conseguia simplesmente continuar indo para o trabalho todo o dia. De qualquer forma, a vida sem os confortos modernos o deixou mais forte.";
    }

}
