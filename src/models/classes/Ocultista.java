package models.classes;

import models.personagem.Atributos;
import models.trilhas.TrilhaAbstrata;

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

}
