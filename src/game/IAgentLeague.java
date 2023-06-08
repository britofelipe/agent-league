package game;

import models.personagem.FichaPersonagem;

public interface IAgentLeague {
	void addPersonagem(FichaPersonagem ficha);
	void removePersonagem(int id);
	FichaPersonagem procuraPersonagem(int id);
}
