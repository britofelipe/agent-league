package models.personagem.exception;

public class ForcaMaximaException extends Exception {
	public ForcaMaximaException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
