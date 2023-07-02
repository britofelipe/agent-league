import game.AgentLeague;
import grafics.*;
import grafics.ficha.*;
import models.personagem.Personagem;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando Agent League");
		AgentLeague game = new AgentLeague();
		Administrador administrador = new Administrador(game);		
	}
}
