package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemOperario extends OrigemAbstrata {

    public OrigemOperario(Atributos atributos) {
        this.nome = "Operário";
        this.periciaTreinada1 = new Pericia("Fortitude", "Treinado", 5, atributos.getVigor(), false, false, false);
        this.periciaTreinada2 = new Pericia("Profissão", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.poder = new Poder("Ferramenta de Trabalho", "Escolha uma arma simples ou t\u00E1tica que, a crit\u00E9rio do mestre, poderia ser usada como ferramenta em sua profiss\u00E3o (como uma marreta para um pedreiro). Voc\u00EA sabe usar a arma escolhida e recebe +1 em testes de ataque, rolagens de dano e margem de amea\u00E7a com ela.");
        this.descricao = "Pedreiro, industri\u00E1rio, operador de m\u00E1quinas em uma f\u00E1brica... Voc\u00EA passou uma parte de sua vida em um emprego bra\u00E7al, desempenhando atividades pr\u00E1ticas que lhe deram uma vis\u00E3o pragm\u00E1tica do mundo. Sua rotina mundana, entretanto, foi confrontada de alguma forma pelo paranormal, e voc\u00EA n\u00E3o consegue mais esquecer tudo que viu sobre os mist\u00E9rios do mundo.";
    }

}