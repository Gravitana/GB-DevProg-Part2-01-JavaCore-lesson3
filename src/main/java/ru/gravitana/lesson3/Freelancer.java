package ru.gravitana.lesson3;

public class Freelancer extends Employee{
    @Override
    public float calculationSalary() {
        return (float) (20.8 * 8 * getSalary());
    }

    protected Freelancer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public int compareTo(Employee e) {
        return (int) (this.calculationSalary() - e.calculationSalary());
    }
}
