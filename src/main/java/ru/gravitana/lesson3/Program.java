package ru.gravitana.lesson3;

public class Program {
    public static void main(String[] args) {
        Employee[] employees = {
                new Worker("Иван", 21, 40_000),
                new Freelancer("Дарья", 20, 300),
                new Freelancer("Степан", 19, 300),
                new Worker("Егор", 26, 50_000),
                new Freelancer("Сергей", 21, 250),
                new Worker("Анастасия", 19, 25_000),
        };

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
