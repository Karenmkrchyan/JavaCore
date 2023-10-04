package homework1.employee;

import java.util.Scanner;

public class EmloyeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        Boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employeeID");
            System.out.println("Please input 4 for search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    run = false;
                    break;
                case "1":
                    System.out.println("Please input Employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee ID");
                    String emloye = scanner.nextLine();
                    System.out.println("Please input  salary");
                    Double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input position");
                    int position = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input compamy name ");
                    String company = scanner.nextLine();
                    break;
                case "2":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.search(keyword);
                    break;
                case "3":
                    employeeStorage.print();
                    break;
                case "4":

            }
        }
    }
}