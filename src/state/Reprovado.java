package state;

public class Reprovado implements EstadoOrcamento {

    public void aplicarDescontoExtra(Orcamento orcamento){
        throw new RuntimeException("Somente orçamento em aprovação ou aprovados podem receber desconto extra!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento reprovados não podem ser aprovados!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já está reprovado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.estado = new Finalizado();
    }
}