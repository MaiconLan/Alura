package state.banco;


public class Positivo  implements Estado {

    @Override
    public void sacar(Conta conta, Double valor) {
        conta.saldo -= valor;
    }

    @Override
    public void depositar(Conta conta, Double valor) {
        conta.saldo += valor * 0.98;
    }
}
