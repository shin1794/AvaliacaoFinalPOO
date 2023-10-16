package model;

public class Cao extends Animal{
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

    public String toString(){
        return super.toString() +
                "Raça: " + raca + "\n";
    }
}
