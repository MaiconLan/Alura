package template.method.imposto.decorator;

public class ICMS extends Imposto {

	public ICMS (Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS (){

	}

	@Override
	public Double calcularImposto(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50.0 + calcularOutroImposto(orcamento);
	}
}
