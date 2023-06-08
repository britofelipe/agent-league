package models.trilha;

import models.personagem.Habilidade;

public abstract class TrilhaAbstrata implements ITrilha {
	private String nome;
	private String descricao;
	private Habilidade HabilidadeNex10;
	private Habilidade HabilidadeNex40;
	private Habilidade HabilidadeNex65;
	private Habilidade HabilidadeNex99;
	
	public TrilhaAbstrata() {

	}

	public TrilhaAbstrata(String nome, String descricao, Habilidade habilidadeNex10, Habilidade habilidadeNex40,
			Habilidade habilidadeNex65, Habilidade habilidadeNex99) {
		this.nome = nome;
		this.descricao = descricao;
		HabilidadeNex10 = habilidadeNex10;
		HabilidadeNex40 = habilidadeNex40;
		HabilidadeNex65 = habilidadeNex65;
		HabilidadeNex99 = habilidadeNex99;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Habilidade getHabilidadeNex10() {
		return HabilidadeNex10;
	}

	public void setHabilidadeNex10(Habilidade habilidadeNex10) {
		HabilidadeNex10 = habilidadeNex10;
	}

	public Habilidade getHabilidadeNex40() {
		return HabilidadeNex40;
	}

	public void setHabilidadeNex40(Habilidade habilidadeNex40) {
		HabilidadeNex40 = habilidadeNex40;
	}

	public Habilidade getHabilidadeNex65() {
		return HabilidadeNex65;
	}

	public void setHabilidadeNex65(Habilidade habilidadeNex65) {
		HabilidadeNex65 = habilidadeNex65;
	}

	public Habilidade getHabilidadeNex99() {
		return HabilidadeNex99;
	}

	public void setHabilidadeNex99(Habilidade habilidadeNex99) {
		HabilidadeNex99 = habilidadeNex99;
	}
}
