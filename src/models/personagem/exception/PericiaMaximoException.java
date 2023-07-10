package models.personagem.exception;

import models.pericias.Pericia;

public class PericiaMaximoException extends Exception {
	Pericia pericia;
	
	public PericiaMaximoException(Pericia pericia) {
		super("A pericia já está no máximo!");
		this.pericia = pericia;
	}
}
