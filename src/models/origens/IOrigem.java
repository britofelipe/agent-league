package models.origens;

import models.poderes.Poder;
import models.pericias.Pericia;

public interface IOrigem {
	Pericia getPericiaTreinada1();
	Pericia getPericiaTreinada2();
	Poder getPoder();
	String getDescricao();
}
