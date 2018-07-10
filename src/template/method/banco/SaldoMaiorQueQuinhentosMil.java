package template.method.banco;

import java.util.ArrayList;
import java.util.List;

public class SaldoMaiorQueQuinhentosMil extends Filtro {

    private Filtro outroFiltro;

    public SaldoMaiorQueQuinhentosMil(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public SaldoMaiorQueQuinhentosMil() {
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        List<Conta> contasSuspeitas = new ArrayList<>();
        for (Conta conta: contas) {
            if (conta.getSaldo() > 500000)
                contasSuspeitas.add(conta);
        }
        contasSuspeitas.addAll(proximo(contas));
        return contasSuspeitas;
    }

}
