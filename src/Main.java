public class Main {
    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Иванов И.И.", 1, 15_000);
        employee[1] = new Employee("Петров П.П.", 2, 35_000);
        employee[2] = new Employee("Сидоров С.С.", 3, 40_000);
        employee[3] = new Employee("Смирнов С.С.", 4, 60_000);
        employee[4] = new Employee("Лебедев Л.Л.", 5, 30_000);
        employee[5] = new Employee("Голубев Г.Г.", 1, 55_000);
        employee[6] = new Employee("Дятлов Д.Д.", 2, 65_000);
        employee[7] = new Employee("Сойкин С.С.", 3, 53_000);
        employee[8] = new Employee("Орлов О.О.", 4, 80_000);
        employee[9] = new Employee("Соколов С.С.", 5, 70_000);
    }


    //печать всех полей всех сотрудников
    public static void printInfoAboutEmployees() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    //печать общей зарплаты всех сотрудников
    public static void printOverallSalary() {
        int totalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            totalSalary = totalSalary + employee[i].getSalary();
        }
        System.out.println("Сумма всех окладов равна " + totalSalary + " рублей");
    }

    //найти сотрудника с минимальной зп
    public static void findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employee[0];
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                employeeWithMinSalary = employee[i];
            }
        }
        System.out.println("Сотрудник с минимальной зп: " + employeeWithMinSalary.toString());
    }

    //найти сотрудника с максимальной зп
    public static void findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employee[0];
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                employeeWithMaxSalary = employee[i];
            }
        }
        System.out.println("Сотрудник с максимальной зп: " + employeeWithMaxSalary.toString());
    }

    //посчитать среднее значение зарплаты
    public static void printAverageSalary() {
        double averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            averageSalary = averageSalary + employee[i].getSalary();
        }
        averageSalary = averageSalary / employee.length;
        System.out.println("Средняя зарплата составляет: " + averageSalary + " рублей");
    }

    //список ФИО всех сотрудников
    public static void printAllEmployeesNames() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullname());
        }
    }
}
