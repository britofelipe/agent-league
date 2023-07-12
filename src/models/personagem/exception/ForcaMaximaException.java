package models.personagem.exception;

import java.io.Serializable;

public class ForcaMaximaException extends Exception implements Serializable {
	public ForcaMaximaException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
