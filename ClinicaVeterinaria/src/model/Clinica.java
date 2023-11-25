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

    /*
    Método registrarAnimal: recebe o objeto do tipo animal e adiciona ele na lista "registrarAnimal".
    EM seguida, adiciona uma string vazia à lista historicosMedicos,
    representando o histórico médico dos animais.
     */
    public void registrarAnimal(Animal animal) {
        animaisRegistrados.add(animal);
        historicosMedicos.add("");
    }

    /*
    Método removerRegistro: o método obtém o índice do objeto animal na lista animaisRegistrados.
    Se o animal não estiver na lista, indexOf retornará -1.
    Se o animal estiver na lista, esta linha remove o animal da lista animaisRegistrados e seu histórico médico.
     */
    public void removerRegistro(Animal animal) {
        int index = animaisRegistrados.indexOf(animal);
        if (index != -1) {
            animaisRegistrados.remove(index);
            historicosMedicos.remove(index);
        }
    }

    /*
    Método listarAnimais: percorre a lista animaisRegistrados e
    imprime
     */
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

    //Método listarHistoricoMedicos: listar os históricos médicos de animais registrados
    public void listarHistoricosMedicos() {
        for (int i = 0; i < animaisRegistrados.size(); i++) {
            Animal animal = animaisRegistrados.get(i);
            String historicoAnimal = historicosMedicos.get(i);
            System.out.println("Histórico médico do bichinho " + animal.getNome() + ":");
            System.out.println(historicoAnimal);
            System.out.println("--------------------------------------");
        }
    }

    /*
    Método animalExiste: verifica se um animal com um determinado
    nome existe na lista de animaisRegistrados.
    Ele percorre a lista e compara o nome de cada animal com o nomeAnimal fornecido.
    Se encontrar uma correspondência, retorna true.
    Se não encontrar nenhuma correspondência após percorrer toda a lista, retorna false.
     */
    public boolean animalExiste(String nomeAnimal) {
        for (Animal animal : animaisRegistrados) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                return true;
            }
        }
        return false;
    }

    /*
    Método encontrarAnimalPorNome:
    Este método é semelhante ao anterior, mas em vez de retornar um booleano,
    ele retorna o objeto Animal que corresponde ao nomeAnimal fornecido.
    Se não encontrar nenhuma correspondência, retorna null.
     */
    public Animal encontrarAnimalPorNome(String nomeAnimal) {
        for (Animal animal : animaisRegistrados) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                return animal;
            }
        }
        return null; // Retorna null se o animal não for encontrado
    }

    /*
    imprime o histórico médico de um animal específico.
    Primeiro, ele encontra o índice do animal na lista de animaisRegistrados.
    Se o animal estiver na lista, ele obtém o histórico médico correspondente
    da lista de historicosMedicos e o imprime.
    Se o animal não estiver na lista, ele imprime uma mensagem informando
    que o histórico médico não foi encontrado para o animal.
     */
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


