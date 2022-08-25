package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) { //l�-se -> se n�o estiver ligado -> ! = invers�o do boolean
			return 0;
		}else {
			//math.round arredonda o resultado
		return (int)Math.round(fatorInjecao * 3000);// cast -> multiplicacao por inteiro � preciso retornar int.
		}
	}
}
