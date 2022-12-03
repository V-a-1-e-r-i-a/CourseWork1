public class Main {
    public static void main(String[] args) {

        System.out.println("Курсовая работа");

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ника ", "Сидорова ","Давидовна", 1, 22_00);
        employees[1] = new Employee("Никита ", "Смирнов ","Иванович", 2, 22_000);
        employees[2] = new Employee("Максим ", "Романов ","Артёмович", 3, 24_000);
        employees[3] = new Employee("Артём ", "Горюнов ","Максимович", 4, 33_000);
        employees[4] = new Employee("Даниил ", "Ларин ","Глебович", 5, 40_000);
        employees[5] = new Employee("Лев ", "Еремен ","Александрович", 1, 44_000);
        employees[6] = new Employee("Васелиса ", "Воронина ","Марсельевна", 2, 68_000);
        employees[7] = new Employee("Елена ", "Назарова ","Мироновна", 3, 74_000);
        employees[8] = new Employee("Андрей ", "Копылёв ","Дмитриевич", 4, 83_000);
        employees[9] = new Employee("Валентина ", "Овчинникова ","Кирилловна", 5, 95_000);

        EmployeeService.listOfEmployee(employees);
        System.out.println("Сумма затрат на зарплату за месяц: " +  EmployeeService.sumOfCosts(employees) + " рублей");
        System.out.println("Минимальный оклад: " + EmployeeService.minSalary(employees) + " рублей");
        System.out.println("Максимальный оклад: " + EmployeeService.maxSalary(employees) + " рублей");
        EmployeeService.midSalary(employees);
        EmployeeService.fullNameList(employees);
    }
}