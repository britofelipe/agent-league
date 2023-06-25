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

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getIntelecto() {
		return intelecto;
	}

	public void setIntelecto(int intelecto) {
		this.intelecto = intelecto;
	}

	public int getPresenca() {
		return presenca;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}

	public int getVigor() {
		return vigor;
	}

	public void setVigor(int vigor) {
		this.vigor = vigor;
	}
	
}
