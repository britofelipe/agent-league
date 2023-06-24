package models.personagem;

public class Arma {
    private String nome;
    private String descricao;
    private int categoria;
    private int danoMax;
    private String efeitoCritico;
    private String alcance;
    private String tipoDeDano;
    private int espacosQueOcupa;

    public Arma(){

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

    public String getTipoDeDano(){
        return this.tipoDeDano;
    }

    public int getEspacosQueOcupa(){
        return this.espacosQueOcupa;
    }
}
