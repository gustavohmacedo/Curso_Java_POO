package secao_6_memoria_arrays_e_listas.listas.exercicio_de_fixacao.application;

import secao_6_memoria_arrays_e_listas.listas.exercicio_de_fixacao.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.
        Não deve haver repetição de id. Em seguida, efetuar o aumento de X porcento no salário de um determinado
        funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        mensagem e abortar a operação.
        Ao final, mostrar a listagem atualizada dos funcionários. Lembre-se de aplicar a técnica de encapsulamento
        para não permitir que o salário possa ser mudado livremente.
        Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
        */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> funcionarios = new ArrayList<>();

        System.out.println();
        System.out.println("Quantos funcionários serão cadastrados?");
        int quantidadeFuncionarios = scanner.nextInt();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println();
            System.out.println("Entre com o Id, Nome e Salário do " + (i + 1) + "º Funcionário: ");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            while (temId(funcionarios, id)) {
                System.out.println("Id já existe! Tente novamente: ");
                id = scanner.nextInt();
            }

            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            Double salario = scanner.nextDouble();

            Employee funcionario = new Employee(id, nome, salario);
            funcionarios.add(funcionario);

        }
        System.out.println();
        System.out.println("Entre com ID do Funcionário que terá o salário incrementado: ");
        int idFuncionario = scanner.nextInt();
        double porcentagemAumentoSalario;

       /* Optional<Employee> empregado = funcionarios.stream().filter(emp -> emp.getId()
               .equals(idFuncionario)).findFirst();*/
        Employee empregado = funcionarios.stream().filter(emp -> emp.getId()
                .equals(idFuncionario)).findFirst().orElse(null);
        if (empregado == null) {
            System.out.println("\nErro! Id informado não existe. ");
        } else {
            System.out.println("Informe a porcentagem que será aplicada ao salário: ");
            porcentagemAumentoSalario = scanner.nextDouble();

            empregado.aumentarSalario(porcentagemAumentoSalario);
        }

        System.out.println("\nLista de Empregados: ");
        for (Employee elemento : funcionarios) System.out.print(elemento);

        scanner.close();
    }

    public static Boolean temId(List<Employee> list, Integer id) {
        Employee findId = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return findId != null;
    }
}
