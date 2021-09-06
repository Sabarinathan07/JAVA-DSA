package com.sabari.stackByLinkedList;



public class Main {

public static void main(String[] args) {

    Employee sabari = new Employee("Sabari", "Nathan", 123);
    Employee adi = new Employee("adi(ac)", "kumar", 123);
    Employee ash = new Employee("ash", "kumar", 123);
    Employee ganesh = new Employee("ganesh", "kumar", 123);


    LinkedStack stack = new LinkedStack();
    stack.push(sabari);
    stack.push(adi);
    stack.push(ash);
    stack.push(ganesh);

    stack.printStack();

    System.out.println(stack.peek());
    //stack.printStack();

    System.out.println("Popped: " + stack.pop());
    System.out.println(stack.peek());

}
}
