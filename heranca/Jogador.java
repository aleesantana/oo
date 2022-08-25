package oo.heranca;

public class Jogador {
	int vida = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente){
		
		int deltaX = Math.abs(x - oponente.x); //math.abs utiliza o valor absoluto, sendo que o resultado negativo se tornar� positivo
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) { //significa que os dois jogadores estar�o no mesmo eixo, podendo atacar um ao outro
			oponente.vida -= 10; //subtrai 10 da vida do oponente
			return true;
		} else if (deltaX == 1 && deltaY == 0) { //um ao lado do outro
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) {
		switch(direcao){
		case NORTE: y--;
			break;
		case LESTE: x++;
			break;
		case SUL: y++;
			break;
		case OESTE: x--;
			break;
		}
		
		return true;
	}
}
