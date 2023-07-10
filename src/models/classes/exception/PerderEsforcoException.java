package models.classes.exception;

public class PerderEsforcoException extends Exception {
	private int dano;
	
	public PerderEsforcoException(int dano) {
		super("Valor inválido para perder esforço!");
		this.dano = dano;
	}
	
	public int getCura() {
		return dano;
	}
}
