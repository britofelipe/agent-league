package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemEngenheiro extends OrigemAbstrata {

    public OrigemEngenheiro(Atributos atributos) {
        this.nome = "Engenheiro";
        this.periciaTreinada1 = new Pericia("Profissão", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.periciaTreinada2 = new Pericia("Tecnologia", "Treinado", 5, atributos.getIntelecto(), true, false, true);
        this.poder = new Poder("Ferramentas Favoritas", "Um item a sua escolha (exceto armas) conta como uma categoria abaixo (por exemplo, um item de categoria II conta como categoria I para voc\u00EA).");
        this.descricao = "Enquanto os acad\u00EAmicos est\u00E3o preocupados com teorias, voc\u00EA colocar a m\u00E3o na massa, seja como engenheiro profissional, seja como inventor de garagem. Provavelmente voc\u00EA criou algum dispositivo paranormal que chamou a aten\u00E7\u00E3o da Ordem.";
    }

}
