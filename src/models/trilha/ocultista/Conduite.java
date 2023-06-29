package models.trilha.ocultista;

import models.trilha.TrilhaAbstrata;
import models.personagem.poderes.Poder;

public class Conduite extends TrilhaAbstrata{
    
    public Conduite() {
        this.nome = "Conduíte";
		this.descricao = "Você domina os aspectos fundamentais da conjuração de rituais e é capaz de aumentar o alcance e velocidade de suas conjurações. Conforme sua conexão com as entidades paranormais aumenta você se torna capaz de interferir com os rituais de outros ocultistas.";
		this.poderNex10 = new Poder("Ampliar Ritual (NEX 10%)", "Quando lança um ritual, você pode gastar +2 PE para aumentar seu alcance em um passo (de curto para médio, de médio para longo ou de longo para extremo) ou dobrar sua área de efeito.");
		this.poderNex40 = new Poder("Acelerar Ritual (NEX 40%)", "Uma vez por rodada, você pode aumentar o custo de um ritual em 4 PE para conjurá-lo como uma ação livre.");
		this.poderNex65 = new Poder("Anular Ritual (NEX 65%)", "Quando for alvo de um ritual, você pode gastar uma quantidade de PE igual ao custo pago por esse ritual e fazer um teste oposto de Ocultismo contra o conjurador. Se vencer, você anula o ritual, cancelando todos os seus efeitos.");
		this.poderNex99 = new Poder("Canalizar o Medo (NEX 99%)", "Você aprende o ritual Canalizar o Medo.");
    }

}
