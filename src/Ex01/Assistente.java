package Ex01;

public class Assistente extends Funcionario {

    private final int nMatricula;

    public Assistente(String nome, double salario, int nMatricula) {
        super(nome, salario);
        this.nMatricula = nMatricula;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    @Override
    public String toString() {
        return
                "Numero Matricula = " + nMatricula +"\n"+ "Nome = " + getNome();
    }
}
