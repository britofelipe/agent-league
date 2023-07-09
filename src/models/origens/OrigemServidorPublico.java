package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemServidorPublico extends OrigemAbstrata {

    public OrigemServidorPublico(Atributos atributos) {
        this.nome = "Servidor Público";
        this.periciaTreinada1 = new Pericia("Intuição", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.periciaTreinada2 = new Pericia("Vontade", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.poder = new Poder("Espírito Cívico", "Sempre que faz um teste para ajudar, voc\u00EA pode gastar 1 PE para aumentar o b\u00F4nus concedido em +2.");
        this.descricao = "Voc\u00EA possu\u00EDa carreira em um \u00F3rg\u00E3o do governo, lidando com burocracia e atendendo pessoas. Sua rotina foi quebrada quando voc\u00EA viu que o prefeito era um cultista ou que a c\u00E2mara de vereadores se reunia \u00E0 noite para realizar rituais. Quando os pr\u00F3prios representantes do povo est\u00E3o dispostos a sacrific\u00E1-lo para entidades malignas, onde reside nossa esperan\u00E7a? Hoje, voc\u00EA sabe a resposta para essa pergunta: na Ordo Realitas.";
    }

}