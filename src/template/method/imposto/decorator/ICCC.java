package template.method.imposto.decorator;

public class ICCC extends Imposto {

	public ICCC(){}

	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public Double calcularImposto(Orcamento orcamento) {
		Double valor = orcamento.getValor();

		if (valor < 1000D) {
			return valor * 0.05  + calcularOutroImposto(orcamento);
		} else if (valor > 3000D) {
			return (valor * 0.08) + 30D  + calcularOutroImposto(orcamento);
		}

		return valor * 0.07  + calcularOutroImposto(orcamento);
	}

}
