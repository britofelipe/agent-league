package models.trilha.combatente;

import models.trilha.TrilhaAbstrata;
import models.personagem.Poder;

public class Guerreiro extends TrilhaAbstrata{
    
    public Guerreiro() {
        this.nome = "Guerreiro";
		this.descricao = "Você treinou sua musculatura e movimentos a ponto de transformar seu corpo em uma verdadeira arma. Com golpes corpo a corpo tão poderosos quanto uma bala, você encara os perigos de frente.";
		this.poderNex10 = new Poder("Técnica Letal (NEX 10%)", "Você recebe um aumento de +2 na margem de ameaça com todos os seus ataques corpo a corpo.");
		this.poderNex40 = new Poder("Revidar (NEX 40%)", "Sempre que bloquear um ataque, você pode gastar uma reação e 2 PE para fazer um ataque corpo a corpo no inimigo que o atacou.");
		this.poderNex65 = new Poder("Força Opressora (NEX 65%)", "Quando acerta um ataque corpo a corpo, você pode gastar 1 PE para realizar uma manobra derrubar ou empurrar contra o alvo do ataque como ação livre. Se escolher empurrar, recebe um bônus de +5 para cada 10 pontos de dano que causou no alvo. Se escolher derrubar e vencer no teste oposto, você pode gastar 1 PE para fazer um ataque adicional contra o alvo caído.");
		this.poderNex99 = new Poder("Potência Máxima (NEX 99%)", "Quando usa seu Ataque Especial com armas corpo a corpo, todos os bônus numéricos são dobrados. Por exemplo, se usar 5 PE para receber +5 no ataque e +15 no dano, você recebe +10 no ataque e +30 no dano.");
    }

}
