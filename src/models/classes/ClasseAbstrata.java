package models.classes;

import java.util.Map;

import models.personagem.*;
import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public abstract class ClasseAbstrata implements IClasse {
	protected int nex;
	protected int vida;
	protected int esforco;
	protected int sanidade;
	protected int quantidadePericias;
	protected String proficienciaArmas;
	protected String proficienciaProtecoes;
	protected TrilhaAbstrata trilha;
	protected Map<String,Poder> repoPoderesDaClasse;
	protected Poder poderInicial;
	/* eu tirei as perícias iniciais específicas de cada classe, quando a pessoa cria um personagem novo,
	 * ela pode escolher quaisquer perícias, dentro do limite da classe do personagem
	*/
	
	public ClasseAbstrata() {
		
	}

	public ClasseAbstrata(int nex, int vida, int esforco, int sanidade, int quantidadePericias,
			String proficienciaArmas, String proficienciaProtecoes, TrilhaAbstrata trilha, Poder poderInicial) {
		this.nex = nex;
		this.vida = vida;
		this.esforco = esforco;
		this.sanidade = sanidade;
		this.quantidadePericias = quantidadePericias;
		this.proficienciaArmas = proficienciaArmas;
		this.proficienciaProtecoes = proficienciaProtecoes;
		this.trilha = trilha;
		this.poderInicial = poderInicial;
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

	public Poder getPoderInicial() {
		return this.poderInicial;
	}

	public abstract void subirDeNex(Atributos atributos);

	/* esse método serve para quando houver um erro na progressão de nível do personagem
	 * e precisar voltar ao nível anterior
	 */
	public abstract void corrigirNEX(Atributos atributos);

	public abstract void increasePoderInicial();

}
