package state;

public interface EstadoOrcamento {

    void aplicarDescontoExtra(Orcamento orcamento);

    void aprovar(Orcamento orcamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);
}
