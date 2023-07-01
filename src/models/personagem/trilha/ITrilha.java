package models.trilha;

import models.personagem.Poder;

public interface ITrilha {
	String getNome();
	String getDescricao();
	Poder getPoderNex10();
	Poder getPoderNex40();
	Poder getPoderNex65();
	Poder getPoderNex99();
}
