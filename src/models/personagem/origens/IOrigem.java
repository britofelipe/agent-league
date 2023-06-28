package models.personagem.origens;

import models.personagem.Poder;
import models.personagem.pericia.Pericia;

public interface IOrigem {
	Pericia getPericiaTreinada1();
	Pericia getPericiaTreinada2();
	Poder getPoder();
	String getDescricao();
}
