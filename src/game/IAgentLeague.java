package game;

import game.exception.*;
import models.personagem.Personagem;

public interface IAgentLeague {
	void addPersonagem(Personagem ficha) throws PersonagemExistenteException;
	void removePersonagem(int id) throws PersonagemInexistenteException;
	Personagem procuraPersonagem(int id);
}
