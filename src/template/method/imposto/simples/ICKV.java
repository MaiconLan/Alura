package template.method.imposto.simples;

public class ICKV extends TemplateImpostoCondicional {

    private Imposto outroImposto;

    public ICKV(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICKV() {}

    @Override
    protected Boolean possuiCondicaoMinima(Orcamento orcamento) {
        return orcamento.getTotal() > 500D && itemValorSuperiorACem(orcamento);
    }

    @Override
    protected Double calculaCondicaoMinima(Orcamento orcamento) {
            return orcamento.getTotal() * 0.06 + calcularOutroImposto(orcamento);
    }

    @Override
    protected Double calculaCondicaoMaxima(Orcamento orcamento) {
        return orcamento.getTotal() * 0.10 + calcularOutroImposto(orcamento);
    }

    private boolean itemValorSuperiorACem(Orcamento orcamento) {
        for (Item item : orcamento.getItems()) {
            if (item.getValor() > 100) return true;
        }
        return false;
    }
}
