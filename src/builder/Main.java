package builder;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String args[]){

      CriadoraNotaFiscal criador = new CriadoraNotaFiscal();
      criador.comCnpj("CNPJ");
      criador.comDataAtual();
      criador.paraEmpresa("Empresa");
      criador.comItem(new Item("Item 1", 200D));
      criador.comItem(new Item("Item 2", 300D));
      criador.comItem(new Item("Item 3", 400D));
      criador.comObservacao("obs");

    }

}
