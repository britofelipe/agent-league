package models.personagem.exception;

import java.io.Serializable;

public class AgilidadeMaximaException extends Exception implements Serializable {
	public AgilidadeMaximaException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
