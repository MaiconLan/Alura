package calculadora.de.impostos;

public class Main {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		
		Orcamento orcamento = new Orcamento(4000D);
		CalculadorDeImpostos calculadoraDeImpostos = new CalculadorDeImpostos();

		System.out.print("ICMS: ");
		System.out.println(icms.calcularImposto(orcamento));
		
		System.out.print("ICMS: ");
		calculadoraDeImpostos.calcularImposto(orcamento, icms);

		System.out.print("ISS: ");
		calculadoraDeImpostos.calcularImposto(orcamento, iss);

		System.out.print("ICCC: ");
		calculadoraDeImpostos.calcularImposto(orcamento, iccc);
	}
}
