package calculadora.de.descontos;

public interface Desconto {

	Double descontar(Orcamento orcamento);

	void setProximo(Desconto proximo);

}
