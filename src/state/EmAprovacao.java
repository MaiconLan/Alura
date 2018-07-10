package state;

public class EmAprovacao implements EstadoOrcamento {

    private boolean descontoAplicado = false;

    public void aplicarDescontoExtra(Orcamento orcamento){
        if(descontoAplicado)
            throw new RuntimeException("O desconto já foi aplicado");
        orcamento.total -= orcamento.total * 0.05;
        descontoAplicado = true;

    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.estado = new Aprovado();
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.estado = new Reprovado();
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento Em Aprovação não recebem desconto extra!");
    }


}
