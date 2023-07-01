package models.trilha.ocultista;

import models.trilha.TrilhaAbstrata;
import models.personagem.poderes.Poder;

public class Graduado extends TrilhaAbstrata{
    
    public Graduado() {
        this.nome = "Graduado";
		this.descricao = "Você foca seus estudos em se tornar um conjurador versátil e poderoso, conhecendo mais rituais que os outros ocultistas e sendo capaz de torná-los mais difíceis de serem resistidos. Seu objetivo é desvendar e dominar os segredos do Outro Lado, custe o que custar.";
		this.poderNex10 = new Poder("Saber Ampliado (NEX 10%)", "Você aprende um ritual de 1º círculo. Toda vez que ganha acesso a um novo círculo, aprende um ritual adicional daquele círculo. Esses rituais não contam no seu limite de rituais.");
		this.poderNex40 = new Poder("Grimório Ritualístico (NEX 40%)", "Você cria um grimório especial, que armazena rituais que sua mente não seria capaz de guardar. Você aprende uma quantidade de rituais de 1º ou 2º círculos igual ao seu Intelecto. Quando ganha acesso a um novo círculo, pode incluir um novo ritual desse círculo em seu grimório. Esses rituais não contam em seu limite de rituais conhecidos. Para conjurar um ritual armazenado em seu grimório, você precisa antes empunhar o grimório e gastar uma ação completa o folheando para relembrando o ritual. O grimório ocupa 1 espaço em seu inventário. Se perdê-lo, você pode replicá-lo com duas ações de interlúdio.");
		this.poderNex65 = new Poder("Rituais Eficientes (NEX 65%)", "A DT para resistir a todos os seus rituais aumenta em +5.");
		this.poderNex99 = new Poder("Conhecendo o Medo (NEX 99%)", "Você aprende o ritual Conhecendo o Medo.");
    }

}
