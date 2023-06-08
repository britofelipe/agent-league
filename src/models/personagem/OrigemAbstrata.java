package models.personagem;

public abstract class OrigemAbstrata implements IOrigem {
	private String periciaTreinada1;
	private String periciaTreinada2;
	private Poder poder;
	private String descricao;
	
	public OrigemAbstrata() {
		super();
	}

	public OrigemAbstrata(String periciaTreinada1, String periciaTreinada2, Poder poder, String descricao) {
		this.periciaTreinada1 = periciaTreinada1;
		this.periciaTreinada2 = periciaTreinada2;
		this.poder = poder;
		this.descricao = descricao;
	}

	public String getPericiaTreinada1() {
		return periciaTreinada1;
	}

	public void setPericiaTreinada1(String periciaTreinada1) {
		this.periciaTreinada1 = periciaTreinada1;
	}

	public String getPericiaTreinada2() {
		return periciaTreinada2;
	}

	public void setPericiaTreinada2(String periciaTreinada2) {
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
