package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemLutador extends OrigemAbstrata {

    public OrigemLutador(Atributos atributos) {
        this.nome = "Lutador";
        this.periciaTreinada1 = new Pericia("Luta", "Treinado", 5, atributos.getForca(), false, false, false);
        this.periciaTreinada2 = new Pericia("Reflexos", "Treinado", 5, atributos.getAgilidade(), false, false, false);
        this.poder = new Poder("Mão Pesada", "Voc\u00EA recebe +2 em rolagens de dano com ataques corpo a corpo.");
        this.descricao = "Voc\u00EA pratica uma arte marcial ou esporte de luta, ou cresceu em um bairro perigoso onde aprendeu briga de rua. J\u00E1 quebrou muitos ossos, tanto seus quanto dos outros. Pode ter conhecido a Ordem ap\u00F3s um torneio secreto envolvendo entidades do Outro Lado ou ter sido recrutado pela sua capacidade de luta.";
    }

}
