package models.equipamentos.exception;

public class ExcessoDeItensException extends Exception {
	public ExcessoDeItensException() {
		super("Limite de itens atingido!");
	}
}
