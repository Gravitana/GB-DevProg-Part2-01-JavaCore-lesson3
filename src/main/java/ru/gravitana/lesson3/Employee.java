package ru.gravitana.lesson3;

public abstract class Employee {
    protected String name;
    protected int age;
    protected int salary;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    public abstract float calculationSalary();

    protected Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + calculationSalary() + "(per month)" +
                '}';
    }

}
