package template.method.banco;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RelatorioSimples extends Relatorio {


    @Override
    protected void cabecalho() {
        System.out.println("Banco Bamerindus");
    }

    @Override
    protected void corpo(List<Conta> contas) {
        for (Conta conta: contas) {
            System.out.println("--------------------------");
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }

    @Override
    protected void rodape() {
        System.out.println("(48) 4422-3113");
    }
}
