import game.AgentLeague;
import grafico.ficha.*;
import grafico.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando Agent League");
		AgentLeague game = new AgentLeague();
		Administrador administrador = new Administrador(game);
	}
}
