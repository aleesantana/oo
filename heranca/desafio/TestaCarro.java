package oo.heranca.desafio;

public class TestaCarro {
	public static void main(String[] args) {
		
		Carro c1 = new Fiesta();
		Ferrarri c2 = new Ferrarri();
		
		//Fiesta
		c1.acelerar();
		System.out.println(c1);	
		c1.acelerar();
		System.out.println(c1);	
		c1.acelerar();
		System.out.println(c1);
		
		//Ferrarri
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		c2.frar();
		System.out.println(c2);
	}
}
