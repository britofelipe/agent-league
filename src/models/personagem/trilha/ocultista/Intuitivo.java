package models.trilha.ocultista;

import models.trilha.TrilhaAbstrata;
import models.personagem.poderes.Poder;

public class Intuitivo extends TrilhaAbstrata{
    
    public Intuitivo() {
        this.nome = "Intuitivo";
		this.descricao = "Assim como combatentes treinam seus corpos para resistir a traumas físicos, você preparou sua mente para resistir aos efeitos do Outro Lado. Seu foco e força de vontade fazem com que você expanda os limites de suas capacidades paranormais.";
		this.poderNex10 = new Poder("Mente Sã (NEW 10%)", "Você compreende melhor as entidades do Outro Lado, e passa a ser menos abalado por seus efeitos. Você recebe resistência paranormal +5 (+5 em testes de resistência contra efeitos paranormais).");
		this.poderNex40 = new Poder("Presença Poderosa (NEX 40%)", "Sua resiliência mental faz com que você possa extrair mais do Outro Lado. Você adiciona sua Presença ao seu limite de PE por turno, mas apenas para conjurar rituais (não para DT).");
		this.poderNex65 = new Poder("Inabalável (NEX 65%)", "Você recebe resistência a dano mental e paranormal 10. Além disso, quando é alvo de um efeito paranormal que permite um teste de Vontade para reduzir o dano à metade, você não sofre dano algum se passar.");
		this.poderNex99 = new Poder("Presença do Medo (NEX 99%)", "Você aprende o ritual Presença do Medo.");
    }

}
