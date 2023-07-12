package models.personagem.exception;

import java.io.Serializable;

public class PresencaMaximaException extends Exception implements Serializable {
	public PresencaMaximaException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
