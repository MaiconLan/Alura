package chain.of.responsibility;

public class RespostaVazia implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {
		System.out.println("Erro");

	}

}
