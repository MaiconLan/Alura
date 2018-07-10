package chain.of.responsibility;

public class RealizaRequisicao {

	Resposta porcento = new RespostaEmPorcento(null);
	Resposta csv = new RespostaEmCsv(null);
	Resposta xml = new RespostaEmXml(csv);
	
	public void retornaFormato(Conta conta, Requisicao req) {
		xml.responde(req, conta);
	}
	
}
