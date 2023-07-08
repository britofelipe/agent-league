package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemArtista extends OrigemAbstrata {
    
    public OrigemArtista(Atributos atributos) {
        this.nome = "Artista";
        this.periciaTreinada1 = new Pericia("Artes", "Treinado", 5, atributos.getPresenca(), true, false, false);
        this.periciaTreinada2 = new Pericia("Enganação", "Treinado", 5, atributos.getPresenca(), false, false, true);
        this.poder = new Poder("Magnum Opus", "Voc\u00EA \u00E9 famoso por uma de suas obras. Uma vez por miss\u00E3o, pode determinar que um personagem envolvido em uma cena de intera\u00E7\u00E3o o reconhe\u00E7a. Voc\u00EA recebe +5 em testes de Presen\u00E7a e de per\u00EDcias baseadas em Presen\u00E7a contra aquele personagem. A crit\u00E9rio do mestre, pode receber esses b\u00F4nus em outras situa\u00E7\u00F5es nas quais seria reconhecido.");
        this.descricao = "Voc\u00EA era um ator, m\u00FAsico, escritor, dan\u00E7arino, influenciador... Seu trabalho pode ter sido inspirado por uma experi\u00EAncia paranormal do passado e o que o p\u00FAblico acha que \u00E9 pura criatividade, a Ordem sabe que tem um lado mais sombrio.";
    }

}
