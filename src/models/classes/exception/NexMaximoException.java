package models.classes.exception;

public class NexMaximoException extends Exception {
	private int nex;
	
	public NexMaximoException(int nex) {
		super("Nível máximo já alcançado!");
		this.nex = nex;
	}
	
	public int getId() {
		return nex;
	}
}
