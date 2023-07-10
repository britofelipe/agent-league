package models.personagem;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import models.classes.ClasseAbstrata;
import models.classes.exception.*;
import models.equipamentos.Equipamento;
import models.origens.OrigemAbstrata;
import models.pericias.Pericia;
import models.pericias.exception.TreinoMaximoException;
import models.personagem.exception.*;
import models.poderes.*;

public class Personagem {
	private int id;
	private String jogador;
	private String nome;
	private Atributos atributos;

	private ClasseAbstrata classe;
	private OrigemAbstrata origem;
	private DescricaoPersonagem descricao;

	private Map<String, Pericia> periciasTreinadas;
	private int limitePericiasTreinadas;
	private Equipamento equipamento;
	
	private Map<String,Poder> repoPoderesPersonagem;

	public Personagem() {

	}
	
	public Personagem(int id, String jogador) {
		this.id = id;
		this.jogador = jogador;
	}
	
	public Personagem(int id, String jogador, String nome, Atributos atributos, DescricaoPersonagem descricao, ClasseAbstrata classe,
			OrigemAbstrata origem, Map<String, Pericia> periciasTreinadas, Equipamento equipamento) throws PericiaOriginariaException {
		this.id = id;
		this.jogador = jogador;
		this.nome = nome;
		this.atributos = atributos;
		this.descricao = descricao;
		this.classe = classe;
		this.origem = origem;
		this.periciasTreinadas = periciasTreinadas;
		this.limitePericiasTreinadas = this.classe.getQuantidadePericias();
		this.equipamento = equipamento;
		this.repoPoderesPersonagem = new HashMap<>();

		// adicionando poder inicial da classe
		this.repoPoderesPersonagem.put(this.classe.getPoderInicial().getNome(), this.classe.getPoderInicial());

		// adicional poder inicial da origem
		this.repoPoderesPersonagem.put(this.origem.getPoder().getNome(), this.origem.getPoder());

		/* adicionando as perícias dadas pela origem (tem que lembrar que a pessoa não pode selecionar as duas perícias
		 * que a origem já dá para ela quando for escolher as perícias adicionais), se não vai dar problema
		*/

		if(this.periciasTreinadas.containsKey(this.origem.getPericiaTreinada1().getNome())) {
			throw new PericiaOriginariaException(this.origem.getPericiaTreinada1());
		} else {
			this.periciasTreinadas.put(this.origem.getPericiaTreinada1().getNome(), this.origem.getPericiaTreinada1());
		}

		if(this.periciasTreinadas.containsKey(this.origem.getPericiaTreinada2().getNome())) {
			throw new PericiaOriginariaException(this.origem.getPericiaTreinada2());
		} else {
			this.periciasTreinadas.put(this.origem.getPericiaTreinada2().getNome(), this.origem.getPericiaTreinada2());
		}
	}
	
	public String getJogador() {
		return jogador;
	}

	public void setJogador(String nome) {
	    try {
	        if (nome == null) {
	            throw new IllegalArgumentException("O nome do jogador não pode ser nulo.");
	        }
	        
	        this.nome = nome;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao definir o nome do jogador: " + e.getMessage());
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
	        System.err.println("Erro ao definir o nome: " + e.getMessage());
	    }
	}


	public Atributos getAtributos() {
		return this.atributos;
	}

	public int getAgilidade() {
		return this.atributos.getAgilidade();
	}

	public int getForca() {
		return this.atributos.getForca();
	}

	public int getIntelecto() {
		return this.atributos.getIntelecto();
	}

	public int getPresenca() {
		return this.atributos.getPresenca();
	}

	public int getVigor() {
		return this.atributos.getVigor();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
	    if (id < 0) {
	        throw new IllegalArgumentException("O ID não pode ser um valor negativo.");
	    }
	    this.id = id;
	}


	public DescricaoPersonagem getDescricao() {
		return descricao;
	}

	public void setDescricao(DescricaoPersonagem descricao) {
	    try {
	        if (descricao == null) {
	            throw new IllegalArgumentException("A descrição não pode ser nula.");
	        }

	        this.descricao = descricao;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao definir a descrição: " + e.getMessage());
	    }
	}


	public ClasseAbstrata getClasse() {
		return classe;
	}

	public void setClasse(ClasseAbstrata classe) {
	    try {
	        if (classe == null) {
	            throw new IllegalArgumentException("A classe não pode ser nula.");
	        }

	        this.classe = classe;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao definir a classe: " + e.getMessage());
	    }
	}


	public OrigemAbstrata getOrigem() {
		return this.origem;
	}

	public void setOrigem(OrigemAbstrata origem) {
	    try {
	        if (origem == null) {
	            throw new IllegalArgumentException("A origem não pode ser nula.");
	        }

	        this.origem = origem;
	    } catch (IllegalArgumentException e) {
	        System.err.println("Erro ao definir a origem: " + e.getMessage());
	    }
	}


	public Map<String, Pericia> getPericiasTreinadas() {
		return periciasTreinadas;
	}

	public void setPericiasTreinadas(Map<String, Pericia> periciasTreinadas) {
		this.periciasTreinadas = periciasTreinadas;
	}

	public int getLimitePericiasTreinadas() {
		return limitePericiasTreinadas;
	}

	public void setLimitePericiasTreinadas(int limitePericiasTreinadas) {
		this.limitePericiasTreinadas = limitePericiasTreinadas;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Map<String, Poder> getRepoPoderesPersonagem() {
		return repoPoderesPersonagem;
	}

	public void setRepoPoderesPersonagem(Map<String, Poder> repoPoderes) {
		this.repoPoderesPersonagem = repoPoderes;
	}

	// implementação para quando o poder novo é da trilha ou o ataque especial da classe
	public void subirDeNex() throws NexMinimoException {
		try {
			this.classe.subirDeNex(this.atributos);
		} catch (NexMaximoException nme) {
			System.out.println(nme.getMessage());
		}
		switch(this.classe.getNex()) {
			case 10:
				this.repoPoderesPersonagem.put(this.classe.getTrilha().getPoderNex10().getNome(), this.classe.getTrilha().getPoderNex10());
				break;
			case 40:
				this.repoPoderesPersonagem.put(this.classe.getTrilha().getPoderNex40().getNome(), this.classe.getTrilha().getPoderNex40());
				break;
			case 65:
				this.repoPoderesPersonagem.put(this.classe.getTrilha().getPoderNex65().getNome(), this.classe.getTrilha().getPoderNex65());
				break;
			case 99:
				this.repoPoderesPersonagem.put(this.classe.getTrilha().getPoderNex99().getNome(), this.classe.getTrilha().getPoderNex99());
				break;
			default:
				try{
					this.classe.increasePoderInicial();
				} catch (IncreasePoderException ipe){
					System.out.println(ipe.getMessage());
					this.classe.corrigirNEX(this.atributos);
				}
		}
	}

	// implementação para quando o poder novo é da classe
	// para essa implementação, eu preciso que o jogador já tenha escolhido o poder novo, esse método só adiciona ele no repo do personagem
	public void subirDeNex(Poder poderClasse) throws SubirDeNexException {
		try {
			this.classe.subirDeNex(this.atributos);
		} catch (NexMaximoException nme) {
			System.out.println(nme.getMessage());
		}
		// todas as vezes em que o poder novo é da classe, o NEX alcançado é divisível por 15
		if(this.classe.getNex() % 15 == 0) {
			this.repoPoderesPersonagem.put(poderClasse.getNome(), poderClasse);
		} else {
			try {
				this.classe.corrigirNEX(this.atributos);
			} catch (NexMinimoException nme) {
				System.out.println(nme.getMessage());
			}
			throw new SubirDeNexException("Poder da classe");
		}
	}

	// implementação para quando o poder novo é aumento de atributo
	// para essa implementação, eu preciso que o jogador escolha o atributo a ser aumentado (inicialmente vou considerar que vou receber isso como um string)
	public void subirDeNex(String atributo) throws SubirDeNexException {
		try {
			this.classe.subirDeNex(this.atributos);
		} catch (NexMaximoException nme) {
			System.out.println(nme.getMessage());
		}
		if(this.classe.getNex() == 20 || this.classe.getNex() == 50 || this.classe.getNex() == 80 || this.classe.getNex() == 95) {
			switch(atributo) {
			/* lembrar de usar um catch para a exceção de atributo no máximo e, caso ela seja recebida, chamar a
			 * função de corrigir o NEX e lançar uma exceção de falha em subir de NEX no lugar
			 */
			case "Agilidade":
				try{
					this.atributos.addAgilidade();
				} catch (AgilidadeMaximaException ame) {
					System.out.println(ame.getMessage());
				}
				break;
			case "Força":
				try{
					this.atributos.addForca();
				} catch (ForcaMaximaException fme) {
					System.out.println(fme.getMessage());
				}
				break;
			case "Intelecto":
				try{
					this.atributos.addIntelecto();
				} catch (IntelectoMaximoException ime) {
					System.out.println(ime.getMessage());
				}
				break;
			case "Presença":
				try{
					this.atributos.addPresenca();
				} catch (PresencaMaximaException pme) {
					System.out.println(pme.getMessage());
				}
				break;
			case "Vigor":
				try{
					this.atributos.addVigor();
				} catch (VigorMaximoException vme) {
					System.out.println(vme.getMessage());
				}
				break;
			default:
				try {
					this.classe.corrigirNEX(this.atributos);
				} catch (NexMinimoException nme) {
					System.out.println(nme.getMessage());
				}
				throw new SubirDeNexException("Atributo");
			}
		} else {
			try {
				this.classe.corrigirNEX(this.atributos);
			} catch (NexMinimoException nme) {
				System.out.println(nme.getMessage());
			}
			throw new SubirDeNexException("Atributo");
		}
	}

	// implementação para quando o poder novo é aumento de perícias
	// para essa implementação, eu preciso que o jogador escolha as perícias que deseja aumentar o treino, o limite sendo 2 + intelecto do personagem (inicialmente vou considerar que vou receber isso como um vector de strings)
	public void subirDeNex(Vector<String> pericias) throws TreinoMaximoException, PericiaMaximoException, SubirDeNexException {
		try {
			this.classe.subirDeNex(this.atributos);
		} catch (NexMaximoException nme) {
			System.out.println(nme.getMessage());
		}
		if(this.classe.getNex() % 35 == 0) {
			// testando se dá mesmo para aumentar o treino de todas as perícias escolhidas:
			for(int i = 0; i < this.periciasTreinadas.size() - 1; i++) {
				if(this.periciasTreinadas.containsKey(pericias.elementAt(i))) {
					if(this.periciasTreinadas.get(pericias.elementAt(i)).getModificadorTreino() == 15) {
						throw new PericiaMaximoException(this.periciasTreinadas.get(pericias.elementAt(i)));
					}
				}
			}
			// aumentando, de fato, os treinos
			for(int i = 0; i < this.periciasTreinadas.size() - 1; i++) {
				if(this.periciasTreinadas.containsKey(pericias.elementAt(i))) {
					try {
						this.periciasTreinadas.get(pericias.elementAt(i)).aumentaTreino();
					} catch (TreinoMaximoException tme) {
						System.out.println(tme.getMessage());
					}
				}
			}
		} else {
			try {
				this.classe.corrigirNEX(this.atributos);
			} catch (NexMinimoException nme) {
				System.out.println(nme.getMessage());
			}
			throw new SubirDeNexException("Perícias");
		}
	}

}
