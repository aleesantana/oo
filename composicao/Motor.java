package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) { //lê-se -> se não estiver ligado -> ! = inversão do boolean
			return 0;
		}else {
			//math.round arredonda o resultado
		return (int)Math.round(fatorInjecao * 3000);// cast -> multiplicacao por inteiro é preciso retornar int.
		}
	}
}
