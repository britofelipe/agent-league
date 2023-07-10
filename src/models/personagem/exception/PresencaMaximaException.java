package models.personagem.exception;

public class PresencaMaximaException extends Exception {
	public PresencaMaximaException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
