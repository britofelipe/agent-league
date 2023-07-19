package models.trilhas;

import java.io.Serializable;

import models.poderes.Poder;

public abstract class TrilhaAbstrata implements ITrilha, Serializable {
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
	    try {
	        if (nome == null) {
	            throw new IllegalArgumentException("O nome não pode ser nulo.");
	        }
	        if (descricao == null) {
	            throw new IllegalArgumentException("A descrição não pode ser nula.");
	        }

	        this.nome = nome;
	        this.descricao = descricao;
	        this.poderNex10 = poderNex10;
	        this.poderNex40 = poderNex40;
	        this.poderNex65 = poderNex65;
	        this.poderNex99 = poderNex99;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao criar uma instância de TrilhaAbstrata: " + e.getMessage());
	    }
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
