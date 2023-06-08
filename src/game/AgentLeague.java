package game;

import java.util.Vector;

import models.personagem.FichaPersonagem;

public class AgentLeague implements IAgentLeague {
	private Vector<FichaPersonagem> repoPersonagens;
	private int numeroPersonagens;
	
	public AgentLeague() {

	}

	public AgentLeague(Vector<FichaPersonagem> repoPersonagens) {
		this.numeroPersonagens = 0;
		this.repoPersonagens = repoPersonagens;
	}

	public Vector<FichaPersonagem> getRepoPersonagens() {
		return repoPersonagens;
	}

	public void setRepoPersonagens(Vector<FichaPersonagem> repoPersonagens) {
		this.repoPersonagens = repoPersonagens;
	}
	
	public void addPersonagem(FichaPersonagem ficha) {
		this.repoPersonagens.add(ficha);
		numeroPersonagens++;
	}
	
	public void removePersonagem(int id) {
		repoPersonagens.remove(procuraPersonagem(id));
	}

	public FichaPersonagem procuraPersonagem(int id) {
		for(FichaPersonagem ficha : repoPersonagens) {
			if(ficha.getId() == id) {
				return ficha;
			}
		}
		return null;
	}
	
}
