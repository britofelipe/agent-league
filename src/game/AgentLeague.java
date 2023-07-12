package game;

import java.util.Vector;

import game.exception.*;
import models.personagem.Personagem;

public class AgentLeague implements IAgentLeague {
	private Vector<Personagem> repoPersonagens;
	private int numeroPersonagens;
	
	public AgentLeague() {
		this.numeroPersonagens = 0;
		this.repoPersonagens = new Vector<Personagem>();
	}

	public AgentLeague(Vector<Personagem> repoPersonagens) {
		this.numeroPersonagens = 0;
		this.repoPersonagens = repoPersonagens;
	}

	public Vector<Personagem> getRepoPersonagens() {
		return repoPersonagens;
	}

	public void setRepoPersonagens(Vector<Personagem> repoPersonagens) {
		this.repoPersonagens = repoPersonagens;
	}
	
	public int getNumeroPersonagens( ) {
		return this.numeroPersonagens;
	}
	
	public void addPersonagem(Personagem personagem) throws PersonagemExistenteException {
		if(personagem != null && !this.existe(personagem.getId())) {
			this.repoPersonagens.add(personagem);
			numeroPersonagens++;
		} else {
			throw new PersonagemExistenteException(personagem.getId());
		}

	}
	
	public void removePersonagem(int id) throws PersonagemInexistenteException {
		if(id >= 0 && this.existe(id)) {
			repoPersonagens.remove(procuraPersonagem(id));
		} else {
			throw new PersonagemInexistenteException(id);
		}
	}

	public Personagem procuraPersonagem(int id) {
		for(Personagem ficha : repoPersonagens) {
			if(ficha.getId() == id) {
				return ficha;
			}
		}
		return null;
	}
	
	public boolean existe(int id) {
		return this.procuraPersonagem(id) != null;
	}
	
}
