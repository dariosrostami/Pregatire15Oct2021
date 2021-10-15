package com.company;

public class Main {

    /* Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/
    static class Employee
    {
        String name;
        int yearOfJoining;
        double salary;
        String address;

        public Employee(String name, int yearOfJoining, double salary, String address) {
            this.name = name;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
            this.address = address;
        }
        void showEmployeeInfo()
        {
            System.out.println("name: " + this.name + "\nYear: " + this.yearOfJoining + "\nAddress: " + address);
        }
    }

    public static void main(String[] args) {
        Employee dorel = new Employee("Dorel", 1995, 2335.5, "Strada Garii nr.5");
        dorel.showEmployeeInfo();


    }
}
