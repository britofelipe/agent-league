package models.trilhas.combatente;

import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public class TropaDeChoque extends TrilhaAbstrata {
    
    public TropaDeChoque() {
        this.nome = "Tropa de Choque";
		this.descricao = "Você é duro na queda. Treinou seu corpo para resistir a traumas físicos, tornando-o praticamente inquebrável, e por isso não teme se colocar entre seus aliados e o perigo.";
		this.poderNex10 = new Poder("Casca Grosse (NEX 10%)", "Você recebe +1 PV para cada 5% de NEX e, quando faz um bloqueio, soma seu Vigor na resistência a dano recebida.");
		this.poderNex40 = new Poder("Cai Dentro", "Sempre que um oponente em alcance curto ataca um de seus aliados, você pode gastar uma reação e 1 PE para fazer com que esse oponente faça um teste de Vontade (DT Vig). Se falhar, o oponente deve atacar você em vez de seu aliado. Este poder só funciona se você puder ser efetivamente atacado e estiver no alcance do ataque (por exemplo, adjacente a um oponente atacando em corpo a corpo ou dentro do alcance de uma arma de ataque à distância). Um oponente que passe no teste de Vontade não pode ser afetado por seu poder Cai Dentro até o final da cena.");
		this.poderNex65 = new Poder("Duro de Matar", "Ao sofrer dano não paranormal, você pode gastar uma reação e 2 PE para reduzir esse dano à metade. Em NEX 85%, você pode usar esta habilidade para reduzir dano paranormal.");
		this.poderNex99 = new Poder("Inquebrável", "Enquanto estiver machucado, você recebe +5 na Defesa e resistência a dano 5. Enquanto estiver morrendo, em vez do normal, você não fica indefeso e ainda pode realizar ações. Você ainda segue as regras de morte normalmente.");
    }

}
