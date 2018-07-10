package calculadora.de.descontos;

public class DescontoMaisQuinhentosReais implements Desconto {

	private Desconto proximo;

	@Override
	public Double descontar(Orcamento orcamento) {
		return orcamento.getTotal() > 500D ? orcamento.getTotal() * 0.07 : proximo.descontar(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
