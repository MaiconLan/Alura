package template.method.imposto.decorator;

public class TesteImpostosComplexos {

    public static void main (String args[]) {

        Imposto iss = new ImpostoMuitoAlto(new ICMS(new ISS()));
        Orcamento orcamento = new Orcamento(500D);

        double valor = iss.calcularImposto(orcamento);

        System.out.println(valor);
    }

}
