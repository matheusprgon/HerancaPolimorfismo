package Ex03;

public class CamaroteInferior extends Vip{
    private String cadeira;

    public CamaroteInferior(double valor, String cadeira) {
        super(valor);
        this.cadeira = cadeira;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }
}
