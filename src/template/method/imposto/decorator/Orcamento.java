package template.method.imposto.decorator;

public class Orcamento {
	private Double valor;
	
	public Orcamento(Double valor) {
		setValor(valor);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
