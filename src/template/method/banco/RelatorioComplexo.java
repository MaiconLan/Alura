package template.method.banco;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

    @Override
    protected void cabecalho() {
        System.out.println("Banco Bamerindus");
        System.out.println("Rua Alberto Fernando Chauzz");
        System.out.println("(48) 4422-3113");

    }

    @Override
    protected void corpo(List<Conta> contas) {
        for (Conta conta: contas) {
            System.out.println("--------------------------");
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Conta: " + conta.getConta());
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }

    @Override
    protected void rodape() {
        System.out.println("bamerindus@cobranca.com.br");
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
    }
}
