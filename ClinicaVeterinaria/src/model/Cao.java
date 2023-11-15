package model;

public class Cao extends Animal{
    /*
    Classe animal: classe pai ou superclasse
    Classe cão: classe filho ou subclasse
    Classe gato: classe filho ou subclasse
     */
    private String raca;
    public Cao(String nome, String especie, String dono, String raca) {
        super(nome, especie, dono);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    /*
    Permite retornar a representação em String do objeto Animal
    mais uma string que contém a raça do cão.
    */
    public String toString(){
        return super.toString() +
                "Raça: " + raca + "\n";
    }
}
