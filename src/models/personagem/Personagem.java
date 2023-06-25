package models.personagem;

import java.util.Map;
import java.util.Vector;

public class Personagem {
	private int id;
	private String nome;
	private Atributos atributos;
	
	private DescricaoPersonagem descricao;
	private ClasseAbstrata classe;
	private OrigemAbstrata origem;

	private Vector<Pericia> periciasTreinadas;
	private int limitePericiasTreinadas;
	private Equipamento equipamento;
	
	private Map<String,Poder> repoPoderesPersonagem;

	public Personagem() {

	}

	public Personagem(int id, String nome, Atributos atributos, DescricaoPersonagem descricao, ClasseAbstrata classe,
			OrigemAbstrata origem, Vector<Pericia> periciasTreinadas, int limitePericiasTreinadas,
			Equipamento equipamento, Map<String, Poder> repoPoderesPersonagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.atributos = atributos;
		this.descricao = descricao;
		this.classe = classe;
		this.origem = origem;
		this.periciasTreinadas = periciasTreinadas;
		this.limitePericiasTreinadas = limitePericiasTreinadas;
		this.equipamento = equipamento;
		this.repoPoderesPersonagem = repoPoderesPersonagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Map<String, Poder> getRepoPoderesPersonagem() {
		return repoPoderesPersonagem;
	}

	public void setRepoPoderesPersonagem(Map<String, Poder> repoPoderes) {
		this.repoPoderesPersonagem = repoPoderes;
	}

}
