
import java.util.Scanner;
import model.Animal;
import model.Clinica;
import model.Cao;
import model.Gato;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        Scanner scanner = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            System.out.println("--------------------------------------");
            System.out.println("MENU");
            System.out.println("1. Registrar Animal");
            System.out.println("2. Remover Registro");
            System.out.println("3. Listar Animais");
            System.out.println("4. Adicionar Histórico Médico");
            System.out.println("5. Listar Históricos Medicos");
            System.out.println("6. Sair");
            System.out.println("Digite a opção desejada: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do animal: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a espécie do animal: ");
                    String especie = scanner.nextLine();
                    System.out.println("Digite o nome do dono do animal: ");
                    String dono = scanner.nextLine();

                    System.out.println("O animal é um cão (1) ou um gato (2)? ");
                    int tipoAnimal = scanner.nextInt();

                    if (tipoAnimal == 1) {
                        scanner.nextLine(); // Limpar o buffer
                        System.out.println("Digite a raça do cão: ");
                        String raca = scanner.nextLine();

                        Cao cao = new Cao(nome, especie, dono, raca);
                        clinica.registrarAnimal(cao);
                        System.out.println("Cão registrado com sucesso!");
                    } else if (tipoAnimal == 2) {
                        scanner.nextLine(); // Limpar o buffer
                        System.out.println("Digite o tipo de pelagem do gato: ");
                        String tipoPelagem = scanner.nextLine();

                        Gato gato = new Gato(nome, especie, dono, tipoPelagem);
                        clinica.registrarAnimal(gato);
                        System.out.println("Gato registrado com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do animal a ser removido: ");
                    String nomeAnimal = scanner.nextLine();

                    boolean encontrou = false;
                    for (Animal animal : clinica.getAnimaisRegistrados()) {
                        if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                            clinica.removerRegistro(animal);
                            encontrou = true;
                            System.out.println("Registro removido com sucesso!");
                            break;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Animal não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("\n");
                    clinica.listarAnimais();
                    break;

                case 4:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do animal para adicionar o histórico médico: ");
                    String nomeAnimalHistorico = scanner.nextLine();

                    for (Animal animal : clinica.getAnimaisRegistrados()) {
                        if (animal.getNome().equalsIgnoreCase(nomeAnimalHistorico)) {
                            System.out.println("Digite a data do histórico médico(dd/MM/yyyy)");
                            String dataString = scanner.nextLine();
                            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

                            try {
                                Date data = dateFormatter.parse(dataString);
                                String dataFormatada = dateFormatter.format(data);
                                System.out.println("Digite a descrição dos sintomas: ");
                                String sintomas = scanner.nextLine();
                                System.out.println("Digite o diagnóstico: ");
                                String diagnostico = scanner.nextLine();
                                System.out.println("Digite o tratamento: ");
                                String tratamento = scanner.nextLine();
                                System.out.println("Digite as observações: ");
                                String observacoes = scanner.nextLine();

                                clinica.adicionarHistoricoMedico(animal, dataFormatada, sintomas, diagnostico, tratamento, observacoes);
                                System.out.println("Histórico médico adicionado com sucesso!");

                            } catch (ParseException e) {
                                System.out.println("Erro ao converter a data! Certifique-se de usar o formato dd/MM/yyyy.");
                            }
                        }else{
                            System.out.println("Animal não encontrado!");
                        }
                    }

                    break;

                case 5:
                    System.out.println("\n");
                    clinica.listarHistoricosMedicos();
                    break;
                case 6:
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}