package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemMagnata extends OrigemAbstrata {

    public OrigemMagnata(Atributos atributos) {
        this.nome = "Magnata";
        this.periciaTreinada1 = new Pericia("Diplomacia", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.periciaTreinada2 = new Pericia("Pilotagem", "Treinado", 5, atributos.getAgilidade(), true, false, false);
        this.poder = new Poder("Patrocinador da Ordem", "Seu limite de cr\u00E9dito \u00E9 sempre considerado um acima do atual.");
        this.descricao = "Voc\u00EA possui muito dinheiro ou patrim\u00F4nio. Pode ser o herdeiro de uma fam\u00EDlia antiga ligada ao oculto, ter criado e vendido uma empresa e decidido usar sua riqueza para uma causa maior, ou ter ganho uma loteria ap\u00F3s inadvertidamente escolher n\u00FAmeros amaldi\u00E7oados que formavam um ritual.";
    }

}
