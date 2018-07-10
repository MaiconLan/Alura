package template.method.imposto.simples;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private Double total = 0D;

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
		total += item.getValor();
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

}
