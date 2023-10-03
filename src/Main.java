import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees =  new Employee[10];
        employees[0] = new Employee("Be Be Be", 1 , 58_000, 1);
        employees[1] = new Employee("Naf Naf", 2, 51_000, 2);
        //employees[2] = new Employee("Van Helsing", 3, 78_000, 3);
        //employees[3] = new Employee("Jorah Mormont", 4, 68_000, 4);
        //employees[4] = new Employee("Billy Butcher", 5, 99_000, 5);

        System.out.println(Arrays.toString(employees));


        //public static int calculateSumSalary() {
        //    int sum = 0;
        //    for (int i = 0; i < employees.length - 1; i++) {
        //        int sum = sum + employees[i].getSalary();
        //        return sum;
        //    }
        //   return sum;
        //}
    }
}