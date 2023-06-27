package models.personagem.origens;

import models.personagem.Pericia;
import models.personagem.Poder;

public interface IOrigem {
	Pericia getPericiaTreinada1();
	Pericia getPericiaTreinada2();
	Poder getPoder();
	String getDescricao();
}
