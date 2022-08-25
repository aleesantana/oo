package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void addItem(String nome, int quantidade, double preco) {
		this.itens.add(new Item(nome, quantidade, preco));
	}
	
	void addItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double getValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
}
