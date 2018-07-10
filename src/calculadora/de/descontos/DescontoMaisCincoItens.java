package calculadora.de.descontos;

public class DescontoMaisCincoItens implements Desconto {

	private Desconto proximo;

	@Override
	public Double descontar(Orcamento orcamento) {
		return orcamento.getItems().size() > 5 ? orcamento.getTotal() * 0.10 : proximo.descontar(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
