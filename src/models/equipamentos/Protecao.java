package models.equipamentos;

public class Protecao {
    private String nome;
    private String descricao;
    private int buffDefesa;
    private int categoria;
    private int espacosQueOcupa;

    public Protecao() {

    }
    
    public Protecao(String nome, String descricao, int buffDefesa, int categoria, int espacosQueOcupa) {
        this.nome = nome;
        this.descricao = descricao;
        this.buffDefesa = buffDefesa;
        this.categoria = categoria;
        this.espacosQueOcupa = espacosQueOcupa;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getBuffDefesa(){
        return this.buffDefesa;
    }

    public int getCategoria(){
        return this.categoria;
    }

    public int getEspacosQueOcupa(){
        return this.espacosQueOcupa;
    }
}
