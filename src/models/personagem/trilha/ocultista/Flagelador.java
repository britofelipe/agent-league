package models.trilha.ocultista;

import models.trilha.TrilhaAbstrata;
import models.personagem.poderes.Poder;

public class Flagelador extends TrilhaAbstrata{
    
    public Flagelador() {
        this.nome = "Flagelador";
		this.descricao = "Dor é um poderoso catalisador paranormal e você aprendeu a transformá-la em poder para seus rituais. Quando se torna especialmente poderoso, consegue usar a dor e o sofrimento de seus inimigos como instrumento de seus rituais ocultistas.";
		this.poderNex10 = new Poder("Poder do Flagelo (NEX 10%)", "Ao conjurar um ritual, você pode gastar seus próprios pontos de vida para pagar o custo em pontos de esforço, à taxa de 2 PV por PE pago. Alem disso, recebe PEs temporários para cada 2PV gastos no ritual.");
		this.poderNex40 = new Poder("Abraçar a Dor (NEX 40%)", "Sempre que sofrer dano não paranormal, você pode gastar uma reação e 2 PE para reduzir esse dano à metade. Em NEX 80%, pode usar essa habilidade para reduzir dano paranormal.");
		this.poderNex65 = new Poder("Retribuição Agônica (NEX 65%)", "Uma vez por rodada, pode aumentar o custo de um ritual em 4PE para conjurar ele como reação ao sofrer dano.");
		this.poderNex99 = new Poder("Medo Tangível (NEX 99%)", "Você aprende o ritual Medo Tangível.");
    }

}
