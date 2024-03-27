package ru.bikbaev.hw_4;

public class Main {
    public static void main(String[] args) {

        Employee[]employees = {
                new Employee(1,"101","Михаил",5),
                new Employee(2,"202","Саша",2),
                new Employee(3,"302","Паша",10),
                new Employee(4,"402","Гоша",5.2),
                new Employee(5,"502","Сережа",0.5)
        };
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        employeeDirectory.addEmployee(new Employee(6,"602","Вадим",1));

        employeeDirectory.addEmployee(employees);

        employeeDirectory.getEmployeeList().forEach(System.out::println);
        System.out.println("\n Поиск по опыту \n");
        employeeDirectory.findExperience(2).forEach(System.out::println);
        System.out.println("\n Вывод телефона по поиску по имени \n");
        employeeDirectory.findName("Саша").forEach(System.out::println);
        System.out.println("\n Поиск по имени \n");
        employeeDirectory.findNameEmployee("Саша").forEach(System.out::println);
        System.out.println("\n Поиск по табельному \n");
        System.out.println(employeeDirectory.findReportCard(1));


    }
}
