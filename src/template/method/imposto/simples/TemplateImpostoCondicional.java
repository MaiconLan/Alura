package template.method.imposto.simples;

public abstract class TemplateImpostoCondicional extends Imposto {

    public TemplateImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateImpostoCondicional() {
    }

    @Override
    public Double calcularImposto(Orcamento orcamento) {
        if(possuiCondicaoMinima(orcamento))
            return calculaCondicaoMinima(orcamento);
         else
            return calculaCondicaoMaxima(orcamento);
    }

    protected abstract Boolean possuiCondicaoMinima(Orcamento orcamento);
    protected abstract Double calculaCondicaoMinima(Orcamento orcamento);
    protected abstract Double calculaCondicaoMaxima(Orcamento orcamento);

}
