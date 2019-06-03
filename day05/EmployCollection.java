package com.trimindtech.training.day05;

public class EmployCollection {
    private  String Name;
    private int Id;
    private  double salary;

    public EmployCollection(String name, int id, double salary) {
        Name = name;
        Id = id;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployCollection{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                '}';
    }
    @Override
    public boolean equals(Object obj)
    {
        return true;
    }
}
