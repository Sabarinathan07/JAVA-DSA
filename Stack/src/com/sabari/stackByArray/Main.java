package com.sabari.stackByArray;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        Employee sabari = new Employee("Sabari","Nathan",123);
        Employee adi = new Employee("adi","kumar",123);
        Employee ash = new Employee("ash","kumar",123);
        Employee ganesh = new Employee("ganesh","kumar",123);

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
