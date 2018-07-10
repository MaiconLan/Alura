package chain.of.responsibility;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta("Maicon", 2000D);
		RealizaRequisicao realizaRequisicao = new RealizaRequisicao();

		Requisicao requisicao = new Requisicao(Formato.XML);
		realizaRequisicao.retornaFormato(conta, requisicao);

		requisicao.setFormato(Formato.CSV);
		realizaRequisicao.retornaFormato(conta, requisicao);

		requisicao.setFormato(Formato.PORCENTO);
		realizaRequisicao.retornaFormato(conta, requisicao);

	}

}
