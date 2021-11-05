package Ex04;

public class Velho extends Imovel{
    private double valorDesconto;

    public Velho(String endereco, double preco, double valorDesconto) {
        super(endereco, preco);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double calculaDesconto(){
        return (getPreco() * valorDesconto)/100;
    }
    public double imprimeValorTotal(){
        return getPreco()-calculaDesconto();
    }

    @Override
    public String toString() {
        return "Endereco: " + getEndereco() + " Preço: " + getPreco() + " com desconto de imovel velho de %" + getValorDesconto();
    }
}
