package models.classes;

import models.classes.exception.CurarEsforcoException;
import models.classes.exception.CurarSanidadeException;
import models.classes.exception.CurarVidaException;
import models.classes.exception.IncreasePoderException;
import models.classes.exception.NexMaximoException;
import models.classes.exception.NexMinimoException;
import models.classes.exception.PerderEsforcoException;
import models.classes.exception.PerderSanidadeException;
import models.classes.exception.PerderVidaException;
import models.personagem.Atributos;
import models.poderes.Poder;

public interface IClasse {
	int getNex();
	void curarVida(int cura) throws CurarVidaException;
	void perderVida(int dano) throws PerderVidaException;
	int getVida();
	void curarEsforco(int cura) throws CurarEsforcoException;
	void perderEsforco(int dano) throws PerderEsforcoException;
	int getEsforco();
	void curarSanidade(int cura) throws CurarSanidadeException;
	void perderSanidade(int dano) throws PerderSanidadeException;
	int getSanidade();
	int getQuantidadePericias();
	String getProficienciaArmas();
	String getProficienciaProtecoes();
	Poder getPoderInicial();
	void subirDeNex(Atributos atributos) throws NexMaximoException;
	void corrigirNEX(Atributos atributos) throws NexMinimoException;
	void increasePoderInicial() throws IncreasePoderException;
}
