package calculadora.de.investimentos;

import java.util.Random;

public class Moderado implements Investimento {

	private final Double PORCENTAGEM_LUCRO = 0.75;

	@Override
	public Double calcularRetorno(Conta conta) {
		Double probabilidade = new Random().nextDouble();
		if (probabilidade < 0.5) {
			return (conta.getSaldo() * 0.007) * PORCENTAGEM_LUCRO;
		}
		return (conta.getSaldo() * 0.25) * PORCENTAGEM_LUCRO;
	}

}
