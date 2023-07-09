package game.exception;

public class PersonagemExistenteException extends Exception {
	private int id;
	
	public PersonagemExistenteException(int id) {
		super("Personagem já existente!");
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
