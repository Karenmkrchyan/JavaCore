package homework1.employee;

public class EmployeeStorage {
    public Employee[] employees = new Employee[10];
    private int size;

    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(employees[i].getEmloyeID() + " " + employees[i].getCompany() + " " + employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getPosition());
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmloyeID().contains(keyword)
                    || employees[i].getCompany().contains(keyword)) ;
            {
                System.out.println(employees[i].getEmloyeID() + " " + employees[i].getCompany() + " " + employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getPosition());
            }
        }
    }

    public void add(Employee employee) {
        if (size == employees.length) {
            extent();
        }
        employees[size++] = employee;
    }

    private void extent() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }


}
