package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemVitima extends OrigemAbstrata {

    public OrigemVitima(Atributos atributos) {
        this.nome = "Vítima";
        this.periciaTreinada1 = new Pericia("Reflexos", "Treinado", 5, atributos.getAgilidade(), false, false, false);
        this.periciaTreinada2 = new Pericia("Vontade", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.poder = new Poder("Cicatrizes Psicológicas", "Voc\u00EA recebe +1 de Sanidade para cada 5% de NEX.");
        this.descricao = "Em algum momento de sua vida \u2014 inf\u00E2ncia, juventude ou in\u00EDcio da vida adulta \u2014 voc\u00EA encontrou o paranormal... E a experi\u00EAncia n\u00E3o foi nada boa. Voc\u00EA viu os esp\u00EDritos dos mortos, foi atacado por uma entidade ou mesmo foi sequestrado para ser sacrificado em um ritual impedido no \u00FAltimo momento. A experi\u00EAncia foi traum\u00E1tica, mas voc\u00EA n\u00E3o se abateu; em vez disso, decidiu lutar para impedir que outros inocentes passem pelo mesmo. E, j\u00E1 tendo sendo v\u00EDtima do paranormal, se tornou habilidoso em evitar perigos.";
    }

}