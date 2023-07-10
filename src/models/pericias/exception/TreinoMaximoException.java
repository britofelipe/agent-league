package models.pericias.exception;

public class TreinoMaximoException extends Exception {
	public TreinoMaximoException() {
		super("Nível máximo de treino já atingido!");
	}
}
