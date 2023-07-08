package models.classes;

import models.personagem.Atributos;
import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public class Especialista extends ClasseAbstrata{
    
    /*
    só vai ser possível criar personagens com nex 5%, para criar personagens mais avançados,
    o jogador deve criar um personagem com nex 5% e ir aumentando o nex até chegar ao nex desejado
    */

    public Especialista(Atributos atributos, TrilhaAbstrata trilha) {
		this.nex = 5;
        this.trilha = trilha;
        this.vida = 16 + atributos.getVigor();
        this.sanidade = 16;
        this.esforco = 3 + atributos.getPresenca();
        this.quantidadePericias = 7 + atributos.getIntelecto();
        this.proficienciaArmas = "Armas simples.";
        this.proficienciaProtecoes = "Proteções leves.";
        // essa classe tem dois poderes iniciais, escolhi só um para facilitar nossa vida
        this.poderInicial = new Poder("Perito",  "Escolha duas perícias nas quais você é treinado (exceto Luta e Pontaria). Quando faz um teste de uma dessas perícias, você pode gastar 2 PE para somar +1d6 no resultado do teste.");
        // this.repoPoderesDaClasse = tem que carregar o arquivo com a lista de poderes da classe
    }

    public void subirDeNex(Atributos atributos) {
        if(this.nex == 99) {
            // exceção nível máximo alcançado
        } else {
            if(this.nex < 95)
                this.nex += 5;
            else
                this.nex = 99;
            this.vida += 3 + atributos.getVigor();
            this.sanidade += 4;
            this.esforco += 3 + atributos.getPresenca();
        }
    }

    public void corrigirNEX(Atributos atributos) {
        if(this.nex == 5) {
            // exceção nível mínimo alcançado
        } else {
            if(this.nex < 99)
                this.nex -= 5;
            else
                this.nex = 95;
            this.vida -= 3 + atributos.getVigor();
            this.sanidade -= 4;
            this.esforco -= 3 + atributos.getPresenca();
        }
    }

    public void increasePoderInicial() {
        switch(this.nex) {
            case 25:
                this.poderInicial.setDescricao("Escolha duas perícias nas quais você é treinado (exceto Luta e Pontaria). Quando faz um teste de uma dessas perícias, você pode gastar 3 PE para somar +1d8 no resultado do teste. Lembrando que ainda é possível gastar apenas 2 PE para somar +1d6 no resultado do teste.");
                break;
            case 55:
                this.poderInicial.setDescricao("Escolha duas perícias nas quais você é treinado (exceto Luta e Pontaria). Quando faz um teste de uma dessas perícias, você pode gastar 4 PE para somar +1d10 no resultado do teste. Lembrando que ainda \u00E9 poss\u00EDvel gastar apenas 2 PE para somar +1d6 ou gastar 3 PE para somar + 1d8 no resultado do teste.");
                break;
            case 85:
                this.poderInicial.setDescricao("Escolha duas per\u00EDcias nas quais voc\u00EA \u00E9 treinado (exceto Luta e Pontaria). Quando faz um teste de uma dessas per\u00EDcias, voc\u00EA pode gastar 5 PE para somar +1d12 no resultado do teste. Lembrando que ainda \\u00E9 poss\\u00EDvel gastar apenas 2 PE para somar +1d6 ou gastar 3 PE para somar + 1d8 ou gastar 4 PE para somar +1d10 no resultado do teste.");
                break;
            default:
                // excessão de falha em elevar o poder inicial de classe
        }
    }

}
