package models.personagem;

public interface IPericia {
	void aumentaTreino();
	void setModificadorTreino();
	boolean dependeNivelTreino();
	boolean dependeCarga();
	boolean dependeKitUtensilios();
	String getNome();
	String getNivelTreino();
	int getModificadorTreino();
	int getNivelAtributoBase();
	int teste();
}
