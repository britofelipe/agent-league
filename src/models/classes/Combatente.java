package models.classes;

import models.personagem.Atributos;
import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public class Combatente extends ClasseAbstrata{

    /*
    só vai ser possível criar personagens com nex 5%, para criar personagens mais avançados,
    o jogador deve criar um personagem com nex 5% e ir aumentando o nex até chegar ao nex desejado
    */

    public Combatente(Atributos atributos, TrilhaAbstrata trilha) {
		this.nex = 5;
        this.trilha = trilha;
        this.vida = 20 + atributos.getVigor();
        this.sanidade = 12;
        this.esforco = 2 + atributos.getPresenca();
        this.quantidadePericias = 3 + atributos.getIntelecto();
        this.proficienciaArmas = "Armas simples e armas táticas.";
        this.proficienciaProtecoes = "Proteções leves.";
        this.poderInicial = new Poder("Ataque Especial", "Quando faz um ataque, você pode gastar 2 PE para receber +5 no teste de ataque ou na rolagem de dano.");
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
            this.vida += 4 + atributos.getVigor();
            this.sanidade += 3;
            this.esforco += 2 + atributos.getPresenca();
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
            this.vida -= 4 + atributos.getVigor();
            this.sanidade -= 3;
            this.esforco -= 2 + atributos.getPresenca();
        }
    }

    public void increasePoderInicial() {
        switch(this.nex) {
            case 25:
                this.poderInicial.setDescricao("Quando faz um ataque, você pode gastar 2 PE para receber +5 no teste de ataque ou na rolagem de dano. Agora, você pode adicionar +1 no gasto de PE até 1 vez para conseguir uma quantidade de bônus +5 equivalente ao número adicional de PE gasto.");
                break;
            case 55:
                this.poderInicial.setDescricao("Quando faz um ataque, você pode gastar 2 PE para receber +5 no teste de ataque ou na rolagem de dano. Agora, você pode adicionar +1 no gasto de PE até 2 vezes para conseguir uma quantidade de bônus +5 equivalente ao número adicional de PE gasto.");
                break;
            case 85:
                this.poderInicial.setDescricao("Quando faz um ataque, você pode gastar 2 PE para receber +5 no teste de ataque ou na rolagem de dano. Agora, você pode adicionar +1 no gasto de PE até 3 vezes para conseguir uma quantidade de bônus +5 equivalente ao número adicional de PE gasto.");
                break;
            default:
                // excessão de falha em elevar o poder inicial de classe
        }
    }
    
}
