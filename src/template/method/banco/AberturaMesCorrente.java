package template.method.banco;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AberturaMesCorrente extends Filtro {

    private Filtro outroFiltro;

    public AberturaMesCorrente(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public AberturaMesCorrente() {
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        List<Conta> contasSuspeitas = new ArrayList<>();
        for (Conta conta: contas) {
            if (conta.getAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) && conta.getAbertura().get(Calendar.YEAR) ==  Calendar.getInstance().get(Calendar.YEAR))
                contasSuspeitas.add(conta);
        }
        contasSuspeitas.addAll(proximo(contas));
        return contasSuspeitas;
    }

}
