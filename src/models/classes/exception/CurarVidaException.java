package models.classes.exception;

public class CurarVidaException extends Exception{
	private int cura;
	
	public CurarVidaException(int cura) {
		super("Valor inválido para curar vida!");
		this.cura = cura;
	}
	
	public int getCura() {
		return cura;
	}
}
