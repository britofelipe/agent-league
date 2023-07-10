package models.classes.exception;

public class IncreasePoderException extends Exception {
	public IncreasePoderException() {
		super("Seu nível não possibilita a subida de poder!");
	}
}
