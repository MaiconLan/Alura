package calculadora.de.descontos;

public class Main {

	public static void main(String[] args) {
		Orcamento orcamentoCincoItens = new Orcamento();
		Orcamento orcamentoQuinhentosReais = new Orcamento();
		Orcamento orcamentoItemCasado = new Orcamento();
		CalculadorDeDescontos calculadora = new CalculadorDeDescontos();

		for (int i = 0; i < 6; i++) {
			orcamentoCincoItens.addItem(new Item("Item " + i, 20D));
		}

		for (int i = 0; i < 3; i++) {
			orcamentoQuinhentosReais.addItem(new Item("Item " + i, 200D));
		}

		System.out.println("Desconto de : " + calculadora.calculaDesconto(orcamentoCincoItens));
		System.out.println("Total de : " + calculadora.calculaTotal(orcamentoCincoItens));

		System.out.println("Desconto de : " + calculadora.calculaDesconto(orcamentoQuinhentosReais));
		System.out.println("Total de : " + calculadora.calculaTotal(orcamentoQuinhentosReais));

		orcamentoItemCasado.addItem(new Item("CADERNO", 25D));
		System.out.println("Desconto de : " + calculadora.calculaDesconto(orcamentoItemCasado));
		System.out.println("Total de : " + calculadora.calculaTotal(orcamentoItemCasado));

		orcamentoItemCasado.addItem(new Item("LAPIS", 5D));
		System.out.println("Desconto de : " + calculadora.calculaDesconto(orcamentoItemCasado));
		System.out.println("Total de : " + calculadora.calculaTotal(orcamentoItemCasado));

	}
}
