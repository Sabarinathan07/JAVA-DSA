package com.sabari.sortingAlgorithms;

import java.util.Arrays;

public class jdkSorting {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        Arrays.parallelSort(intArray); //For large elements more than 1 million
//        Arrays.sort(intArray);       //For smaller elements

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
