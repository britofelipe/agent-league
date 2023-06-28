package models.personagem;

public class Arma {
    private String nome;
    private String descricao;
    private int categoria;
    private int danoMax;
    private String efeitoCritico;
    private String alcance;
    private String tipoDano;
    private int espacosQueOcupa;

    public Arma(){

    }
    
    public Arma(String nome, String descricao, int categoria, int danoMax, String efeitoCritico, String alcance,
			String tipoDeDano, int espacosQueOcupa) {
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.danoMax = danoMax;
		this.efeitoCritico = efeitoCritico;
		this.alcance = alcance;
		this.tipoDano = tipoDeDano;
		this.espacosQueOcupa = espacosQueOcupa;
	}

	public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getCategoria(){
        return this.categoria;
    }

    public int getDanoMax(){
        return this.danoMax;
    }

    public String getEfeitoCritico(){
        return this.efeitoCritico;
    }

    public String getAlcance(){
        return this.alcance;
    }

    public String getTipoDano(){
        return this.tipoDano;
    }

    public int getEspacosQueOcupa(){
        return this.espacosQueOcupa;
    }
}
