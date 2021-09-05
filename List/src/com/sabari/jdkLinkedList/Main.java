package com.sabari.jdkLinkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        Employee sabari = new Employee("Sabari","Nathan",123);
        Employee adi = new Employee("adi","kumar",123);
        Employee ash = new Employee("ash","kumar",123);
        Employee ganesh = new Employee("ganesh","kumar",123);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(sabari);
        list.addFirst(adi);
        list.addFirst(ash);
        list.addFirst(ganesh);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null \n");

        //addLast command
        list.addLast(billEnd);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null\n");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null\n");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null\n");

        //print using for loop
        for (Employee employee: list) {
            System.out.println(employee);
        }
    }
}
