package game;

import models.personagem.Personagem;

public interface IAgentLeague {
	void addPersonagem(Personagem ficha);
	void removePersonagem(int id);
	Personagem procuraPersonagem(int id);
}
