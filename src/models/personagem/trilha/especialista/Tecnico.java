package models.trilha.especialista;

import models.trilha.TrilhaAbstrata;
import models.personagem.poderes.Poder;

public class Tecnico extends TrilhaAbstrata {
    
    public Tecnico() {
        this.nome = "Técnico";
		this.descricao = "Sua principal habilidade é a manutenção e reparo do valioso equipamento que seu time carrega em missão. Seu conhecimento técnico também permite que improvise ferramentas com o que tiver à disposição e sabote os itens usados por seus inimigos.";
		this.poderNex10 = new Poder("Inventário Otimizado (NEX 10%)", "Você soma seu Intelecto à sua Força para calcular sua capacidade de carga. Por exemplo, se você tem Força 1 e Intelecto 3, seu inventário tem 20 espaços.");
		this.poderNex40 = new Poder("Remendão (NEX 40%)", "Você pode gastar uma ação completa e 1 PE para remover a condição quebrado de um equipamento adjacente até o final da cena. Além disso, qualquer equipamento geral tem sua categoria reduzida em I para você.");
		this.poderNex65 = new Poder("Improvisar (NEX 65%)", "Você pode improvisar equipamentos com materiais ao seu redor. Escolha um equipamento geral e gaste uma ação completa e 2 PE, mais 2 PE por categoria do item escolhido. Você cria uma versão funcional do equipamento, que segue suas regras de espaço e categoria como normal. Ao final da cena, seu equipamento improvisado se torna inútil.");
		this.poderNex99 = new Poder("Preaparado para Tudo (nex 99%)", "Você sempre tem o que precisa para qualquer situação. Sempre que precisar de um item qualquer (exceto armas), pode gastar uma ação de movimento e 3 PE por categoria do item para lembrar que colocou ele no fundo da bolsa! Depois de encontrado, o item segue normalmente as regras de inventário.");
    }

}
