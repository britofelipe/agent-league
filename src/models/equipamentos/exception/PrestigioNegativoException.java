package models.equipamentos.exception;

public class PrestigioNegativoException extends Exception {

	private int valor;

	public PrestigioNegativoException(int valor) {
		super("Prestigio não pode ser negativo!");
		this.valor = valor;
	}

}
