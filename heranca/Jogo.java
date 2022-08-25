package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Life Monstro: " + monstro.vida);
		System.out.println("Life Heroi: " + heroi.vida);
		System.out.println("\n ");
		
		monstro.atacar(heroi);
		
		System.out.println("************ JOGADA 1 ************");
		System.out.println("Life Monstro: " + monstro.vida);
		System.out.println("Life Heroi: " + heroi.vida);
		System.out.println("\n ");
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);		
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);	
		
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		heroi.atacar(monstro);		
		
		System.out.println("************ JOGADA 2 ************");
		System.out.println("Life Monstro: " + monstro.vida);
		System.out.println("Life Heroi: " + heroi.vida);
		System.out.println("\n ");
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.SUL);
//		System.out.println(j1.x);
//		System.out.println(j1.y);
		
	}

}
