package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemTeoricoDaConspiracao extends OrigemAbstrata {

    public OrigemTeoricoDaConspiracao(Atributos atributos) {
        this.nome = "Teorico da Conspiração";
        this.periciaTreinada1 = new Pericia("Investigação", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.periciaTreinada2 = new Pericia("Ocultismo", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.poder = new Poder("Eu Já Sabia", " Voc\u00EA n\u00E3o se abala com entidades ou anomalias. Afinal, sempre soube que isso tudo existia. Voc\u00EA recebe resist\u00EAncia a dano mental igual ao seu Intelecto.");
        this.descricao = "A humanidade nunca pisou na lua. Reptilianos ocupam importantes cargos p\u00FAblicos. A Terra \u00E9 plana... E secretamente governada pelos Illuminati. Voc\u00EA sabe isso tudo, pois investigou a fundo esses importantes assuntos. Quando sua pesquisa esbarrou no paranormal, voc\u00EA foi recrutado. Na Ordem, sua determina\u00E7\u00E3o (cof loucura cof)  ser\u00E1 usada para um bom prop\u00F3sito.";
    }

}