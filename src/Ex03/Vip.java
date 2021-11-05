package Ex03;

public class Vip extends Ingresso{
    private double valorAdicional = 10.0;

    public Vip(double valor) {
        super(valor);
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double imprimeValor(){
        return getValor() + getValorAdicional();
    }
}
