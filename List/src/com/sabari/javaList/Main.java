package com.sabari.javaList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sabari","Nathan",123));
        employeeList.add(new Employee("Ash","kumar",124));
        employeeList.add(new Employee("adi","kumar",145));
        employeeList.add(new Employee("ganesh","kumar",345));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("\n"+employeeList.size()+"\n\n");

        System.out.println(employeeList.get(1));
        employeeList.set(1,new Employee("Ashwani","kumar",124));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.contains(new Employee("adi","kumar",145)));
        System.out.println(employeeList.indexOf(new Employee("adi","kumar",145)));

        employeeList.remove(0);
    }
}
