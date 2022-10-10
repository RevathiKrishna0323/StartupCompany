/*
 * Author Name: Revathi
 * Date: 10-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jap;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee revathi = new Employee("Revathi", 27, "16-04-1994", "Guntur", 100000.0);
        double annualSalary = revathi.calculateAnnualSalary();
        double salaryAfterHike = revathi.salaryAfterHike(20);

    }
}
