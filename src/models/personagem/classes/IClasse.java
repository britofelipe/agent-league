package models.personagem.classes;

import models.personagem.Atributos;

public interface IClasse {
	void subirDeNex(Atributos atributos);
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
}
