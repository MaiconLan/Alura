package template.method.imposto.decorator;

public class ImpostoMuitoAlto extends TemplateImpostCondicional {

    public ImpostoMuitoAlto(Imposto outroImposto){
        super(outroImposto);
    }

    public ImpostoMuitoAlto(){}


    @Override
    protected Boolean possuiCondicaoMinima(Orcamento orcamento) {
        return orcamento.getValor() >= 100D;
    }

    @Override
    protected Double calculaCondicaoMinima(Orcamento orcamento) {
        return  orcamento.getValor() * 0.20 + calcularOutroImposto(orcamento);
    }

    @Override
    protected Double calculaCondicaoMaxima(Orcamento orcamento) {
        return  orcamento.getValor() * 0.02 + calcularOutroImposto(orcamento);
    }
}
