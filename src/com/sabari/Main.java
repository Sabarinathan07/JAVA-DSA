package com.sabari;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 23;
        intArray[1] = 3;
        intArray[2] = 2;
        intArray[3] = 4;
        intArray[4] = 22;
        intArray[5] = -23;
        intArray[6] = 27;

        for(int i = 0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
