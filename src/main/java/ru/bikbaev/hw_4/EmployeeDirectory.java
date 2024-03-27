package ru.bikbaev.hw_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
 */
public class EmployeeDirectory {
    private List<Employee>employeeList=new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee){
         employeeList.add(employee);
    }

    public void addEmployee(Employee[] employees){
        employeeList.addAll(Arrays.stream(employees).toList());
    }

    public List<Employee> findExperience(double experience){
        return new ArrayList<>(
                employeeList.stream()
                        .filter(employee -> employee.getExperience() >=experience)
                        .toList()
        );
    }



    public List<Employee> findNameEmployee(String name){
        return new ArrayList<>(
                employeeList.stream()
                        .filter(employee -> name.equals(employee.getName()))
                        .toList()
        );
    }

    public List<String> findName(String name){
        return new ArrayList<>(
                findNameEmployee(name)
                        .stream()
                        .map(employee -> employee.getPhone()).toList()
        );
    }

    public Employee findReportCard (int reportCard){
        return employeeList
                .stream()
                .filter(employee -> employee.getReportCard()==reportCard)
                .findFirst()
                .orElse(null)

    ;}

    @Override
    public String toString() {
        return employeeList.toString();
    }
}
