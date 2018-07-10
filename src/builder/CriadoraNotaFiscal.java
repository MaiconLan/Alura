package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadoraNotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private List<Item> itens = new ArrayList<>();
    private double total;
    private double impostos;
    private String observacao;
    private Calendar emissao;

    public void paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void comCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void comItem(Item item) {
        itens.add(item);
        total += item.getValor();
        impostos += item.getValor() * 0.05;
    }

    public void comObservacao(String observacao){
        this.observacao = observacao;
    }

    public void comDataAtual(){
        this.emissao = Calendar.getInstance();
    }

    public NotaFiscal construir(){
        return new NotaFiscal(razaoSocial, cnpj, emissao, total, impostos, itens, observacao);
    }

}
