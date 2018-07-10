package calculadora.de.investimentos;

public class RealizadorDeInvestimentos {

	public static void realizarInvestimento(Investimento investimento, Conta conta) {
		System.out.println(investimento.getClass().getSimpleName() + ": "  + investimento.calcularRetorno(conta));
	}

}
