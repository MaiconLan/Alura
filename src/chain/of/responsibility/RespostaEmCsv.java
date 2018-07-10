package chain.of.responsibility;

public class RespostaEmCsv implements Resposta {

	private Resposta proxima;

	public RespostaEmCsv(Resposta proxima) {
		this.proxima = proxima;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.CSV)) {
			System.out.println(conta.getTitular() + ", " + conta.getSaldo());
		} else if(proxima != null) {
			proxima.responde(req, conta);
		}

	}

}
