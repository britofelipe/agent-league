package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemInvestigador extends OrigemAbstrata {

    public OrigemInvestigador(Atributos atributos) {
        this.nome = "Investigador";
        this.periciaTreinada1 = new Pericia("Investigação", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.periciaTreinada2 = new Pericia("Percepção", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.poder = new Poder("Faro para Pistas", "Uma vez por cena, quando fizer um teste para procurar pistas, voc\u00EA pode gastar 1 PE para receber +5 nesse teste.");
        this.descricao = "Voc\u00EA era um investigador do governo, como um perito forense ou policial federal, ou privado, como um detetive particular. Pode ter tido contato com o paranormal em algum caso ou ter sido recrutado pela Ordem por suas habilidades de resolu\u00E7\u00E3o de mist\u00E9rios.";
    }

}
