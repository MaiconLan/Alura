package chain.of.responsibility;

public class RespostaEmPorcento implements Resposta {

	private Resposta proxima;

	public RespostaEmPorcento(Resposta proxima) {
		this.proxima = proxima;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.PORCENTO)) {
			System.out.println("%" + conta.getTitular() + "%" + conta.getSaldo() + "%");
		} else if(proxima != null) {
			proxima.responde(req, conta);
		}

	}

}
