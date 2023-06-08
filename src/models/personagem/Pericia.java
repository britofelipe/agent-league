package models.personagem;

public class Pericia implements IPericia {
	String nome;
	String nivelTreino;
	int modificadorTreino;
	int nivelAtributoBase;
		
	public Pericia() {
	
	}

	public Pericia(String nome, String nivelTreino, int modificadorTreino, int nivelAtributoBase) {
		this.nome = nome;
		this.nivelTreino = nivelTreino;
		this.modificadorTreino = modificadorTreino;
		this.nivelAtributoBase = nivelAtributoBase;
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

	public void aumentaTreino() {
		// TODO Auto-generated method stub
		
	}

	public void setModificadorTreino() {
		// TODO Auto-generated method stub
		
	}

	public boolean dependeNivelTreino() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean dependeCarga() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean dependeKitUtensilios() {
		// TODO Auto-generated method stub
		return false;
	}

	public int teste() {
		// TODO Auto-generated method stub
		return 0;
	}
}
