package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemCultistaArrependido extends OrigemAbstrata {

    public OrigemCultistaArrependido(Atributos atributos) {
        this.nome = "Cultista Arrependido";
        this.periciaTreinada1 = new Pericia("Ocultismo", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.periciaTreinada2 = new Pericia("Religião", "Treinado", 5, atributos.getPresenca(), true, false, false);
        this.poder = new Poder("Traços do Outro Lado", "Voc\u00EA possui um poder paranormal \u00E0 sua escolha. Por\u00E9m, come\u00E7a o jogo com metade da Sanidade normal para sua classe.");
        this.descricao = "Voc\u00EA fez parte de um culto paranormal. Talvez fossem ignorantes iludidos, que acreditavam estar contatando entidades benevolentes. Talvez soubessem exatamente o que estavam fazendo. Seja como for, algo abriu seus olhos e agora voc\u00EA luta pelo lado certo \u2014 embora carregue para sempre tra\u00E7os de sua vida pregressa. Outros membros da Ordem podem desconfiar de sua convers\u00E3o e voc\u00EA sabe que precisar\u00E1 se esfor\u00E7ar para conquistar a confian\u00E7a de todos.";
    }

}
