package models.origens;

import models.poderes.Poder;
import models.pericias.Pericia;

public interface IOrigem {
	String getNome();
	Pericia getPericiaTreinada1();
	Pericia getPericiaTreinada2();
	String getDescricao();
	void setDescricao(String descricao);
	Poder getPoder();
	void setPoder(Poder poder);
}
