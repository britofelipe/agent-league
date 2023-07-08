package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemAtleta extends OrigemAbstrata {
    
    public OrigemAtleta(Atributos atributos) {
        this.nome = "Atleta";
        this.periciaTreinada1 = new Pericia("Acrobacia", "Treinado", 5, atributos.getAgilidade(), false, false, false);
        this.periciaTreinada2 = new Pericia("", "Treinado", 5, atributos.getForca(), false, true, false);
        this.poder = new Poder("110%", "Quando faz um teste de per\u00EDcia usando For\u00E7a ou Agilidade (exceto Luta e Pontaria) voc\u00EA pode gastar 2 PE para receber +5 nesse teste.");
        this.descricao = "Voc\u00EA competia em um esporte individual ou por equipe, como nata\u00E7\u00E3o ou futebol. Seu alto desempenho pode ser fruto de alguma influ\u00EAncia paranormal que nem mesmo voc\u00EA conhecia ou voc\u00EA pode ter se envolvido em algum evento paranormal em uma de suas competi\u00E7\u00F5es.";
    }

}
