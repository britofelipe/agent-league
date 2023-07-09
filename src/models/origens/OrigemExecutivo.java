package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemExecutivo extends OrigemAbstrata {

    public OrigemExecutivo(Atributos atributos) {
        this.nome = "Executivo";
        this.periciaTreinada1 = new Pericia("Diplomacia", "Treinado", 5, atributos.getPresenca(), false, false, false);
        this.periciaTreinada2 = new Pericia("Profissão", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.poder = new Poder("Processo Otimizado", "Sempre que faz um teste de per\u00EDcia durante um teste estendido, ou uma a\u00E7\u00E3o para revisar documentos (f\u00EDsicos ou digitais), pode pagar 2 PE para receber +5 nesse teste.");
        this.descricao = "Voc\u00EA possu\u00EDa um trabalho de escrit\u00F3rio em uma grande empresa, banco ou corpora\u00E7\u00E3o. Era um administrador, advogado, contador ou de qualquer outra profiss\u00E3o que lida com papelada e burocracia. Sua vida era bastante normal, at\u00E9 que voc\u00EA descobriu algo que n\u00E3o devia. Talvez o sucesso da empresa residisse em um ritual? Talvez toda a corpora\u00E7\u00E3o fosse fachada para um culto e o presidente, um l\u00EDder cultista envolvido com entidades paranormais? Ap\u00F3s essa descoberta, voc\u00EA foi recrutado pela Ordem e trocou seu trabalho de escrit\u00F3rio por miss\u00F5es de campo \u2014 hoje, sua vida \u00E9 tudo, menos normal.";
    }

}
