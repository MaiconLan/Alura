package calculadora.de.impostos;

public class ISS implements Imposto {
	@Override
	public Double calcularImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
