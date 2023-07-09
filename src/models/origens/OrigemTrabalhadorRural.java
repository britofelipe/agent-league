package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemTrabalhadorRural extends OrigemAbstrata {

    public OrigemTrabalhadorRural(Atributos atributos) {
        this.nome = "Trabalhador Rural";
        this.periciaTreinada1 = new Pericia("Adestramento", "Treinado", 5, atributos.getPresenca(), true, false, false);
        this.periciaTreinada2 = new Pericia("Sobrevivência", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.poder = new Poder("Desbravador", "Quando faz um teste de Adestramento ou Sobreviv\u00EAncia, voc\u00EA pode gastar 2 PE para receber +5 nesse teste. Al\u00E9m disso, voc\u00EA n\u00E3o sofre penalidade em deslocamento por terreno dif\u00EDcil.");
        this.descricao = "Voc\u00EA trabalhava no campo ou em \u00E1reas isoladas, como fazendeiro, pescador, bi\u00F3logo, veterin\u00E1rio... Voc\u00EA se acostumou com o conv\u00EDvio com a natureza e os animais e talvez tenha ouvido uma ou outra hist\u00F3ria de fantasmas ao redor da fogueira. Em algum momento da sua vida, por\u00E9m, descobriu que muitas dessas hist\u00F3rias s\u00E3o verdadeiras.";
    }

}