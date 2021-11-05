package Ex03;

public class CamaroteSuperior extends Vip{
    private double valorAdicionalCS;

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicionalCS = valorAdicional;
    }

    public double getValorAdicionalCS() {
        return valorAdicionalCS;
    }

    public void setValorAdicionalCS(double valorAdicionalCS) {
        this.valorAdicionalCS = valorAdicionalCS;
    }
    @Override
    public double imprimeValor(){
        return getValor() + getValorAdicionalCS() + getValorAdicional();
    }
}
