package models.pericias;

import models.pericias.exception.TreinoMaximoException;

public class Pericia implements IPericia {
	private String nome;
	private String nivelTreino;
	private String[] repoNivelTreino = {"Destreinado", "Treinado", "Veterano", "Expert"};
	private int modificadorTreino;
	private int nivelAtributoBase;
	private boolean dependeNivelTreino;
	private boolean dependeCarga;
	private boolean dependeKitUtensilios;

	public Pericia(String nome, String nivelTreino, int modificadorTreino, int nivelAtributoBase, boolean dependeNivelTreino,
	boolean dependeCarga, boolean dependeKitUtensilios) {
		this.nome = nome;
		this.nivelTreino = nivelTreino;
		this.modificadorTreino = modificadorTreino;
		this.nivelAtributoBase = nivelAtributoBase;
		this.dependeCarga = dependeCarga;
		this.dependeKitUtensilios = dependeKitUtensilios;
		this.dependeNivelTreino = dependeNivelTreino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivelTreino() {
		return nivelTreino;
	}

	public void setNivelTreino(String nivelTreino) {
		this.nivelTreino = nivelTreino;
	}

	public int getModificadorTreino() {
		return modificadorTreino;
	}

	public void setModificadorTreino(int modificadorTreino) {
		this.modificadorTreino = modificadorTreino;
	}

	public int getNivelAtributoBase() {
		return nivelAtributoBase;
	}

	public void setNivelAtributoBase(int nivelAtributoBase) {
		this.nivelAtributoBase = nivelAtributoBase;
	}

	public void aumentaTreino() throws TreinoMaximoException {
		if(this.modificadorTreino < 20) {
			this.nivelTreino = repoNivelTreino[this.modificadorTreino/5];
			this.modificadorTreino += 5;
		}
		else {
			throw new TreinoMaximoException();
		}
	}

	public boolean dependeNivelTreino() {
		return this.dependeNivelTreino;
	}

	public boolean dependeCarga() {
		return this.dependeCarga;
	}

	public boolean dependeKitUtensilios() {
		return this.dependeKitUtensilios;
	}

}
