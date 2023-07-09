package game.exception;

public class PersonagemInexistenteException extends Exception {
	private int id;
	
	public PersonagemInexistenteException(int id) {
		super("Personagem não encontrado!");
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}