package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemReligioso extends OrigemAbstrata {

    public OrigemReligioso(Atributos atributos) {
        this.nome = "Religioso";
        this.periciaTreinada1 = new Pericia("Religião", "Treinado", 5, atributos.getPresenca(), true, false, false);
        this.periciaTreinada2 = new Pericia("Vontade", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.poder = new Poder("Acalentar", "Voc\u00EA recebe +5 em testes de Religi\u00E3o para acalmar. Al\u00E9m disso, quando acalma uma pessoa, ela recebe um n\u00FAmero de pontos de Sanidade igual a 1d6 + a sua Presen\u00E7a.");
        this.descricao = "Voc\u00EA \u00E9 devoto ou sacerdote de uma f\u00E9. Independentemente da religi\u00E3o que pratica, se dedica a auxiliar as pessoas com problemas espirituais. A partir disso, teve contato com o paranormal, o que fez com que fosse convocado pela Ordem.";
    }

}