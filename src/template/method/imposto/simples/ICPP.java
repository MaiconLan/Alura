package template.method.imposto.simples;

public class ICPP extends TemplateImpostoCondicional {

    private Imposto outroImposto;

    public ICPP(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public ICPP() {
    }

    @Override
    protected Boolean possuiCondicaoMinima(Orcamento orcamento) {
        return orcamento.getTotal() > 500D;
    }

    @Override
    protected Double calculaCondicaoMinima(Orcamento orcamento) {
        return orcamento.getTotal() * 0.05 + calcularOutroImposto(orcamento);
    }

    @Override
    protected Double calculaCondicaoMaxima(Orcamento orcamento) {
        return orcamento.getTotal() * 0.07 + calcularOutroImposto(orcamento);
    }
}
