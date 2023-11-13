package model;
import java.util.ArrayList;
import java.util.List;
public class Clinica {
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


