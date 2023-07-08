package models.personagem;

public class Atributos {
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

	public void addAgilidade() {
		if(this.agilidade < 5) {
			this.agilidade++;
		} else {
			// atributo já no máximo
		}
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public void addForca() {
		if(this.forca < 5) {
			this.forca++;
		} else {
			// atributo já no máximo
		}
	}

	public int getIntelecto() {
		return intelecto;
	}

	public void setIntelecto(int intelecto) {
		this.intelecto = intelecto;
	}

	public void addIntelecto() {
		if(this.intelecto < 5) {
			this.intelecto++;
		} else {
			// atributo já no máximo
		}
	}

	public int getPresenca() {
		return presenca;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}

	public void addPresenca() {
		if(this.presenca < 5) {
			this.presenca++;
		} else {
			// atributo já no máximo
		}
	}

	public int getVigor() {
		return vigor;
	}

	public void setVigor(int vigor) {
		this.vigor = vigor;
	}

	public void addVigor() {
		if(this.vigor < 5) {
			this.vigor++;
		} else {
			// atributo já no máximo
		}
	}
	
}
