package calculadora.de.descontos;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public Double descontar(Orcamento orcamento) {
		return existe("LAPIS", orcamento) || existe("CANETA", orcamento) ? 
				orcamento.getTotal() * 0.10 : 
				proximo.descontar(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	private boolean existe(String nomeItem, Orcamento orcamento) {
		for (Item item : orcamento.getItems()) {
			if (item.getNome().equals(nomeItem))
				return true;
		}
		return false;
	}

}
