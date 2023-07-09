package models.personagem;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import models.classes.ClasseAbstrata;
import models.equipamentos.Equipamento;
import models.origens.OrigemAbstrata;
import models.pericias.Pericia;
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
			OrigemAbstrata origem, Map<String, Pericia> periciasTreinadas, Equipamento equipamento) {
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
			// exceção de que a pessoa selecionou entre as perícias extras, uma das que a origem já dá
		} else {
			this.periciasTreinadas.put(this.origem.getPericiaTreinada1().getNome(), this.origem.getPericiaTreinada1());
		}

		if(this.periciasTreinadas.containsKey(this.origem.getPericiaTreinada2().getNome())) {
			// exceção de que a pessoa selecionou entre as perícias extras, uma das que a origem já dá
		} else {
			this.periciasTreinadas.put(this.origem.getPericiaTreinada2().getNome(), this.origem.getPericiaTreinada2());
		}
	}
	
	public String getJogador() {
		return jogador;
	}

	public void setJogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		this.id = id;
	}

	public DescricaoPersonagem getDescricao() {
		return descricao;
	}

	public void setDescricao(DescricaoPersonagem descricao) {
		this.descricao = descricao;
	}

	public ClasseAbstrata getClasse() {
		return classe;
	}

	public void setClasse(ClasseAbstrata classe) {
		this.classe = classe;
	}

	public OrigemAbstrata getOrigem() {
		return this.origem;
	}

	public void setOrigem(OrigemAbstrata origem) {
		this.origem = origem;
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
	public void subirDeNex() {
		this.classe.subirDeNex(this.atributos);
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
				/* lembrar de usar um catch para a falha em elevar o poder inicial de classe e, caso ela seja recebida, chamar a
				 * função de corrigir o NEX e lançar uma exceção de falha em subir de NEX no lugar
				 */
				this.classe.increasePoderInicial();
		}
	}

	// implementação para quando o poder novo é da classe
	// para essa implementação, eu preciso que o jogador já tenha escolhido o poder novo, esse método só adiciona ele no repo do personagem
	public void subirDeNex(Poder poderClasse) {
		this.classe.subirDeNex(this.atributos);
		// todas as vezes em que o poder novo é da classe, o NEX alcançado é divisível por 15
		if(this.classe.getNex() % 15 == 0) {
			this.repoPoderesPersonagem.put(poderClasse.getNome(), poderClasse);
		} else {
			this.classe.corrigirNEX(this.atributos);
			// exceção falha em subir de nível
		}
	}

	// implementação para quando o poder novo é aumento de atributo
	// para essa implementação, eu preciso que o jogador escolha o atributo a ser aumentado (inicialmente vou considerar que vou receber isso como um string)
	public void subirDeNex(String atributo) {
		this.classe.subirDeNex(this.atributos);
		if(this.classe.getNex() == 20 || this.classe.getNex() == 50 || this.classe.getNex() == 80 || this.classe.getNex() == 95) {
			switch(atributo) {
			/* lembrar de usar um catch para a exceção de atributo no máximo e, caso ela seja recebida, chamar a
			 * função de corrigir o NEX e lançar uma exceção de falha em subir de NEX no lugar
			 */
			case "Agilidade":
				this.atributos.addAgilidade();
				break;
			case "Força":
				this.atributos.addForca();
				break;
			case "Intelecto":
				this.atributos.addIntelecto();
				break;
			case "Presença":
				this.atributos.addPresenca();
				break;
			case "Vigor":
				this.atributos.addVigor();
				break;
			default:
				this.classe.corrigirNEX(this.atributos);
				// exceção falha em subir de nível
			}
		} else {
			this.classe.corrigirNEX(this.atributos);
			// exceção falha em subir de nível
		}
	}

	// implementação para quando o poder novo é aumento de perícias
	// para essa implementação, eu preciso que o jogador escolha as perícias que deseja aumentar o treino, o limite sendo 2 + intelecto do personagem (inicialmente vou considerar que vou receber isso como um vector de strings)
	public void subirDeNex(Vector<String> pericias) {
		this.classe.subirDeNex(this.atributos);
		if(this.classe.getNex() % 35 == 0) {
			// testando se dá mesmo para aumentar o treino de todas as perícias escolhidas:
			for(int i = 0; i < this.periciasTreinadas.size() - 1; i++) {
				if(this.periciasTreinadas.containsKey(pericias.elementAt(i))) {
					if(this.periciasTreinadas.get(pericias.elementAt(i)).getModificadorTreino() == 15) {
						// exceção de que uma das perícias que se deseja aumentar já está no máximo
						// solução: a pessoa tem que escolher de novo as que quer aumentar
					}
				}
			}
			// aumentando, de fato, os treinos
			for(int i = 0; i < this.periciasTreinadas.size() - 1; i++) {
				if(this.periciasTreinadas.containsKey(pericias.elementAt(i))) {
					this.periciasTreinadas.get(pericias.elementAt(i)).aumentaTreino();
				}
			}
		} else {
			this.classe.corrigirNEX(this.atributos);
			// exceção falha em subir de nível
		}
	}

}
