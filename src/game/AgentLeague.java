package game;

import java.util.Vector;

import models.personagem.Personagem;

public class AgentLeague implements IAgentLeague {
	private Vector<Personagem> repoPersonagens;
	private int numeroPersonagens;
	
	public AgentLeague() {

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
	
	public void addPersonagem(Personagem ficha) {
		this.repoPersonagens.add(ficha);
		numeroPersonagens++;
	}
	
	public void removePersonagem(int id) {
		repoPersonagens.remove(procuraPersonagem(id));
	}

	public Personagem procuraPersonagem(int id) {
		for(Personagem ficha : repoPersonagens) {
			if(ficha.getId() == id) {
				return ficha;
			}
		}
		return null;
	}
	
}
