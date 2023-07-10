package models.personagem.exception;

public class AgilidadeMaximaException extends Exception {
	public AgilidadeMaximaException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
