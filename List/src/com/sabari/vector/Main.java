package com.sabari.vector;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        //By using for loop
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
//
//        for(int i=0;i< employeeList.size();i++){
//            System.out.println(employeeList.get(i));
//        }




    }
}
