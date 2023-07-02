package models.trilhas.especialista;

import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public class AtiradorDeElite extends TrilhaAbstrata {
    
    public AtiradorDeElite() {
        this.nome = "Atirador de Elite";
		this.descricao = "Um tiro, uma morte. Ao contrário dos combatentes, você é perito em neutralizar ameaças de longe, terminando uma briga antes mesmo que ela comece. Você trata sua arma como uma ferramenta de precisão, sendo capaz de executar façanhas incríveis.";
		this.poderNex10 = new Poder("Mira de Elite", "Você recebe proficiência com armas de fogo que usam balas longas e soma seu Intelecto em rolagens de dano com essas armas.");
		this.poderNex40 = new Poder("Disparo Letal", "Quando faz a ação mirar você pode gastar 1 PE para aumentar em +2 a margem de ameaça do próximo ataque que fizer até o final de seu próximo turno.");
		this.poderNex65 = new Poder("Disparo Impactante", "Se estiver usando uma arma de fogo com calibre grosso você pode gastar 2 PE para fazer as manobras derrubar, desarmar, empurrar e quebrar usando um ataque a distância.");
		this.poderNex99 = new Poder("Atirar para Matar", "Quando faz um acerto crítico com uma arma de fogo, você causa dano máximo, sem precisar rolar dados.");
    }

}
