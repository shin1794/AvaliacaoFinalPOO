package model;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    //Classe clínica: possui todos os métodos que a Classe Main irá chamar e executar


    private List<Animal> animaisRegistrados;
    private List<String> historicosMedicos;

    public Clinica() {
        animaisRegistrados = new ArrayList<>();
        historicosMedicos = new ArrayList<>();
    }


    public List<Animal> getAnimaisRegistrados() {
        return animaisRegistrados;
    }

    public void setAnimaisRegistrados(List<Animal> animaisRegistrados) {
        this.animaisRegistrados = animaisRegistrados;
    }

    public List<String> getHistoricosMedicos() {
        return historicosMedicos;
    }

    public void setHistoricosMedicos(List<String> historicosMedicos) {
        this.historicosMedicos = historicosMedicos;
    }

    public void registrarAnimal(Animal animal) {
        animaisRegistrados.add(animal);
        historicosMedicos.add("");
    }

    public void removerRegistro(Animal animal) {
        int index = animaisRegistrados.indexOf(animal);
        if (index != -1) {
            animaisRegistrados.remove(index);
            historicosMedicos.remove(index);
        }
    }

    public void listarAnimais() {
        for (Animal animal : animaisRegistrados) {
            System.out.println(animal);
        }
    }


    /*
    indexOf: usado para a posição do animal na lista animaisRegistrados.
    Se não for encontrado, o método retorna -1.
     */

    /*
    Método criado para adicionar e vincular um histórico médico a um animal.
    Ele procura o índice do objeto Animal na lista animaisRegistrados usando o método indexOf() e, se encontrado,
    adiciona as informações médicas à String correspondente na lista historicosMedicos.
    */
    public void adicionarHistoricoMedico(Animal animal, String dataFormatada, String sintomas,
                                         String diagnostico, String tratamento, String observacoes) {
        int index = animaisRegistrados.indexOf(animal);
        if (index != -1) {
            String historicoAnimal = historicosMedicos.get(index);
            historicoAnimal += "Data: " + dataFormatada + "\n";
            historicoAnimal += "Sintomas: " + sintomas + "\n";
            historicoAnimal += "Diagnóstico: " + diagnostico + "\n";
            historicoAnimal += "Tratamento: " + tratamento + "\n";
            historicoAnimal += "Observações: " + observacoes + "\n";
            historicosMedicos.set(index, historicoAnimal);
        }
    }

    public void listarHistoricosMedicos() {
        for (int i = 0; i < animaisRegistrados.size(); i++) {
            Animal animal = animaisRegistrados.get(i);
            String historicoAnimal = historicosMedicos.get(i);
            System.out.println("Histórico médico do bichinho " + animal.getNome() + ":");
            System.out.println(historicoAnimal);
            System.out.println("--------------------------------------");
        }
    }

    public boolean animalExiste(String nomeAnimal) {
        for (Animal animal : animaisRegistrados) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                return true;
            }
        }
        return false;
    }

    public Animal encontrarAnimalPorNome(String nomeAnimal) {
        for (Animal animal : animaisRegistrados) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                return animal;
            }
        }
        return null; // Retorna null se o animal não for encontrado
    }

    public void listarHistoricoMedico(Animal animal) {
        int index = animaisRegistrados.indexOf(animal);
        if (index != -1) {
            String historicoAnimal = historicosMedicos.get(index);
            System.out.println("Histórico médico do bichinho " + animal.getNome() + ":");
            System.out.println(historicoAnimal);
        } else {
            System.out.println("Histórico médico não encontrado para o animal " + animal.getNome());
        }
    }
}


