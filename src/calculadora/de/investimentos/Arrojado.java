package calculadora.de.investimentos;

import java.util.Random;

public class Arrojado implements Investimento {

	private final Double PORCENTAGEM_LUCRO = 0.75;

	@Override
	public Double calcularRetorno(Conta conta) {
		Double probabilidade = new Random().nextDouble();
		if (probabilidade < 0.2) {
			return (conta.getSaldo() * 0.05) * PORCENTAGEM_LUCRO;
		} else if(probabilidade < 0.5) {
			return (conta.getSaldo() * 0.03) * PORCENTAGEM_LUCRO;
		}
		return (conta.getSaldo() * 0.006) * PORCENTAGEM_LUCRO;
	}

}
