package state.banco;

public class Negativo implements Estado {


    @Override
    public void sacar(Conta conta, Double valor) {
        throw new RuntimeException("Não é possível efetuar um saque em uma conta com saldo negativo");
    }

    @Override
    public void depositar(Conta conta, Double valor) {
        conta.saldo += valor * 0.95;
    }
}
