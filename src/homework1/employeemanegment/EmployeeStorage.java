package homework1.employeemanegment;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public Employee getById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeesByCompany(Company companyFromStorage) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(companyFromStorage)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void deleteById(String companyId) {
        int indexById = getIndexById(companyId);
        if (indexById == -1) {
            System.out.println("Employee does not exists!");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            employees[i - 1] = employees[i];
        }
        size--;
    }

    private int getIndexById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().equals(companyId)) {
                return i;
            }
        }
        return -1;
    }
}
