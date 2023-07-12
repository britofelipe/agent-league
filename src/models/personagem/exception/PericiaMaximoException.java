package models.personagem.exception;

import java.io.Serializable;

import models.pericias.Pericia;

public class PericiaMaximoException extends Exception implements Serializable{
	Pericia pericia;
	
	public PericiaMaximoException(Pericia pericia) {
		super("A pericia já está no máximo!");
		this.pericia = pericia;
	}
}
