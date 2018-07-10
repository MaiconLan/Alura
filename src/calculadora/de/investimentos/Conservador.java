package calculadora.de.investimentos;

public class Conservador implements Investimento {

	private final Double PORCENTAGEM_LUCRO = 0.75;
	private final Double PORCENTAGEM_RETORNO = 0.008;
	
	@Override
	public Double calcularRetorno(Conta conta) {
		return (conta.getSaldo() * PORCENTAGEM_RETORNO) * PORCENTAGEM_LUCRO;
	}

}
