package models.trilhas.especialista;

import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public class MedicoDeCampo extends TrilhaAbstrata{
    
    public MedicoDeCampo() {
        this.nome = "Médico de Campo";
		this.descricao = "Você é treinado em técnicas de primeiros socorros e tratamento de emergência, o que torna você um membro valioso para qualquer grupo de agentes. Ao contrário dos profissionais de saúde convencionais, você está acostumado com o campo de batalha e sabe tomar decisões rápidas no meio do caos.";
		this.poderNex10 = new Poder("Paramédico (NEX 10%)", "Você pode usar uma ação padrão e 2 PE para curar 2d10 pontos de vida de um aliado adjacente. Você pode curar +1d10 PV respectivamente em NEX 40%, 65% e 99%, gastando +1 PE por dado adicional de cura.");
		this.poderNex40 = new Poder("Equipe de Trauma (NEX 40%)", "Você pode usar uma ação padrão e 2 PE para remover uma condição negativa (exceto morrendo) de um aliado adjacente.");
		this.poderNex65 = new Poder("Resgate (NEX 65%)", "Uma vez por rodada, se estiver em alcance curto de um aliado machucado ou morrendo, você pode se aproximar do aliado com uma ação livre (desde que seja capaz de fazê-lo usando seu deslocamento normal). Além disso, sempre que curar PV ou remover condições do aliado, você e o aliado recebem +5 na Defesa até o início de seu próximo turno. Por fim, para você, o total de espaços ocupados por carregar um personagem é reduzido pela metade.");
		this.poderNex99 = new Poder("Reanimação (NEX 99%)", "Uma vez por cena, você pode gastar uma ação completa e 10 PE para trazer de volta a vida um personagem que tenha morrido na mesma cena (exceto morte por dano massivo).");
    }

}
