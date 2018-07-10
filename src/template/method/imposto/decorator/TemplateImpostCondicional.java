package template.method.imposto.decorator;


public abstract class TemplateImpostCondicional extends Imposto {

    public TemplateImpostCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateImpostCondicional (){

    }

    @Override
    public Double calcularImposto(Orcamento orcamento) {
        if(possuiCondicaoMinima(orcamento))
            return calculaCondicaoMinima(orcamento) + calcularOutroImposto(orcamento);
         else
            return calculaCondicaoMaxima(orcamento) + calcularOutroImposto(orcamento);
    }

    protected abstract Boolean possuiCondicaoMinima(Orcamento orcamento);
    protected abstract Double calculaCondicaoMinima(Orcamento orcamento);
    protected abstract Double calculaCondicaoMaxima(Orcamento orcamento);

}
