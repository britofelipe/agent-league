package models.personagem;

import java.io.Serializable;

public class DescricaoPersonagem implements Serializable {
	private String genero;
	private int idade;
	private String aparencia;
	private String historico;
	private String objetivo;
	
	public DescricaoPersonagem() {

	}

	public DescricaoPersonagem(String nome, String genero, int idade, String aparencia, String historico,
			String objetivo) {
		this.genero = genero;
		this.idade = idade;
		this.aparencia = aparencia;
		this.historico = historico;
		this.objetivo = objetivo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAparencia() {
		return aparencia;
	}

	public void setAparencia(String aparencia) {
		this.aparencia = aparencia;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
}
