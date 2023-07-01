package models.personagem.classes;

import models.personagem.Atributos;
import models.trilha.TrilhaAbstrata;

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

}
