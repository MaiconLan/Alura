package calculadora.de.investimentos;

public class Main {

	public static void main(String[] args) {
		Conservador conservador = new Conservador();
		Moderado moderado = new Moderado();
		Arrojado arrojado = new Arrojado();
		
		Conta conta = new Conta(20.0);
		
		RealizadorDeInvestimentos.realizarInvestimento(conservador, conta);
		RealizadorDeInvestimentos.realizarInvestimento(moderado, conta);
		RealizadorDeInvestimentos.realizarInvestimento(arrojado, conta);
	}
	
}
