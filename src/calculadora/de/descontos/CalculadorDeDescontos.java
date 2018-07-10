package calculadora.de.descontos;

public class CalculadorDeDescontos {

	Desconto d1 = new DescontoMaisCincoItens();
	Desconto d2 = new DescontoMaisQuinhentosReais();
	Desconto d3 = new DescontoPorVendaCasada();
	Desconto sem = new SemDesconto();

	public Double calculaTotal(Orcamento orcamento) {
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(sem);

		return orcamento.getTotal() - d1.descontar(orcamento);
	}

	public Double calculaDesconto(Orcamento orcamento) {
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(sem);

		return d1.descontar(orcamento);
	}

}
