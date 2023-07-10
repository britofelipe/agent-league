package models.personagem.exception;

public class VigorMaximoException extends Exception {
	public VigorMaximoException() {
		super("Capacidade máxima do tributo já atingida!");
	}
}
