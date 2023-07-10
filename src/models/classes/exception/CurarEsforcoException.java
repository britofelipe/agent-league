package models.classes.exception;

public class CurarEsforcoException extends Exception {
	private int cura;
	
	public CurarEsforcoException(int cura) {
		super("Valor inválido para curar esforço!");
		this.cura = cura;
	}
	
	public int getCura() {
		return cura;
	}
}
