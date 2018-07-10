package state;

public class Aprovado implements EstadoOrcamento{

    private boolean descontoAplicado;

    public void aplicarDescontoExtra(Orcamento orcamento){
        if(descontoAplicado)
            throw new RuntimeException("O desconto já foi aplicado");
        orcamento.total -= orcamento.total * 0.02;
        descontoAplicado = true;
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está aprovado!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento aprovados não podem ser reprovados!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.estado = new Finalizado();
    }
}
