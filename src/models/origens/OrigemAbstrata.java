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

	public String getNome() {
		return this.nome;
	}

	public Pericia getPericiaTreinada1() {
		return periciaTreinada1;
	}

	public Pericia getPericiaTreinada2() {
		return periciaTreinada2;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Poder getPoder() {
		return this.poder;
	}

	public void setPoder(Poder poder) {
		this.poder = poder;
	}

}
