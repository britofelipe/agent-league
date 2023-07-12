package models.personagem.exception;

import java.io.Serializable;

public class VigorMaximoException extends Exception implements Serializable{
	public VigorMaximoException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
