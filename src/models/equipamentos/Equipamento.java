package models.equipamentos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Equipamento {
	private int pontosDePrestigio = 0;
	private String patente = "Recruta";
	private String limiteDeCredito = "Baixo";
	private int[] limiteDeItensPorCategoria = {2, 0, 0, 0};
	private int[] itensPorCategoria = {0, 0, 0, 0};
	
	private int capacidadeDeCarga;
	private int limiteDeCarga;
	private boolean sobrecarga = false;
	private int cargaAtual = 0;

	private Map<String, Arma> armasPersonagem;
	private Map<String, Arma> repoArmas;
	private Map<String, Protecao> protecoesPersonagem;
	private Map<String, Protecao> repoProtecoes;

	public Equipamento(int forca) {
		capacidadeDeCarga = 5 * forca;
		limiteDeCarga = capacidadeDeCarga * 2;
		armasPersonagem = new HashMap<String, Arma>();
		protecoesPersonagem = new HashMap<String, Protecao>();
	}

	public int getPontosDePrestigio() {
		return this.pontosDePrestigio;
	}

	public void addPontosDePrestigio(int valor) {
		if(valor > 0) {
			this.pontosDePrestigio += valor;
			atualizarPatente();
			atualizarLimiteDeCredito();
			atualizarLimiteDeItensPorCategoria();
		}
		// exceção de pontos de prestígio negativos
	}

	public void subtractPontosDePrestigio(int valor) {
		if(valor > 0) {
			this.pontosDePrestigio = (this.pontosDePrestigio > valor) ? (this.pontosDePrestigio - valor) : (0);
			atualizarPatente();
			atualizarLimiteDeCredito();
			atualizarLimiteDeItensPorCategoria();
		}
		// exceção de pontos de prestígio negativos
	}

	public String getPatente(){
		return this.patente;
	}

	private void atualizarPatente() {
		if (this.pontosDePrestigio < 20) {
			this.patente = "Recruta";
		} else if(this.pontosDePrestigio < 50) {
			this.patente = "Operador";
		} else if(this.pontosDePrestigio < 100) {
			this.patente = "Agente Especial";
		} else if(this.pontosDePrestigio < 200) {
			this.patente = "Oficial de Operações";
		} else {
			this.patente = "Agente de Elite";
		}
	}
	
	public String getLimiteDeCredito() {
		return this.limiteDeCredito;
	}

	private void atualizarLimiteDeCredito() {
		if (this.pontosDePrestigio < 20) {
			this.limiteDeCredito = "Baixo";
		} else if(this.pontosDePrestigio < 100) {
			this.limiteDeCredito = "Médio";
		} else if(this.pontosDePrestigio < 200) {
			this.limiteDeCredito = "Alto";
		} else {
			this.limiteDeCredito = "Ilimitado";
		}
	}

	public int[] getLimiteDeItensPorCategoria() {
		return this.limiteDeItensPorCategoria;
	}

	private void atualizarLimiteDeItensPorCategoria() {
		if (this.pontosDePrestigio < 20) {
			this.limiteDeItensPorCategoria[0] = 2;
			this.limiteDeItensPorCategoria[1] = 0;
			this.limiteDeItensPorCategoria[2] = 0;
			this.limiteDeItensPorCategoria[3] = 0;
		} else if(this.pontosDePrestigio < 50) {
			this.limiteDeItensPorCategoria[0] = 3;
			this.limiteDeItensPorCategoria[1] = 1;
			this.limiteDeItensPorCategoria[2] = 0;
			this.limiteDeItensPorCategoria[3] = 0;
		} else if(this.pontosDePrestigio < 100) {
			this.limiteDeItensPorCategoria[0] = 3;
			this.limiteDeItensPorCategoria[1] = 2;
			this.limiteDeItensPorCategoria[2] = 1;
			this.limiteDeItensPorCategoria[3] = 0;
		} else if(this.pontosDePrestigio < 200) {
			this.limiteDeItensPorCategoria[0] = 3;
			this.limiteDeItensPorCategoria[1] = 3;
			this.limiteDeItensPorCategoria[2] = 2;
			this.limiteDeItensPorCategoria[3] = 1;
		} else {
			this.limiteDeItensPorCategoria[0] = 3;
			this.limiteDeItensPorCategoria[1] = 3;
			this.limiteDeItensPorCategoria[2] = 3;
			this.limiteDeItensPorCategoria[3] = 2;
		}
		if(Arrays.equals(itensPorCategoria, limiteDeItensPorCategoria) == false) {
			// exceção excesso de itens em uma ou mais categorias
		}
	}

	public int getLimiteDeItensCategoria1() {
		return this.limiteDeItensPorCategoria[0];
	}

	public int getLimiteDeItensCategoria2() {
		return this.limiteDeItensPorCategoria[1];
	}

	public int getLimiteDeItensCategoria3() {
		return this.limiteDeItensPorCategoria[2];
	}

	public int getLimiteDeItensCategoria4() {
		return this.limiteDeItensPorCategoria[3];
	}

	public int[] getItensPorCategoria() {
		return this.itensPorCategoria;
	}

	public int getItensCategoria1() {
		return this.itensPorCategoria[0];
	}

	public int getItensCategoria2() {
		return this.itensPorCategoria[1];
	}

	public int getItensCategoria3() {
		return this.itensPorCategoria[2];
	}

	public int getItensCategoria4() {
		return this.itensPorCategoria[3];
	}

	public int getCapacidadeDeCarga() {
		return this.capacidadeDeCarga;
	}

	public int getLimiteDeCarga() {
		return this.limiteDeCarga;
	}

	public boolean getSobrecarga() {
		return this.sobrecarga;
	}

	private void atualizarSobrecarga() {
		if(cargaAtual > capacidadeDeCarga) {
			this.sobrecarga = true;
		} else {
			this.sobrecarga = false;
		}
	}

	public int getCargaAtual() {
		return this.cargaAtual;
	}

	public void addCarga(int novosEspacosOcupados) {
		if(novosEspacosOcupados > 0) {
			if(testeCabeNovaCarga(novosEspacosOcupados) == true) {
				this.cargaAtual += novosEspacosOcupados;
				atualizarSobrecarga();
			}
			// exceção excesso de carga
		}
		// exceção espaços ocupados negativos
	}

	public void removeCarga(int novosEspacosOcupados) {
		if(novosEspacosOcupados > 0) {
			if(this.cargaAtual >= novosEspacosOcupados) {
				this.cargaAtual -= novosEspacosOcupados;
				atualizarSobrecarga();
			}
			// exceção falta de carga
		}
		// exceção espaços ocupados negativos
	}

	/**
	 * Essa função serve para testar a possibilidade de aumentar a carga que o personagem está carregando.
	 * O resultado será 'true' caso seja possível e 'false' caso contrário.
	 * 
	 * @laura-campelo
	 */ 
	private boolean testeCabeNovaCarga(int novosEspacosOcupados) {
		if(this.cargaAtual + novosEspacosOcupados <= limiteDeCarga) {
			return true;
		} else {
			return false;
		}
	}

	public Map<String, Arma> getArmasPersonagem() {
		return this.armasPersonagem;
	}

	public void addArma (Arma arma) {
		// testa se o personagem tem autorização de pegar mais uma arma naquela categoria
		if(this.itensPorCategoria[arma.getCategoria() - 1] < this.limiteDeItensPorCategoria[arma.getCategoria() - 1]) {
			// testa se o personagem tem espaço na 'mochila' para carregar mais essa arma
			if(testeCabeNovaCarga(arma.getEspacosQueOcupa()) == true) { 
				this.armasPersonagem.put(arma.getNome(), arma);
				addCarga(arma.getEspacosQueOcupa());
				this.itensPorCategoria[arma.getCategoria() - 1]++;
			}
			// exceção excesso de carga
		}
		// exceção máximo de itens dessa categoria já atingido
	}

	public void removeArma (Arma arma) {
		// verifica se a arma está no inventário do personagem antes de tentar removê-la
		if(this.armasPersonagem.containsValue(arma)) {
			this.armasPersonagem.remove(arma.getNome());
			removeCarga(arma.getEspacosQueOcupa());
			this.itensPorCategoria[arma.getCategoria() - 1]--;
		}
		// exceção arma não existe no inventário do personagem
	}

	public Map<String, Arma> getRepoArmas() {
		return this.repoArmas;
	}

	public Map<String, Protecao> getProtecoesPergonagens() {
		return this.protecoesPersonagem;
	}

	public void addProtecao (Protecao protecao) {
		// testa se o personagem tem autorização de pegar mais uma proteção naquela categoria
		if(this.itensPorCategoria[protecao.getCategoria() - 1] < this.limiteDeItensPorCategoria[protecao.getCategoria() - 1]) {
			// testa se o personagem tem espaço na 'mochila' para carregar mais essa proteção
			if(testeCabeNovaCarga(protecao.getEspacosQueOcupa()) == true) { 
				this.protecoesPersonagem.put(protecao.getNome(), protecao);
				addCarga(protecao.getEspacosQueOcupa());
				this.itensPorCategoria[protecao.getCategoria() - 1]++;
			}
			// exceção excesso de carga
		}
		// exceção máximo de itens dessa categoria já atingido
	}

	public void removeProtecao (Protecao protecao) {
		// verifica se a proteção está no inventário do personagem antes de tentar removê-la
		if(this.protecoesPersonagem.containsValue(protecao)) {
			this.protecoesPersonagem.remove(protecao.getNome());
			removeCarga(protecao.getEspacosQueOcupa());
			this.itensPorCategoria[protecao.getCategoria() - 1]--;
		}
		// exceção proteção não existe no inventário do personagem
	}

	public Map<String, Protecao> getRepoProtecoes() {
		return this.repoProtecoes;
	}

}


