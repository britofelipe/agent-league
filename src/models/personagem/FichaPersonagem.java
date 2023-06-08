package models.personagem;

import java.util.Map;
import java.util.Vector;

public class FichaPersonagem {
	private int agilidade;
	private int forca;
	private int intelecto;
	private int presenca;
	private int vigor;
	
	private DescricaoPersonagem descricao;
	private ClasseAbstrata classe;
	private OrigemAbstrata origem;

	private Vector<Pericia> periciasTreinadas;
	private int limitePericiasTreinadas;
	private Equipamento equipamento;
	
	private Map<String,Poder> repoPoderes;

	public FichaPersonagem() {

	}

	public FichaPersonagem(int agilidade, int forca, int intelecto, int presenca, int vigor,
			DescricaoPersonagem descricao, ClasseAbstrata classe, OrigemAbstrata origem,
			Vector<Pericia> periciasTreinadas, int limitePericiasTreinadas, Equipamento equipamento,
			Map<String, Poder> repoPoderes) {
		this.agilidade = agilidade;
		this.forca = forca;
		this.intelecto = intelecto;
		this.presenca = presenca;
		this.vigor = vigor;
		this.descricao = descricao;
		this.classe = classe;
		this.origem = origem;
		this.periciasTreinadas = periciasTreinadas;
		this.limitePericiasTreinadas = limitePericiasTreinadas;
		this.equipamento = equipamento;
		this.repoPoderes = repoPoderes;
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

	public DescricaoPersonagem getDescricao() {
		return descricao;
	}

	public void setDescricao(DescricaoPersonagem descricao) {
		this.descricao = descricao;
	}

	public ClasseAbstrata getClasse() {
		return classe;
	}

	public void setClasse(ClasseAbstrata classe) {
		this.classe = classe;
	}

	public OrigemAbstrata getOrigem() {
		return origem;
	}

	public void setOrigem(OrigemAbstrata origem) {
		this.origem = origem;
	}

	public Vector<Pericia> getPericiasTreinadas() {
		return periciasTreinadas;
	}

	public void setPericiasTreinadas(Vector<Pericia> periciasTreinadas) {
		this.periciasTreinadas = periciasTreinadas;
	}

	public int getLimitePericiasTreinadas() {
		return limitePericiasTreinadas;
	}

	public void setLimitePericiasTreinadas(int limitePericiasTreinadas) {
		this.limitePericiasTreinadas = limitePericiasTreinadas;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Map<String, Poder> getRepoPoderes() {
		return repoPoderes;
	}

	public void setRepoPoderes(Map<String, Poder> repoPoderes) {
		this.repoPoderes = repoPoderes;
	}
	
	
}
