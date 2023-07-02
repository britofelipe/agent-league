package models.trilhas.especialista;

import models.poderes.Poder;
import models.trilhas.TrilhaAbstrata;

public class Negociador extends TrilhaAbstrata{
    
    public Negociador() {
        this.nome = "Negociador";
		this.descricao = "Você é um diplomata habilidoso e consegue influenciar outras pessoas, seja por lábia ou intimidação. Sua capacidade de avaliar situações com rapidez e eficiência pode tirar o grupo de apuros que nem a mais poderosa das armas poderia resolver.";
		this.poderNex10 = new Poder("Eloquência (NEX 10%)", "Você pode usar uma ação completa e 1 PE por alvo em alcance curto para afetar outros personagens com sua fala. Faça um teste de Diplomacia, Enganação ou Intimidação contra a Vontade dos alvos. Se você vencer, os alvos ficam fascinados enquanto você se concentrar (uma ação padrão por rodada). Um alvo hostil ou que esteja envolvido em combate recebe +5 em seu teste de resistência e tem direito a um novo teste por rodada, sempre que você se concentrar Um personagem que passar no teste fica imune a este efeito por um dia.");
		this.poderNex40 = new Poder("Discurso Motivador (NEX 40%)", "Você pode gastar uma ação padrão e 4 PE para inspirar seus aliados com suas palavras. Você e todos os seus aliados em alcance curto ganham +1d20 em testes de perícia até o fim da cena. A partir de NEX 65%, você pode gastar 8 PE para fornecer um bônus total de +2d20");
		this.poderNex65 = new Poder("Eu Conhecço um Cara (NEX 65%)", "Uma vez por missão, você pode ativar sua rede de contatos para pedir um favor, como por exemplo trocar todo o equipamento do seu grupo (como se tivesse uma segunda fase de preparação de missão), conseguir um local de descanso ou mesmo ser resgatado de uma cena. O mestre tem a palavra final de quando é possível usar essa habilidade e quais favores podem ser obtidos.");
		this.poderNex99 = new Poder("Truque de Mestre (NEX 99%)", "Acostumado a uma vida de fingimento e manipulação, você pode gastar 5 PE para simular o efeito de qualquer habilidade que você tenha visto um de seus aliados usar durante a cena. Você ignora os pré-requisitos da habilidade, mas ainda precisa pagar todos os seus custos, incluindo ações, PE e materiais, e ela usa os seus parâmetros de jogo, como se você estivesse usando a habilidade em questão.");
    }

}
