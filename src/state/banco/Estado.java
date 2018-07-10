package state.banco;

public interface Estado {

    void sacar(Conta conta, Double valor);

    void depositar(Conta conta, Double valor);

}
