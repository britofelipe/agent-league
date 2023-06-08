package models.personagem;

import java.util.Map;

import models.trilha.TrilhaAbstrata;

public abstract class ClasseAbstrata implements IClasse {
	private int nivel;
	private int vida;
	private int esforco;
	private int sanidade;
	private int quantidadePericias;
	private String proficienciaInicialAtaque;
	private String proficienciaInicialDefesa;
	private TrilhaAbstrata trilha;
	private Map<String,Poder> repoPoderes;
	
	public ClasseAbstrata() {

	}

	public ClasseAbstrata(int nivel, int vida, int esforco, int sanidade, int quantidadePericias,
			String proficienciaInicialAtaque, String proficienciaInicialDefesa, TrilhaAbstrata trilha,
			Map<String, Poder> repoPoderes) {
		this.nivel = nivel;
		this.vida = vida;
		this.esforco = esforco;
		this.sanidade = sanidade;
		this.quantidadePericias = quantidadePericias;
		this.proficienciaInicialAtaque = proficienciaInicialAtaque;
		this.proficienciaInicialDefesa = proficienciaInicialDefesa;
		this.trilha = trilha;
		this.repoPoderes = repoPoderes;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
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

	public String getProficienciaInicialAtaque() {
		return proficienciaInicialAtaque;
	}

	public void setProficienciaInicialAtaque(String proficienciaInicialAtaque) {
		this.proficienciaInicialAtaque = proficienciaInicialAtaque;
	}

	public String getProficienciaInicialDefesa() {
		return proficienciaInicialDefesa;
	}

	public void setProficienciaInicialDefesa(String proficienciaInicialDefesa) {
		this.proficienciaInicialDefesa = proficienciaInicialDefesa;
	}

	public TrilhaAbstrata getTrilha() {
		return trilha;
	}

	public void setTrilha(TrilhaAbstrata trilha) {
		this.trilha = trilha;
	}

	public Map<String, Poder> getRepoPoderes() {
		return repoPoderes;
	}

	public void setRepoPoderes(Map<String, Poder> repoPoderes) {
		this.repoPoderes = repoPoderes;
	}	
}
