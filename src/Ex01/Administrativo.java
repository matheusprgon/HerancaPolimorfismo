package Ex01;

public class Administrativo extends Assistente {
    private String turno;
    private double valorBonus;

    public Administrativo(String nome, double salario, int nMatricula, String turno, double valorBonus) {
        super(nome, salario, nMatricula);
        this.turno = turno;
        this.valorBonus = valorBonus;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    public double calculaSalario(){
    if (getTurno().toUpperCase().equals("NOITE")) {

        return getSalario() + getValorBonus();
    } else
        return getSalario();


    }
}
