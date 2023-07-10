package models.classes.exception;

public class PerderVidaException extends Exception{
	private int dano;
	
	public PerderVidaException(int dano) {
		super("Valor inválido para perder vida!");
		this.dano = dano;
	}
	
	public int getCura() {
		return dano;
	}
}
