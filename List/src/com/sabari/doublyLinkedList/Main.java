package com.sabari.doublyLinkedList;

public class Main {

    public static void main(String[] args) {

        Employee sabari = new Employee("Sabari","Nathan",123);
        Employee adi = new Employee("adi","kumar",123);
        Employee ash = new Employee("ash","kumar",123);
        Employee ganesh = new Employee("ganesh","kumar",123);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(sabari);
        list.addToFront(adi);
        list.addToFront(ash);
        list.addToFront(ganesh);

        list.printList();
        System.out.println(list.getSize());


        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());


    }

}
