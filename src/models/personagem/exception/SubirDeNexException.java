package models.personagem.exception;

public class SubirDeNexException extends Exception {
	String motivo;
	
	public SubirDeNexException(String motivo) {
		super("Erro ao subir de nível!");
		this.motivo = motivo;
	}
}
