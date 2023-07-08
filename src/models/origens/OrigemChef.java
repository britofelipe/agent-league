package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemChef extends OrigemAbstrata {
    
    public OrigemChef(Atributos atributos) {
        this.nome = "Chef";
        this.periciaTreinada1 = new Pericia("Fortitude", "Treinado", 5, atributos.getVigor(), false, false, false);
        this.periciaTreinada2 = new Pericia("Profissoão (cozinheiro)", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.poder = new Poder("Ingrediente Secreto", "Em cenas de interl\u00FAdio, EA voc\u00EA pode fazer a a\u00E7\u00E3o alimentar-se para cozinhar Z um prato especial. Voc\u00EA, e todos os membros do grupo que fizeram a a\u00E7\u00E3o alimentar-se, recebem o benef\u00EDcio de dois pratos (caso o mesmo benef\u00EDcio seja escolhido duas vezes, seus efeitos se acumulam).");
        this.descricao = "Voc\u00EA \u00E9 um cozinheiro amador ou profissional. Talvez trabalhasse em um restaurante, talvez simplesmente gostasse de cozinhar para a fam\u00EDlia e amigos. Como sua comida fez com que voc\u00EA se envolvesse com o paranormal? Ningu\u00E9m sabe. Mas os outros agentes adoram quando voc\u00EA vai para a miss\u00E3o!";
    }

}
