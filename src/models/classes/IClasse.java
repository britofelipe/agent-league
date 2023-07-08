package models.classes;

import models.personagem.Atributos;
import models.poderes.Poder;

public interface IClasse {
	int getNex();
	void curarVida(int cura);
	void perderVida(int dano);
	int getVida();
	void curarEsforco(int cura);
	void perderEsforco(int dano);
	int getEsforco();
	void curarSanidade(int cura);
	void perderSanidade(int dano);
	int getSanidade();
	int getQuantidadePericias();
	String getProficienciaArmas();
	String getProficienciaProtecoes();
	Poder getPoderInicial();
	void subirDeNex(Atributos atributos);
	void corrigirNEX(Atributos atributos);
	void increasePoderInicial();
}
