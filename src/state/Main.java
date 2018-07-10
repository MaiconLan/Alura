package state;

public class Main {

    public static void main (String args[]) {
        Orcamento reforma = new Orcamento(500D);

        reforma.aplicarDescontoExtra();

        System.out.println(reforma.getTotal());

        reforma.aprovar();

        reforma.aplicarDescontoExtra();

        System.out.println(reforma.getTotal());

        reforma.aplicarDescontoExtra();

        System.out.println(reforma.getTotal());

        reforma.aplicarDescontoExtra();

        System.out.println(reforma.getTotal());
    }

}
