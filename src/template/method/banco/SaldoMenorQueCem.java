package template.method.banco;

import java.util.ArrayList;
import java.util.List;

public class SaldoMenorQueCem extends Filtro {

    private Filtro outroFiltro;

    public SaldoMenorQueCem(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public SaldoMenorQueCem() {
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        List<Conta> contasSuspeitas = new ArrayList<>();
        for (Conta conta: contas) {
            if (conta.getSaldo() < 100)
                contasSuspeitas.add(conta);
        }
        contasSuspeitas.addAll(proximo(contas));
        return contasSuspeitas;
    }

}
