package template.method.imposto.decorator;

public class CalculadorDeImpostos {
	public void calcularImposto(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcularImposto(orcamento));
	}
}
