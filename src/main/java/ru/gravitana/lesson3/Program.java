package ru.gravitana.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Worker("Иван", 21, 40_000));
        employees.add(new Freelancer("Дарья", 20, 300));
        employees.add(new Freelancer("Степан", 19, 300));
        employees.add(new Worker("Егор", 26, 50_000));
        employees.add(new Freelancer("Сергей", 21, 250));
        employees.add(new Worker("Анастасия", 19, 25_000));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Collections.sort(employees);

        System.out.println("\nОтсортировано по месячной зарплате\n");

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
