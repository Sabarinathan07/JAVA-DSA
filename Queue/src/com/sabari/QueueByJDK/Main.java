package com.sabari.QueueByJDK;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Employee sabari = new Employee("Sabari", "nathan", 4);
        Employee adi = new Employee("Aditya", "ac", 25);
        Employee ganesh = new Employee("ganesh", "Kumar", 24);
        Employee ash = new Employee("Ashwin", "Kumar", 27);

        Deque<Employee> queue = new ArrayDeque<>();

//        Queue<Employee> queue = new ArrayDeque<>();

        queue.add(sabari);
        queue.add(adi);
        queue.add(ganesh);
        queue.add(ash);

//        queue.removeLast();


//        System.out.println(queue);
        System.out.println(queue.size());

        queue.forEach(employee -> System.out.println(employee));


    }
}
