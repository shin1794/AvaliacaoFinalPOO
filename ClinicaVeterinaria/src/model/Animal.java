package model;

public class Animal {
    private String nome;
    private String especie;
    private String dono;

    public Animal(String nome, String especie, String dono) {
        this.nome = nome;
        this.especie = especie;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String toString(){
        return "Dono: " + dono + "\n" +
                "Nome do bichinho: " + nome + "\n" +
                "Espécie: " + especie + "\n";
    }
}
