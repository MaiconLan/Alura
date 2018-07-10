package state.banco;

public class Conta {

    protected Estado estado;

    protected Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
        estado = new Positivo();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor){
        estado.sacar(this, valor);
        verificarEstado();
    }

    public void depositar(Double valor){
        estado.depositar(this, valor);
        verificarEstado();
    }

    private void verificarEstado(){
        if(saldo > 0)
            estado = new Positivo();
         else
            estado = new Negativo();
    }

}
