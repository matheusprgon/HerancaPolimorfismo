package Ex02;

public class Animal {
    private String nome;
    private String raca;

    public Animal() {}

    public Animal(String nome) {
        this.nome = nome;
    }
    public String caminha() {
        return ("caminhou");
    }

    @Override
    public String toString() {
        return "Animal " + nome;
    }
}

