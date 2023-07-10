package models.pericias;

import models.pericias.exception.TreinoMaximoException;

public interface IPericia {
	void aumentaTreino() throws TreinoMaximoException;
	boolean dependeNivelTreino();
	boolean dependeCarga();
	boolean dependeKitUtensilios();
	String getNome();
	String getNivelTreino();
	int getModificadorTreino();
	int getNivelAtributoBase();
}
