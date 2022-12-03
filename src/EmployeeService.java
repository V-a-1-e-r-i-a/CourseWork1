public class EmployeeService {

    //Вывод общей информации
    public static void listOfEmployee(Employee[] employees) {
        System.out.println("Информация о сотрудниках: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    //Подсчёт общей суммы окладов
    public static double sumOfCosts(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    //Подсчёт минимального оклада
    public static double minSalary(Employee[] employees) {
        double minSalary = maxSalary(employees);
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                }
            }
        }
        return minSalary;
    }

    //Поиск максимального оклада
    public static double maxSalary(Employee[] employees) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        return maxSalary;
    }

    //Подсчёт и вывод среднего значения зарплаты
    public static double midSalary(Employee[] employees) {
        double midSalary = 0;
        double sum = sumOfCosts(employees);
        int presentEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                presentEmployees++;
            }
        }
        if (presentEmployees < 1) {
            System.out.println("Никого не было");
            return 0;
        }
        midSalary = sum / presentEmployees;
        System.out.println("Среднее значение зарплаты: " + midSalary + " рублей");
        return midSalary;
    }

    //Вывод ФИО всех сотрудников
    public static void fullNameList(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ФИО сотрудника: " + employee.getSurName() + employee.getName() + employee.getPatronymic());
            }
        }
    }
}