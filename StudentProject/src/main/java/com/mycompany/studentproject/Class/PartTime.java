/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentproject.Class;

/**
 *
 * @author PANJI GILANG
 */
public class PartTime extends Teacher {
    private int hoursWorked;
    private int salary;

    public PartTime(String name, int age, String subject, int hoursWorked, int salary) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + salary);
    }
}
