package state;

public class Finalizado implements EstadoOrcamento {

    public void aplicarDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizado não recebem desconto extra!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está finalizado!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está finalizado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está finalizado!");
    }

}
