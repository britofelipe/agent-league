package models.classes;

import models.personagem.Atributos;
import models.trilhas.TrilhaAbstrata;
import models.poderes.Poder;

public class Ocultista extends ClasseAbstrata {
    
    /*
    só vai ser possível criar personagens com nex 5%, para criar personagens mais avançados,
    o jogador deve criar um personagem com nex 5% e ir aumentando o nex até chegar ao nex desejado
    */

    public Ocultista(Atributos atributos, TrilhaAbstrata trilha) {
		this.nex = 5;
        this.trilha = trilha;
        this.vida = 12 + atributos.getVigor();
        this.sanidade = 20;
        this.esforco = 4 + atributos.getPresenca();
        this.quantidadePericias = 5 + atributos.getIntelecto();
        this.proficienciaArmas = "Armas simples.";
        this.proficienciaProtecoes = "Sem proficiência em proteções.";
        this.poderInicial = new Poder("Escolhido pelo Outro Lado", "Você pode lançar rituais de 1º círculo.");
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
            this.vida += 2 + atributos.getVigor();
            this.sanidade += 5;
            this.esforco += 4 + atributos.getPresenca();
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
            this.vida -= 2 + atributos.getVigor();
            this.sanidade -= 5;
            this.esforco -= 4 + atributos.getPresenca();
        }
    }

    public void increasePoderInicial() {
        switch(this.nex) {
            case 25:
                this.poderInicial.setDescricao("Você pode lançar rituais de 1º e 2º círculos.");
                break;
            case 55:
                this.poderInicial.setDescricao("Voc\u00EA pode lan\u00E7ar rituais de 1\u00BA, 2\u00BA e 3\u00BA c\u00EDrculos.");
                break;
            case 85:
                this.poderInicial.setDescricao("Voc\u00EA pode lan\u00E7ar rituais de 1\u00BA, 2\u00BA, 3\u00BA e 4\u00BA c\u00EDrculos.");
                break;
            default:
                // excessão de falha em elevar o poder inicial de classe
        }
    }

}
