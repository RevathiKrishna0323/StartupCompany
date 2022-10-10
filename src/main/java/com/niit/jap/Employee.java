/*
 * Author Name: Revathi
 * Date: 10-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jap;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    String name;
    int age;
    LocalDate dateOfBirth;
    String adress;
    double salary;

    public Employee() {
    }

    public Employee(String name, int age, LocalDate dateOfBirth, String adress, double salary) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(adress, employee.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dateOfBirth, adress, salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", adress='" + adress + '\'' + ", salary=" + salary + '}';
    }
}
