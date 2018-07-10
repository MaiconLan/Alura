package chain.of.responsibility;

public class RespostaEmXml implements Resposta {

	private Resposta proxima;
	
	public RespostaEmXml(Resposta proxima) {
		this.proxima = proxima;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.XML)) {
			System.out.println("<conta>\n\t<titular>" + conta.getTitular() + "</titular>\n\t<saldo>" + conta.getSaldo()
					+ "</saldo>\n</conta>");
		} else if(proxima != null) {
			proxima.responde(req, conta);
		}

	}

}
