package es_project;

import es_project.controller.*;
import es_project.model.AdministradorHospitalar;
import es_project.model.Consulta;
import es_project.model.Enfermeiro;
import es_project.model.EscalaProfissional;
import es_project.model.Exame;
import es_project.model.Farmaceuta;
import es_project.model.Fatura;
import es_project.model.Medico;
import es_project.model.Paciente;
import es_project.model.Utilizador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HospitalController h = new HospitalController();
        Scanner sc = new Scanner(System.in);

        // Lista de utilizadores placeholder
        List<Utilizador> utilizadores = new ArrayList<>();

        // Paciente
        Paciente paciente1 = new Paciente();
        paciente1.setId_utilizador(1);
        paciente1.setId_tipo_utilizador(1); // Paciente
        paciente1.setNome_utilizador("joao");
        paciente1.setEmail_utilizador("joao.silva@email.com");
        paciente1.setIdade_utilizador(30);
        paciente1.setPassword_utilizador("1234");
        paciente1.setTelemovel_utilizador(912345678);
        paciente1.setId_paciente(101);
        paciente1.setId_seguro(1001);
        paciente1.setData_nascimento(LocalDate.of(1993, 6, 12));
        paciente1.setGenero_paciente("Masculino");
        paciente1.setMorada_paciente("Rua Saúde, 10");
        utilizadores.add(paciente1);

        // Médico
        Medico medico1 = new Medico();
        medico1.setId_utilizador(2);
        medico1.setId_tipo_utilizador(2); // Médico
        medico1.setNome_utilizador("Maria");
        medico1.setEmail_utilizador("maria.costa@hospital.com");
        medico1.setIdade_utilizador(45);
        medico1.setPassword_utilizador("abcd");
        medico1.setTelemovel_utilizador(919876543);
        medico1.setId_profissional(201);
        medico1.setProfissional_ativo(true);
        medico1.setNome_especialidade("Cardiologia");
        utilizadores.add(medico1);

        // Enfermeiro
        Enfermeiro enfermeiro1 = new Enfermeiro();
        enfermeiro1.setId_utilizador(3);
        enfermeiro1.setId_tipo_utilizador(3); // Enfermeiro
        enfermeiro1.setNome_utilizador("carlos");
        enfermeiro1.setEmail_utilizador("carlos.mendes@hospital.com");
        enfermeiro1.setIdade_utilizador(35);
        enfermeiro1.setPassword_utilizador("enf123");
        enfermeiro1.setTelemovel_utilizador(917654321);
        enfermeiro1.setId_profissional(301);
        enfermeiro1.setProfissional_ativo(true);
        enfermeiro1.setTipo_enfermeiro("Pediátrico");
        utilizadores.add(enfermeiro1);

        // Administrador
        AdministradorHospitalar admin1 = new AdministradorHospitalar();
        admin1.setId_utilizador(4);
        admin1.setId_tipo_utilizador(4); // Administrador
        admin1.setNome_utilizador("ana");
        admin1.setEmail_utilizador("ana.ribeiro@hospital.com");
        admin1.setIdade_utilizador(40);
        admin1.setPassword_utilizador("admin123");
        admin1.setTelemovel_utilizador(918765432);
        admin1.setId_profissional(401);
        admin1.setProfissional_ativo(true);
        admin1.setMotivo_inatividade(null);
        utilizadores.add(admin1);

        // Farmacêutico
        Farmaceuta farmaceutico1 = new Farmaceuta();
        farmaceutico1.setId_utilizador(5);
        farmaceutico1.setId_tipo_utilizador(5); // Farmacêutico
        farmaceutico1.setNome_utilizador("beatriz");
        farmaceutico1.setEmail_utilizador("beatriz.sousa@hospital.com");
        farmaceutico1.setIdade_utilizador(32);
        farmaceutico1.setPassword_utilizador("prof123");
        farmaceutico1.setTelemovel_utilizador(916543210);
        farmaceutico1.setId_profissional(501);
        farmaceutico1.setProfissional_ativo(true);
        utilizadores.add(farmaceutico1);

        // ====== LOGIN ======
        Utilizador user = null;
        System.out.println("----------- Lista Utilizadores existentes --------------");
        System.out.println("nome: 'joao'; tipo de utilizador: 'paciente'; password: '1234'");
        System.out.println("nome: 'maria'; tipo de utilizador: 'Médico'; password: 'abcd'");
        System.out.println("nome: 'carlos'; tipo de utilizador: 'Enfermeiro'; password: 'enf123'");
        System.out.println("nome: 'ana'; tipo de utilizador: 'Administrador Hospitalar'; password: 'admin123'");
        System.out.println("nome: 'beatriz'; tipo de utilizador: 'Farmaceuta'; password: 'prof123'");
        System.out.println("----------- Fim Lista Utilizadores existentes --------------");
        System.out.println();
        System.out.println("---------------- LOGIN -----------------");

        while (user == null) {
            System.out.print("Username: ");
            String uname = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();

            for (Utilizador u : utilizadores) {
                if (u.getNome_utilizador().equalsIgnoreCase(uname) &&
                        u.getPassword_utilizador().equals(pass)) {
                    user = u;
                    break;
                }
            }

            if (user == null)
                System.out.println("Login inválido, tente novamente.");
        }

        System.out.println("Bem-vindo, " + user.getNome_utilizador() +
                "! Tipo: " + user.getId_tipo_utilizador());

        menu(h, sc, user);
    }

    private static void menu(HospitalController h, Scanner sc, Utilizador user) {
        boolean running = true;
        while (running) {
            System.out.println("\n----------- MENU PRINCIPAL --------------");
            System.out.println("1. Consultas");

            if (user.getId_tipo_utilizador() != 1 && user.getId_tipo_utilizador() != 5) // nem Paciente nem Farmacêutico
                System.out.println("2. Exames");

            if (user.getId_tipo_utilizador() == 2
                    || user.getId_tipo_utilizador() == 3
                    || user.getId_tipo_utilizador() == 4) // Enfermeiro | Médico | Admin
                System.out.println("3. Escalas");

            System.out.println("4. Faturas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1: {
                    if (user.getId_tipo_utilizador() != 1)
                        menuConsultas(h, sc, user.getId_tipo_utilizador());
                    else
                        System.out.println("Opção inválida!");
                }
                case 2: {
                    if (user.getId_tipo_utilizador() != 1 && user.getId_tipo_utilizador() != 5)
                        menuExames(h, sc, user);
                    else
                        System.out.println("Opção inválida!");
                }
                case 3: {
                    if (user.getId_tipo_utilizador() == 3 || user.getId_tipo_utilizador() == 4)
                        menuEscalas(h, sc, user);
                    else
                        System.out.println("Opção inválida!");
                }
                case 4:
                    menuFaturas(h, sc, user);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }

    // ====== MENUS ======
    private static void menuConsultas(HospitalController h, Scanner sc, int tipo) {
        System.out.println("\n--- Consultas ---");
        System.out.println("1. Listar consultas de paciente");
        System.out.println("2. Criar nova consulta");
        System.out.print("Escolha: ");
        int opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1: {
                System.out.print("ID do paciente: ");
                int idPaciente = Integer.parseInt(sc.nextLine());
                ArrayList<Consulta> consultas = h.consultarHistoricoClinico(idPaciente);
                if (consultas.isEmpty())
                    System.out.println("Nenhuma consulta encontrada.");
                else
                    consultas.forEach(c -> System.out.println("ID Consulta: " + c.getId_consulta() +
                            ", Médico: " + c.getId_medico() +
                            ", Estado: " + c.getEstado_consulta()));
            }
            case 2: {
                Consulta c = new Consulta();
                System.out.print("ID Consulta: ");
                c.setId_consulta(Integer.parseInt(sc.nextLine()));
                System.out.print("ID Tipo Consulta: ");
                c.setId_tipo_consulta(Integer.parseInt(sc.nextLine()));
                System.out.print("ID Paciente: ");
                c.setId_paciente(Integer.parseInt(sc.nextLine()));
                System.out.print("ID Médico: ");
                c.setId_medico(Integer.parseInt(sc.nextLine()));
                c.setEstado_consulta("Agendada");
                c.setData_inicio(LocalDateTime.now());
                c.setData_fim(LocalDateTime.now().plusHours(1));
                h.marcarConsulta(c);
                System.out.println("Consulta criada com sucesso.");
                break;
            }
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static void menuExames(HospitalController h, Scanner sc, Utilizador user) {
        System.out.println("\n--- Exames ---");
        System.out.println("1. Listar exames por consulta");
        System.out.println("2. Criar novo exame");
        System.out.println("3. Verificar estado exame");
        System.out.println("0. Voltar menu principal");
        System.out.print("Selecionar opção: ");
        int opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1: {
                System.out.print("ID Consulta: ");
                int idConsulta = Integer.parseInt(sc.nextLine());
                List<Exame> exames = h.listarExamesPorConsulta(idConsulta);
                if (exames.isEmpty())
                    System.out.println("Nenhum exame encontrado.");
                else
                    exames.forEach(e -> System.out.println("Exame ID: " + e.getId_exame() +
                            ", Estado: " + e.getEstado_resultado()));
                break;
            }
            case 2: {
                if (user.getId_tipo_utilizador() == 1 || user.getId_tipo_utilizador() == 5) {
                    System.out.println("Não tem permissão para criar exames!");
                    return;
                }
                Exame e = new Exame();
                System.out.print("ID Exame: ");
                e.setId_exame(Integer.parseInt(sc.nextLine()));
                System.out.print("ID Tipo Exame: ");
                e.setId_tipo_exame(Integer.parseInt(sc.nextLine()));
                System.out.print("ID Consulta: ");
                e.setId_consulta(Integer.parseInt(sc.nextLine()));
                e.setEstado_resultado("PENDENTE");
                e.setData_pedido(LocalDateTime.now());
                h.criarExame(e);
                System.out.println("Exame criado com sucesso.");
                break;
            }
            case 3: {
                System.out.println("ID Exame: ");
                int idExame = Integer.parseInt(sc.nextLine());
                String estadoExame = h.obterEstadoExame(idExame);
                System.out.println(estadoExame);
                break;
            }
            case 0: {
                menu(h, sc, user);
                break;
            }
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void menuEscalas(HospitalController h, Scanner sc, Utilizador user) {
        System.out.println("\n--- Escalas ---");
        System.out.println("1. Listar escalas");
        System.out.println("2. Criar nova escala");
        System.out.println("3. Eliminar Escala");
        System.out.println("0. Voltar Menu");
        System.out.print("Selecionar opção: ");
        int opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1: {
                if (user.getId_tipo_utilizador() != 3) {
                    System.out.println("Acesso negado.");
                    break;
                }

                List<EscalaProfissional> escalas = h.listarAllEscalas();
                if (escalas.isEmpty())
                    System.out.println("Nenhuma escala existente.");
                else
                    escalas.forEach(e -> System.out.println("Escala ID: " + e.getId_escala() +
                            ", Profissional: " + e.getId_profissional() +
                            ", Início: " + e.getData_inicio() +
                            ", Fim: " + e.getData_fim()));
                break;
            }
            case 2: {
                EscalaProfissional e = new EscalaProfissional();

                System.out.print("ID Escala: ");
                e.setId_escala(Integer.parseInt(sc.nextLine()));

                System.out.print("ID Profissional: ");
                e.setId_profissional(Integer.parseInt(sc.nextLine()));

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                System.out.print("Data Início (dd-MM-yyyy): ");
                e.setData_inicio(
                        LocalDate.parse(sc.nextLine(), formatter).atStartOfDay());

                System.out.print("Data Fim (dd-MM-yyyy): ");
                e.setData_fim(
                        LocalDate.parse(sc.nextLine(), formatter).atTime(23, 59));

                h.criarEscala(e);
                System.out.println("Escala criada com sucesso.");
                break;
            }

            case 3: {
                System.out.print("ID Escala para remover: ");
                int idEscala = Integer.parseInt(sc.nextLine());
                String removida = h.removerEscala(idEscala);
                System.out.print(removida);
                break;
            }
            case 0: {
                menu(h, sc, user);
                break;
            }
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static void menuFaturas(HospitalController h, Scanner sc, Utilizador user) {
        System.out.println("\n--- Faturas ---");
        System.out.println("1. Listar todas as faturas");
        System.out.println("2. Obter fatura de consulta");

        if (user.getId_tipo_utilizador() == 1)

            System.out.println("3. Pagar fatura de consulta");

        System.out.println("0. Voltar Menu");
        System.out.print("Selecionar opção: ");

        int opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1: {
                if (user.getId_tipo_utilizador() != 4) {
                    System.out.println("Acesso negado.");
                    break;
                }
                ArrayList<Fatura> faturas = h.listarAllFaturas();
                if (faturas.isEmpty())
                    System.out.println("Nenhuma fatura cadastrada.");
                else
                    faturas.forEach(f -> System.out.println("Fatura ID: " + f.getId_fatura() +
                            ", Consulta: " + f.getId_consulta() +
                            ", Total: " + f.getValor_total() +
                            ", Estado: " + f.getEstado_fatura()));
                break;
            }
            case 2: {
                if (user.getId_tipo_utilizador() == 1) {
                    System.out.println("Opção inválida!");
                    return;
                }
                ArrayList<Fatura> faturasPaciente = h.obterFaturasPorPaciente(user.getId_utilizador());
                if (faturasPaciente.isEmpty())
                    System.out.println("Nenhuma fatura encontrada.");
                else
                    faturasPaciente.forEach(f -> System.out.println("Fatura ID: " + f.getId_fatura() +
                            ", Total: " + f.getValor_total() +
                            ", Estado: " + f.getEstado_fatura()));
                break;
            }
            case 3: {
                if (user.getId_tipo_utilizador() != 1) {
                    System.out.println("Opção inválida!");
                    return;
                }
                System.out.print("Insira ID da Fatura a pagar: ");
                int idFatura = Integer.parseInt(sc.nextLine());
                String faturaPaga = h.marcarComoPago(idFatura);
                System.out.print(faturaPaga);
                break;
            }
            case 0: {
                menu(h, sc, user);
                break;
            }
            default:
                System.out.println("Opção inválida!");
        }
    }
}
