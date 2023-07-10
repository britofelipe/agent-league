package models.personagem.exception;

import models.pericias.Pericia;

public class PericiaOriginariaException extends Exception {
	Pericia pericia;
	
	public PericiaOriginariaException(Pericia pericia) {
		super("Pericia já originária da origem!");
		this.pericia = pericia;
	}
}
