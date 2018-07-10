package calculadora.de.impostos;

public class ICMS implements Imposto {
	@Override
	public Double calcularImposto(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50.0;
	}
}
