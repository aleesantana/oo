package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
	
	
	Compra compra1 = new Compra();
	compra1.adicionarItem("Feijão", 9.85, 2);
	compra1.adicionarItem("Macarrão", 6.25, 1);
	
	Compra compra2 = new Compra();
	compra2.adicionarItem("Notebook", 3840.99, 1);
	compra2.adicionarItem("Smartphone", 2100.90, 2);
	compra2.adicionarItem("Energético", 7.00, 5);
	
	Cliente cliente = new Cliente("Maria Luisa de Morais");
	cliente.adicionarCompra(compra1);
	cliente.adicionarCompra(compra2);
	
	
	
	System.out.println("O valor total das compras foi: " + cliente.obterValorTotal());
	
	}
}
