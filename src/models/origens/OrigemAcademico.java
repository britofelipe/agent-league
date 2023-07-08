package models.origens;

import models.pericias.Pericia;
import models.personagem.Atributos;
import models.poderes.Poder;

public class OrigemAcademico extends OrigemAbstrata {
    
    public OrigemAcademico(Atributos atributos) {
        this.nome = "Acadêmico";
        this.periciaTreinada1 = new Pericia("Ciência", "Treinado", 5, atributos.getIntelecto(), true, false, false);
        this.periciaTreinada2 = new Pericia("Investigação", "Treinado", 5, atributos.getIntelecto(), false, false, false);
        this.poder = new Poder("Saber é poder", "Quando faz um teste usando Intelecto, você pode gastar 2 PE para receber +5 nesse teste.");
        this.descricao = "Você era um pesquisador ou professor universitário. De forma proposital ou não, seus estudos tocaram em assuntos misteriosos e chamaram a atenção da Ordo Realitas.";
    }

}
