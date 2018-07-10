package state;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	protected Double total = 0D;

	private List<Item> items = new ArrayList<>();

	protected EstadoOrcamento estado;

	public void addItem(Item item) {
		items.add(item);
		total += item.getValor();
	}

	public Orcamento(Double total) {
		this.total = total;
		items = new ArrayList<>();
		estado = new EmAprovacao();
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void aplicarDescontoExtra(){
		estado.aplicarDescontoExtra(this);
	}

	public void aprovar(){
		estado.aprovar(this);
	}

	public void reprovar(){
		estado.reprovar(this);
	}

	public void finalizar(){
		estado.finalizar(this);
	}
}
