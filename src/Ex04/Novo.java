package Ex04;

public class Novo extends Imovel{
    private double valorAdicional;

    public Novo(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double calculaAdicional(){
        return (getPreco() * valorAdicional)/100;
    }
    public double imprimeValorTotal(){
        return getPreco()+calculaAdicional();
    }

    @Override
    public String toString() {
        return "Endereco: " + getEndereco() + " Preço: " + getPreco() + " com preco adicinal de imovel novo de %" + getValorAdicional();
    }
}
