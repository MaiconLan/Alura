package template.method.banco;

import java.util.*;

public class Main {

    public static void main(String args[]){
        List<Conta> contas = new ArrayList<>();
        Relatorio simples = new RelatorioSimples();
        Relatorio complexo = new RelatorioComplexo();

        for (int i = 0; i < 5; i++) {
            Conta conta = new Conta("Titular ", i * i, 100D * i, String.valueOf(new Random(10).nextInt()), Calendar.getInstance());
            contas.add(conta);
        }

        simples.imprimir(contas);

        complexo.imprimir(contas);

    }

}
