
package model;
public class Animal {
    /*
    Classe animal: classe pai ou superclasse
    Classe cão: classe filho ou subclasse
    Classe gato: classe filho ou subclasse
     */
    private String nome;
    private String especie;
    private String dono;

    //Método construtor: método usado para iniciar as variáveis
    public Animal(String nome, String especie, String dono) {
        this.nome = nome;
        this.especie = especie;
        this.dono = dono;
    }

    //métodos getter e setter
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

    /*
    Retorna uma representação em String do objeto Animal.
    O método toString() retorna uma String que contém o nome do dono,
    o nome do animal e a espécie do animal, cada um em uma linha separada.
     */
    public String toString(){
        return "Dono: " + dono + "\n" +
                "Nome do bichinho: " + nome + "\n" +
                "Espécie: " + especie + "\n";
    }
}

