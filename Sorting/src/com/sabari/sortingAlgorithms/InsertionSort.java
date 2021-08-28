package com.sabari.sortingAlgorithms;

public class InsertionSort {
    public static void InsertionSort(int[] arr){

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++ ){

            int newElement = arr[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 &&  arr[i-1]> newElement;i--){
                arr[i] = arr[i-1];
            }

            arr[i] = newElement;
        }

    }



    public static void main(String[] args) {

        int[] intArray = {7,8,9,0,4};

        InsertionSort(intArray);

        for(int i =0;i< intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}
