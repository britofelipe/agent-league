package models.personagem.exception;

import java.io.Serializable;

public class SubirDeNexException extends Exception implements Serializable {
	String motivo;
	
	public SubirDeNexException(String motivo) {
		super("Erro ao subir de nível!");
		this.motivo = motivo;
	}
}
