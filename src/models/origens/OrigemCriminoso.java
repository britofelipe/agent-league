package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemCriminoso extends OrigemAbstrata {

    public OrigemCriminoso(Atributos atributos) {
        this.nome = "Criminoso";
        this.periciaTreinada1 = new Pericia("Crime", "Treinado", 5, atributos.getAgilidade(), true, true, true);
        this.periciaTreinada2 = new Pericia("Furtividade", "Treinado", 5, atributos.getAgilidade(), false, true, false);
        this.poder = new Poder("O Crime Compensa", "No final de uma miss\u00E3o, escolha um item encontrado na miss\u00E3o. Em sua pr\u00F3xima miss\u00E3o, voc\u00EA pode incluir esse item em seu invent\u00E1rio sem que ele conte em seu limite de itens por patente.");
        this.descricao = "Voc\u00EA vivia uma vida fora da lei, seja como mero batedor de carteiras, seja como membro de uma fac\u00E7\u00E3o criminosa. Em algum momento, voc\u00EA se envolveu em um assunto da Ordem \u2014 talvez tenha roubado um item amaldi\u00E7oado? A organiza\u00E7\u00E3o, por sua vez, achou melhor recrutar seus talentos do que ter voc\u00EA como um estorvo.";
    }

}
