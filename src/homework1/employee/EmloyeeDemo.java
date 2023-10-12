package homework1.employee;

import java.util.Scanner;

public class EmloyeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    public static void main(String[] args) {

        Boolean run = true;
        while (run) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    run = false;
                    break;
                case "1":
                    addEmployee(command);
                    break;
                case "2", "3", "4":

                    surchEmployee();
                    break;
                case "5":
                    System.out.println("Please input ID for delete");

                default:
                    System.out.println("invalid command");
                    String empioyeeid = scanner.nextLine();
            }
        }

    }

    private static void surchEmployee() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        employeeStorage.search(keyword);
    }

    private static void addEmployee(String command) {
        System.out.println("Please input Employee name");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("Please input employee ID");
        String empioyee = scanner.nextLine();
        System.out.println("Please input  salary");
        Double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input position");
        int position = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input compamy name ");
        String compane = scanner.nextLine();
        Employee employee = new Employee(name, surname, empioyee, salary, position, command);
        employeeStorage.add(employee);
        System.out.println("employee crated");
    }

    public static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print all employee");
        System.out.println("Please input 3 for search employee by employeeID");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for deleteby Id");
        System.out.println("Please input 6 for change employee by ID");
    }

}

