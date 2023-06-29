package models.trilha.ocultista;

import models.trilha.TrilhaAbstrata;
import models.personagem.poderes.Poder;

public class LaminaParanormal extends TrilhaAbstrata{
    
    public LaminaParanormal() {
        this.nome = "Lâmina Paranormal";
		this.descricao = "Alguns ocultistas preferem ficar fechados em suas bibliotecas estudando livros e rituais. Outros preferem investigar fenômenos paranormais em sua fonte. Já você, prefere usar o paranormal como uma arma. Você aprendeu e dominou técnicas de luta mesclando suas habilidades de conjuração com suas capacidades de combate.";
		this.poderNex10 = new Poder("Lâmina Maldita (NEX 10%)", "Você aprende a usar armas táticas e o ritual Amaldiçoar Arma. Se já o conhece, seu custo é reduzido em -1 PE. Além disso, quando conjura esse ritual, você pode usar Ocultismo, com Intelecto, para testes de ataque com a arma amaldiçoada.");
		this.poderNex40 = new Poder("Gladiador Paranormal (NEX 40%)", "Sempre que acerta um ataque corpo a corpo em um inimigo, você recebe 2 PE temporários. Você pode ganhar um máximo de PE temporários por cena igual ao seu limite de PE. PE temporários desaparecem no final da cena.");
		this.poderNex65 = new Poder("Conjuração Marcial (NEX 65%)", "Uma vez por rodada, quando você lança um ritual com execução de uma ação padrão, pode gastar 2 PE para fazer um ataque corpo a corpo como uma ação livre.");
		this.poderNex99 = new Poder("Lâmina do Medo (NEX 99%)", "Você aprende o ritual Lâmina do Medo.");
    }

}
