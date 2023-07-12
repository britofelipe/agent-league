package models.personagem.exception;

import java.io.Serializable;

import models.pericias.Pericia;

public class PericiaOriginariaException extends Exception implements Serializable{
	Pericia pericia;
	
	public PericiaOriginariaException(Pericia pericia) {
		super("Pericia já originária da origem!");
		this.pericia = pericia;
	}
}
