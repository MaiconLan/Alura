package calculadora.de.descontos;

public class SemDesconto implements Desconto {

	@Override
	public Double descontar(Orcamento orcamento) {
		return 0D;
	}

	@Override
	public void setProximo(Desconto proximo) {
	}

}
