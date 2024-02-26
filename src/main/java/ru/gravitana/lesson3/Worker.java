package ru.gravitana.lesson3;

public class Worker extends Employee{
    @Override
    public float calculationSalary() {
        return (float) getSalary();
    }

    protected Worker(String name, int age, int salary) {
        super(name, age, salary);
    }
}
