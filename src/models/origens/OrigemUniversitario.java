package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemUniversitario extends OrigemAbstrata {

    public OrigemUniversitario(Atributos atributos) {
        this.nome = "Universitário";
        this.periciaTreinada1 = new Pericia("Atualidades", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.periciaTreinada2 = new Pericia("Investigação", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.poder = new Poder("Dedicação", "Voc\u00EA recebe +1 PE, e mais 1 PE adicionala cada NEX \u00EDmpar (15%, 25%...). Al\u00E9m disso, seu limite de PE por turno aumenta em 1 (em NEX 5% seu limite \u00E9 2, em NEX 10% \u00E9 3 e assim por diante; isso n\u00E3o afeta a DT de seus efeitos).");
        this.descricao = "Voc\u00EA era aluno de uma faculdade. Em sua rotina de estudos, provas e festas, acabou descobrindo algo \u2014 talvez um livro amaldi\u00E7oado na antiga biblioteca do campus? Por seu achado, foi convocado pela Ordem. Agora, estuda com mais afinco: nesse novo curso, ouviu dizer que as provas podem ser mortais.";
    }

}