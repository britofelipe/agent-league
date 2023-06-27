package models.personagem;

import java.util.Map;
import java.util.Vector;

import models.personagem.classes.ClasseAbstrata;
import models.personagem.origens.OrigemAbstrata;

public class Personagem {
	private int id;
	private String jogador;
	private String nome;
	private Atributos atributos;

	private ClasseAbstrata classe;
	private OrigemAbstrata origem;
	private DescricaoPersonagem descricao;

	private Vector<Pericia> periciasTreinadas;
	private int limitePericiasTreinadas;
	private Equipamento equipamento;
	
	private Map<String,Poder> repoPoderesPersonagem;

	public Personagem() {

	}
	
	public Personagem(int id, String jogador) {
		this.id = id;
		this.jogador = jogador;
	}

	public Personagem(int id, String jogador, String nome, Atributos atributos, DescricaoPersonagem descricao, ClasseAbstrata classe,
			OrigemAbstrata origem, Vector<Pericia> periciasTreinadas, int limitePericiasTreinadas,
			Equipamento equipamento, Map<String, Poder> repoPoderesPersonagem) {
		this.id = id;
		this.jogador = jogador;
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
	
	public String getJogador() {
		return jogador;
	}

	public void setJogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Atributos getAtributos() {
		return this.atributos;
	}

	public int getAgilidade() {
		return this.atributos.getAgilidade();
	}

	public int getForca() {
		return this.atributos.getForca();
	}

	public int getIntelecto() {
		return this.atributos.getIntelecto();
	}

	public int getPresenca() {
		return this.atributos.getPresenca();
	}

	public int getVigor() {
		return this.atributos.getVigor();
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
		return this.origem;
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
