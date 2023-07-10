package models.classes.exception;

public class NexMinimoException extends Exception {
	private int nex;
	
	public NexMinimoException(int nex) {
		super("Nível mínimo já alcançado!");
		this.nex = nex;
	}
	
	public int getId() {
		return nex;
	}
}
