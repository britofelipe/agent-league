package models.classes.exception;

public class PerderSanidadeException extends Exception {
	private int dano;
	
	public PerderSanidadeException(int dano) {
		super("Valor inválido para perder sanidade!");
		this.dano = dano;
	}
	
	public int getCura() {
		return dano;
	}
}
