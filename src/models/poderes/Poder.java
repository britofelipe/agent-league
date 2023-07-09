package models.poderes;

public class Poder implements IPoder {
	private String nome;
	private String descricao;
	
	public Poder() {

	}

	public Poder(String nome, String descricao) {
	    try {
	        if (nome == null) {
	            throw new IllegalArgumentException("O nome não pode ser nulo.");
	        }
	        if (descricao == null) {
	            throw new IllegalArgumentException("A descrição não pode ser nula.");
	        }

	        this.nome = nome;
	        this.descricao = descricao;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao criar uma instância de Poder: " + e.getMessage());
	    }
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
	    try {
	        if (nome == null) {
	            throw new IllegalArgumentException("O nome não pode ser nulo.");
	        }

	        this.nome = nome;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao definir o nome do Poder: " + e.getMessage());
	    }
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
	    try {
	        if (descricao == null) {
	            throw new IllegalArgumentException("A descrição não pode ser nula.");
	        }

	        this.descricao = descricao;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao definir a descrição do Poder: " + e.getMessage());
	    }
	}	
}
