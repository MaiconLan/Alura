package template.method.imposto.simples;

public abstract class Imposto {

	protected Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
	}

	public abstract Double calcularImposto(Orcamento orcamento);

	protected Double calcularOutroImposto(Orcamento orcamento) {
		if(outroImposto == null)
			return 0D;
		return outroImposto.calcularImposto(orcamento);
	}
}
