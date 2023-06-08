package models.trilha;

import models.personagem.Habilidade;

public interface ITrilha {
	String getNome();
	String getDescricao();
	Habilidade getHabilidadeNex10();
	Habilidade getHabilidadeNex40();
	Habilidade getHabilidadeNex65();
	Habilidade getHabilidadeNex99();
}
