package models.origens;

import models.pericias.Pericia;
import models.poderes.Poder;

public abstract class OrigemAbstrata implements IOrigem {
	protected String nome;
	protected Pericia periciaTreinada1;
	protected Pericia periciaTreinada2;
	protected Poder poder;
	protected String descricao;
	
	public OrigemAbstrata() {
		super();
	}

	public OrigemAbstrata(String nome, Pericia periciaTreinada1, Pericia periciaTreinada2, Poder poder, String descricao) {
		this.nome = nome;
		this.periciaTreinada1 = periciaTreinada1;
		this.periciaTreinada2 = periciaTreinada2;
		this.poder = poder;
		this.descricao = descricao;
	}

	public String getNome() {
		return this.nome;
	}

	public Pericia getPericiaTreinada1() {
		return periciaTreinada1;
	}

	public void setPericiaTreinada1(Pericia periciaTreinada1) {
		this.periciaTreinada1 = periciaTreinada1;
	}

	public Pericia getPericiaTreinada2() {
		return periciaTreinada2;
	}

	public void setPericiaTreinada2(Pericia periciaTreinada2) {
		this.periciaTreinada2 = periciaTreinada2;
	}

	public Poder getPoder() {
		return poder;
	}

	public void setPoder(Poder poder) {
		this.poder = poder;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
