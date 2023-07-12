package models.personagem.exception;

import java.io.Serializable;

public class IntelectoMaximoException extends Exception implements Serializable {
	public IntelectoMaximoException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
