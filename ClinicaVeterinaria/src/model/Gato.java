package model;

public class Gato extends Animal{
    /*
    Classe animal: classe pai ou superclasse
    Classe cão: classe filho ou subclasse
    Classe gato: classe filho ou subclasse
     */
    private String tipoPelagem;

    public Gato(String nome, String especie, String dono, String tipoPelagem) {
        super(nome, especie, dono);
        this.tipoPelagem = tipoPelagem;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    /*
    Permite retornar a representação em String do objeto Animal
    mais uma string que contém a pelagem do gato.
    */
    public String toString(){
        return super.toString() +
                "Tipo de pelagem: " + tipoPelagem + "\n";
    }
}
