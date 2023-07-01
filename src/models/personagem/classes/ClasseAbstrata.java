package models.personagem.classes;

import java.util.Map;

import models.personagem.Atributos;
import models.personagem.pericias.Pericia;
import models.personagem.poderes.Poder;
import models.trilha.TrilhaAbstrata;

public abstract class ClasseAbstrata implements IClasse {
	protected int nex;
	protected int vida;
	protected int esforco;
	protected int sanidade;
	protected int quantidadePericias;
	protected Pericia periciaTreinada1;
	protected Pericia periciaTreinada2;
	protected String proficienciaArmas;
	protected String proficienciaProtecoes;
	protected TrilhaAbstrata trilha;
	protected Map<String,Poder> repoPoderesDaClasse;
	
	public ClasseAbstrata() {
		
	}

	public ClasseAbstrata(int nex, int vida, int esforco, int sanidade, int quantidadePericias,
			String proficienciaArmas, String proficienciaProtecoes, TrilhaAbstrata trilha,
			Pericia periciaTreinada1, Pericia periciaTreinada2) {
		this.nex = nex;
		this.vida = vida;
		this.esforco = esforco;
		this.sanidade = sanidade;
		this.quantidadePericias = quantidadePericias;
		this.proficienciaArmas = proficienciaArmas;
		this.proficienciaProtecoes = proficienciaProtecoes;
		this.trilha = trilha;
		this.periciaTreinada1 = periciaTreinada1;
		this.periciaTreinada2 = periciaTreinada2;
	}

	public int getNex() {
		return nex;
	}

	public void setNex(int nex) {
		this.nex = nex;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getEsforco() {
		return esforco;
	}

	public void setEsforco(int esforco) {
		this.esforco = esforco;
	}

	public int getSanidade() {
		return sanidade;
	}

	public void setSanidade(int sanidade) {
		this.sanidade = sanidade;
	}

	public int getQuantidadePericias() {
		return quantidadePericias;
	}

	public void setQuantidadePericias(int quantidadePericias) {
		this.quantidadePericias = quantidadePericias;
	}

	public String getProficienciaArmas() {
		return this.proficienciaArmas;
	}

	public void setProficienciaArmas(String proficienciaArmas) {
		this.proficienciaArmas = proficienciaArmas;
	}

	public String getProficienciaProtecoes() {
		return this.proficienciaProtecoes;
	}

	public void setProficienciaProtecoes(String proficienciaProtecoes) {
		this.proficienciaProtecoes = proficienciaProtecoes;
	}

	public TrilhaAbstrata getTrilha() {
		return this.trilha;
	}

	public void setTrilha(TrilhaAbstrata trilha) {
		this.trilha = trilha;
	}

	public Map<String, Poder> getrepoPoderesDaClasse() {
		return this.repoPoderesDaClasse;
	}

	public void curarVida(int cura) {
        if(cura >= 0)
			this.vida += cura;
		// exceção cura negativa
    }

    public void perderVida(int dano) {
        if(dano >= 0)
			this.vida -= dano;
		// exceção dano negativo
    }

    public void curarEsforco(int cura) {
        if(cura >= 0)
			this.esforco += cura;
		// exceção cura negativa
    }

    public void perderEsforco(int dano) {
        if(dano >= 0)
			this.esforco -= dano;
		// exceção dano negativo
    }

    public void curarSanidade(int cura) {
        if(cura >= 0)
			this.sanidade += cura;
		// exceção cura negativa
    }

    public void perderSanidade(int dano) {
        if(dano >= 0)
			this.sanidade -= dano;
		// exceção dano negativo
    }

	public abstract void subirDeNex(Atributos atributos);

}
