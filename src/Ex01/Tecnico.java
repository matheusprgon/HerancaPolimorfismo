package Ex01;

public class Tecnico extends Assistente {
    private double bonusSalario;


    public Tecnico(String nome, double salario, int nMatricula, double bonusSalario) {
        super(nome, salario, nMatricula);
        this.bonusSalario = bonusSalario;
    }

    public double getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(double bonusSalario) {
        this.bonusSalario = bonusSalario;
    }

    public double calculaSalario(){
        return getSalario() + getBonusSalario();
    }

}
