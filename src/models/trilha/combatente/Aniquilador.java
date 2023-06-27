package models.trilha.combatente;

import models.personagem.Poder;
import models.trilha.TrilhaAbstrata;

public class Aniquilador extends TrilhaAbstrata {
    
    public Aniquilador() {
        this.nome = "Aniquilador";
		this.descricao = "Você é treinado para abater alvos com eficiência e velocidade. Suas armas são suas melhores amigas e você cuida tão bem delas quanto de seus companheiros de equipe. Talvez até melhor.";
		this.poderNex10 = new Poder("A Favorita (NEX 10%)", "Escolha uma arma para ser sua favorita, como katana ou fuzil de assalto. A categoria da arma escolhida é reduzida em I.");
		this.poderNex40 = new Poder("Técnica Secreta (NEX 40%)", "A categoria da arma favorita passa a ser reduzida em II. Quando faz um ataque com ela, você pode gastar 2 PE para executar um dos efeitos abaixo como parte do ataque.\nAmplo: O ataque pode atingir um alvo adicional em seu alcance e adjacente ao original (use o mesmo teste de ataque para ambos).\nDestruidor: Aumenta o multiplicador de crítico da arma em +1.");
		this.poderNex65 = new Poder("Técnica Sublime (NEX 65%)", "Você adiciona os seguintes efeitos à lista de sua Técnica Secreta:\nLetal: Aumenta a margem de ameaça em +2. Você pode escolher este efeito duas vezes para aumentar a margem de ameaça em +5.\nLetal: Ignora até 5 pontos de resistência a dano de qualquer tipo do alvo.");
		this.poderNex99 = new Poder("Máquina de Matar (NEX 99%)", "A categoria da arma favorita passa a ser reduzida em III, ela recebe +2 na margem de ameaça e seu dano aumenta em um dado do mesmo tipo.");
    }

}
