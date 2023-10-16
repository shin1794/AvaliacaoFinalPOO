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

    public void adicionarHistoricoMedico(Animal animal, String historicoMedico) {
        int index = animaisRegistrados.indexOf(animal);
        if (index != -1) {
            String historicoAnimal = historicosMedicos.get(index);
            historicoAnimal += historicoMedico;
            historicosMedicos.set(index, historicoAnimal);
        }
    }
}


