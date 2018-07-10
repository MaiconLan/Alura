package chain.of.responsibility;

public class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

}

enum Formato {
	XML, CSV, PORCENTO
}