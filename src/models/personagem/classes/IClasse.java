package models.personagem;

public interface IClasse {
	void subirDeNivel();
	int getNivel();
	void curarVida(int cura);
	void perderVida(int dano);
	int getVida();
	int curarEsforco(int cura);
	int perderEsforco(int dano);
	int getEsforco();
	int curarSanidade(int cura);
	int perderSanidade(int dano);
	int getSanidade();
	int getQuantidadePericias();
	int getProficiaInicialAtaque();
	int getProficiaInicialDefesa();
	String escolherNovoPoder(String nome);
}
