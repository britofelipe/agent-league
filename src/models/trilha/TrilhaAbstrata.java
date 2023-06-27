package models.trilha;

import models.personagem.Poder;

public abstract class TrilhaAbstrata implements ITrilha {
	protected String nome;
	protected String descricao;
	protected Poder poderNex10;
	protected Poder poderNex40;
	protected Poder poderNex65;
	protected Poder poderNex99;
	
	public TrilhaAbstrata() {

	}

	public TrilhaAbstrata(String nome, String descricao, Poder poderNex10, Poder poderNex40,
			Poder poderNex65, Poder poderNex99) {
		this.nome = nome;
		this.descricao = descricao;
		this.poderNex10 = poderNex10;
		this.poderNex40 = poderNex40;
		this.poderNex65 = poderNex65;
		this.poderNex99 = poderNex99;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Poder getPoderNex10() {
		return poderNex10;
	}

	public Poder getPoderNex40() {
		return poderNex40;
	}

	public Poder getPoderNex65() {
		return poderNex65;
	}

	public Poder getPoderNex99() {
		return poderNex99;
	}

}
