package template.method.imposto.decorator;

public class ISS extends Imposto {

	public ISS (Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS(){}


	@Override
	public Double calcularImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calcularOutroImposto(orcamento);
	}
}
