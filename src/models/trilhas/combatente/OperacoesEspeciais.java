package models.trilhas.combatente;

import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public class OperacoesEspeciais extends TrilhaAbstrata {
    
    public OperacoesEspeciais() {
        this.nome = "Operações Especiais";
	    this.descricao = "Você é um combatente eficaz. Suas ações são calculadas e otimizadas, sempre antevendo os movimentos inimigos e se posicionando da maneira mais inteligente no campo de batalha.";
	    this.poderNex10 = new Poder("Iniciativa Aprimorada (NEX 10%)", "Você recebe +5 em Iniciativa e uma ação de movimento adicional na primeira rodada.");
	    this.poderNex40 = new Poder("Ataque Extra (NEX 40%)", "Uma vez por rodada, quando faz um ataque, você pode gastar 2 PE para fazer um ataque adicional.");
	    this.poderNex65 = new Poder("Surte de Adrenlina (NEX 65%)", "Uma vez por rodada, você pode gastar 5 PE para realizar uma ação padrão ou de movimento adicional.");
	    this.poderNex99 = new Poder("Sempre Alerta (NEX 99%)", "Você recebe uma ação padrão adicional no início de cada cena de combate.");
    }

}
