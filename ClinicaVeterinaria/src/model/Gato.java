package model;

public class Gato extends Animal{
    private String tipoPelagem;

    public Gato(String nome, String especie, String dono) {
        super(nome, especie, dono);
        this.tipoPelagem = tipoPelagem;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public String toString(){
        return super.toString() +
                "Tipo de pelagem: " + tipoPelagem + "\n";
    }
}
