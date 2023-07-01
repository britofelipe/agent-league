package models.trilha.combatente;

import models.trilha.TrilhaAbstrata;
import models.personagem.Poder;

public class ComandanteDeCampo extends TrilhaAbstrata{
    
    public ComandanteDeCampo() {
        this.nome = "Comandante de Campo";
        this.descricao = "Sem um oficial uma batalha não passa de uma briga de bar. Você é treinado para coordenar e auxiliar seus companheiros em combate, tomando decisões rápidas e tirando melhor proveito da situação e do talento de seus aliados.";
        this.poderNex10 = new Poder("Inspirar Confiança (NEX 10%)", "Sua liderança inspira seus aliados. Você pode gastar uma reação e 2 PE para fazer um aliado em alcance curto rolar novamente um teste recém realizado.");
		this.poderNex40 = new Poder("Estrategista (NEX 40%)", "Você pode direcionar aliados em alcance curto. Gaste uma ação padrão e 1 PE por aliado que quiser direcionar (limitado pelo seu Intelecto). No próximo turno dos aliados afetados, eles ganham uma ação de movimento adicional.");
		this.poderNex65 = new Poder("Brecha na Guarda (NEX 65%)", "Uma vez por rodada, quando um aliado causar dano em um inimigo que esteja em seu alcance curto, você pode gastar uma reação e 2 PE para que você ou outro aliado em alcance curto faça um ataque adicional contra o mesmo inimigo. Além disso, o alcance de inspirar confiança e estrategista aumenta para médio.");
		this.poderNex99 = new Poder("Oficial Comandante (NEX 99%)", "Você pode gastar uma ação padrão e 5 PE para que cada aliado que você possa ver em alcance médio receba uma ação padrão adicional no próximo turno dele.");
    }

}
