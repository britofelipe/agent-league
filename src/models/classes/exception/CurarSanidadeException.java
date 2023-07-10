package models.classes.exception;

public class CurarSanidadeException extends Exception {
	private int cura;
	
	public CurarSanidadeException(int cura) {
		super("Valor inválido para curar sanidade!");
		this.cura = cura;
	}
	
	public int getCura() {
		return cura;
	}
}
