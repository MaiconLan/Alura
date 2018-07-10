package template.method.banco;

import java.util.Calendar;
import java.util.Date;

public class Conta {

    private String titular;

    private Integer conta;

    private Double saldo;

    private String agencia;

    private Calendar abertura;

    public Conta(String titular, Integer conta, Double saldo, String agencia, Calendar abertura) {
        this.titular = titular;
        this.conta = conta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.abertura = abertura;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Calendar getAbertura() {
        return abertura;
    }

    public void setAbertura(Calendar abertura) {
        this.abertura = abertura;
    }
}
