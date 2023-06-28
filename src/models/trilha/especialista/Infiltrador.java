package models.trilha.especialista;

import models.personagem.poderes.Poder;
import models.trilha.TrilhaAbstrata;

public class Infiltrador extends TrilhaAbstrata{
    
    public Infiltrador() {
        this.nome = "Infiltrador";
		this.descricao = "Você é um perito em infiltração e sabe neutralizar alvos desprevenidos sem causar alarde. Combinando talento acrobático, destreza manual e conhecimento técnico você é capaz de superar qualquer barreira de defesa, mesmo quando a missão parece impossível.";
		this.poderNex10 = new Poder("Ataque Furtivo (NEX 10%)", "Você sabe atingir os pontos vitais de um inimigo distraído. Uma vez por rodada, quando atinge um alvo desprevenido com um ataque corpo a corpo ou em alcance curto, ou um alvo que você esteja flanqueando, você pode gastar 1 PE para causar +1d6 pontos de dano do mesmo tipo da arma. Em NEX 40% o dano adicional aumenta para +2d6, em NEX 65% aumenta para +3d6 e em NEX 99% aumenta para +4d6.");
		this.poderNex40 = new Poder("Gatuno (NEX 40%)", "Você recebe +5 em Atletismo e Crime e pode percorrer seu deslocamento normal quando se esconder sem penalidade (veja a perícia Furtividade).");
		this.poderNex65 = new Poder("Assassinar (NEX 65%)", "Você pode gastar uma ação de movimento e 3 PE para analisar um alvo em alcance curto. Até o fim de seu próximo turno, seu primeiro Ataque Furtivo que causar dano a ele tem seus dados de dano extras dessa habilidade dobrados. Além disso, se sofrer dano de seu ataque, o alvo fica inconsciente ou morrendo, à sua escolha (Fortitude DT Agi evita).");
		this.poderNex99 = new Poder("Sombra Fugaz (NEX 99%)", "Quando faz um teste de Furtividade após atacar ou fazer outra ação chamativa, você pode gastar 3 PE para não sofrer a penalidade de -15 no teste.");
    }

}
