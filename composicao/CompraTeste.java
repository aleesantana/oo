package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		
		compra1.addItem(new Item("Caneta", 20, 7.45)); //add item pelo metodo
		compra1.addItem(new Item("Borracha", 12, 3.89));
		compra1.addItem(new Item("Caderno", 3, 18.79));
		
		System.out.println("Quantidade de itens diferentes: " + compra1.itens.size());
		System.out.println("Valor total da compra: R$" + compra1.getValorTotal());
		
		//mostrando o valor bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
		System.out.println("O total é: " + total);
	}

	
}
