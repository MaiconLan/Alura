package template.method.imposto.simples;

public class Main {
    public static void main(String args[]) {

        Imposto primeiro = new ICPP();
        Imposto segundo = new ICKV(primeiro);
        Imposto terceiro = new IHIT(segundo);

        Orcamento orcamento = new Orcamento();

        for (int i = 0; i < 5; i++) {
            orcamento.addItem(new Item("Produto " + i, 99D));
        }

        System.out.println(primeiro.getClass().getSimpleName() + ": " + primeiro.calcularImposto(orcamento));
        System.out.println(segundo.getClass().getSimpleName() + ": " + segundo.calcularImposto(orcamento));
        System.out.println(terceiro.getClass().getSimpleName() + ": " + terceiro.calcularImposto(orcamento));

        orcamento.addItem(new Item("Produto 6", 99D));

        System.out.println(primeiro.getClass().getSimpleName() + ": " + primeiro.calcularImposto(orcamento));
        System.out.println(segundo.getClass().getSimpleName() + ": " + segundo.calcularImposto(orcamento));
        System.out.println(terceiro.getClass().getSimpleName() + ": " + terceiro.calcularImposto(orcamento));

        orcamento.addItem(new Item("Produto 7", 101D));

        System.out.println(primeiro.getClass().getSimpleName() + ": " + primeiro.calcularImposto(orcamento));
        System.out.println(segundo.getClass().getSimpleName() + ": " + segundo.calcularImposto(orcamento));
        System.out.println(terceiro.getClass().getSimpleName() + ": " + terceiro.calcularImposto(orcamento));

    }
}
