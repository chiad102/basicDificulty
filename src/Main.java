public class Main {
    public static void main(String[] args) {
        Employee[] employees =  new Employee[10];
        employees[0] = new Employee("Be Be Be", 1 , 58_899);
        employees[1] = new Employee("Naf Naf", 2, 51_258);
        employees[2] = new Employee("Van Helsing", 3, 78_541);
        employees[3] = new Employee("Jorah Mormont", 4, 68_932);
        employees[4] = new Employee("Billy Butcher", 5, 99_773);
        employees[5] = new Employee("Mailman Pechkin", 1, 33_844);

        printEmployees(employees);

        System.out.println(calculateSumSalary(employees));

        System.out.println(minSalary(employees));

        System.out.println(maxSalary(employees));

        System.out.println(calculateAverageSalary(employees));

        printNames(employees);

        indexSalary(employees, 15);
    }

    public static void printEmployees (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }

        }
    }

    public static int calculateSumSalary (Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static int minSalary (Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                }
            }
        }
        return min;
    }

    public static int maxSalary (Employee[] employees) {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                }
            }
        }
        return max;
    }

    public static int calculateAverageSalary (Employee[] employees) {
        int employeeCount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employeeCount++;
            }
        }
        return calculateSumSalary(employees) / employeeCount;
    }

    public static void printNames (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }

    public static void indexSalary (Employee[] employees, int index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() + index * employees[i].getSalary() / 100);
                System.out.println(employees[i].getSalary());
            }
        }
    }
}