package models.classes;

import java.util.Map;

import models.personagem.*;
import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;
import models.classes.exception.*;

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

	public void curarVida(int cura) throws CurarVidaException {
        if(cura >= 0)
			this.vida += cura;
        else {
        	throw new CurarVidaException(cura);
        }
    }

    public void perderVida(int dano) throws PerderVidaException {
        if(dano >= 0)
			this.vida -= dano;
        else {
        	throw new PerderVidaException(dano);
        }
    }

    public void curarEsforco(int cura) throws CurarEsforcoException {
        if(cura >= 0)
			this.esforco += cura;
        else {
        	throw new CurarEsforcoException(cura);
        }
    }

    public void perderEsforco(int dano) throws PerderEsforcoException {
        if(dano >= 0)
			this.esforco -= dano;
        else {
        	throw new PerderEsforcoException(dano);
        }
    }

    public void curarSanidade(int cura) throws CurarSanidadeException {
        if(cura >= 0)
			this.sanidade += cura;
        else {
        	throw new CurarSanidadeException(cura);
        }
    }

    public void perderSanidade(int dano) throws PerderSanidadeException {
        if(dano >= 0)
			this.sanidade -= dano;
        else {
        	throw new PerderSanidadeException(dano);
        }
    }

	public Poder getPoderInicial() {
		return this.poderInicial;
	}

	public abstract void subirDeNex(Atributos atributos) throws NexMaximoException;

	/* esse método serve para quando houver um erro na progressão de nível do personagem
	 * e precisar voltar ao nível anterior
	 */
	public abstract void corrigirNEX(Atributos atributos) throws NexMinimoException;

	public abstract void increasePoderInicial() throws IncreasePoderException;

}
