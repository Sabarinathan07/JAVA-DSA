package com.sabari.singlyLinkedList;

public class Main {

    public static void main(String[] args) {

        Employee sabari = new Employee("Sabari","Nathan",123);
        Employee adi = new Employee("adi","kumar",123);
        Employee ash = new Employee("ash","kumar",123);
        Employee ganesh = new Employee("ganesh","kumar",123);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(sabari);
        list.addToFront(adi);
        list.addToFront(ash);
        list.addToFront(ganesh);

        System.out.println(list.getSize());

        list.printList();

//        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.printList();


//        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.printList();


    }
}
