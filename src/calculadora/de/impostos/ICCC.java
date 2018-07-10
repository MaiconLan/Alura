package calculadora.de.impostos;

public class ICCC implements Imposto {

	@Override
	public Double calcularImposto(Orcamento orcamento) {
		Double valor = orcamento.getValor();

		if (valor < 1000D) {
			return valor * 0.05;
		} else if (valor > 3000D) {
			return (valor * 0.08) + 30D;
		}

		return valor * 0.07;
	}

}
