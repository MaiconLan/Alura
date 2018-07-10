package template.method.imposto.simples;

public class IHIT extends TemplateImpostoCondicional {

    private Imposto outroImposto;

    public IHIT(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public IHIT() {
    }

    @Override
    protected Boolean possuiCondicaoMinima(Orcamento orcamento) {
        for (Item item : orcamento.getItems()) {
           if(orcamento.getItems().contains(item)) {
               return Boolean.TRUE;
           }
        }
        return Boolean.FALSE;
    }

    @Override
    protected Double calculaCondicaoMinima(Orcamento orcamento) {
        return orcamento.getTotal() * 0.13 + 100.D;
    }

    @Override
    protected Double calculaCondicaoMaxima(Orcamento orcamento) {
        return (orcamento.getTotal() * 0.01) * orcamento.getItems().size();
    }
}
