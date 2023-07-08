package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemAgenteDeSaude extends OrigemAbstrata {
    
    public OrigemAgenteDeSaude(Atributos atributos) {
        this.nome = "Agente de Saúde";
        this.periciaTreinada1 = new Pericia("Intuição", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.periciaTreinada2 = new Pericia("Investigação", "Treinado", 5, atributos.getIntelecto(), false, false, true);
        this.poder = new Poder("Técnica Medicinal", " Sempre que cura um personagem, voc\u00EA adiciona seu Intelecto no total de PV curados.");
        this.descricao = "Voc\u00EA era um profissional da sa\u00FAde como um enfermeiro, farmac\u00EAutico, m\u00E9dico, psic\u00F3logo ou socorrista, treinado no atendimento e cuidado de pessoas. Voc\u00EA pode ter sido surpreendido por um evento paranormal durante o trabalho ou mesmo cuidado de um agente da Ordem em uma emerg\u00EAncia, que ficou surpreso com o qu\u00E3o bem voc\u00EA lidou com a situa\u00E7\u00E3o.";
    }

}
