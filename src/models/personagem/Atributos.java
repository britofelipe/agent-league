package models.personagem;

import java.io.Serializable;

import models.personagem.exception.*;

public class Atributos implements Serializable {
	private int agilidade;
	private int forca;
	private int intelecto;
	private int presenca;
	private int vigor;
	
	public Atributos() {

	}
	
	public Atributos(int agilidade, int forca, int intelecto, int presenca, int vigor) {
		this.agilidade = agilidade;
		this.forca = forca;
		this.intelecto = intelecto;
		this.presenca = presenca;
		this.vigor = vigor;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(int agilidade) {
		this.agilidade = agilidade;
	}

	public void addAgilidade() throws AgilidadeMaximaException {
		if(this.agilidade < 5) {
			this.agilidade++;
		} else {
			throw new AgilidadeMaximaException();
		}
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public void addForca() throws ForcaMaximaException {
		if(this.forca < 5) {
			this.forca++;
		} else {
			throw new ForcaMaximaException();
		}
	}

	public int getIntelecto() {
		return intelecto;
	}

	public void setIntelecto(int intelecto) {
		this.intelecto = intelecto;
	}

	public void addIntelecto() throws IntelectoMaximoException {
		if(this.intelecto < 5) {
			this.intelecto++;
		} else {
			throw new IntelectoMaximoException();
		}
	}

	public int getPresenca() {
		return presenca;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}

	public void addPresenca() throws PresencaMaximaException {
		if(this.presenca < 5) {
			this.presenca++;
		} else {
			throw new PresencaMaximaException();
		}
	}

	public int getVigor() {
		return vigor;
	}

	public void setVigor(int vigor) {
		this.vigor = vigor;
	}

	public void addVigor() throws VigorMaximoException {
		if(this.vigor < 5) {
			this.vigor++;
		} else {
			throw new VigorMaximoException();
		}
	}
	
}
