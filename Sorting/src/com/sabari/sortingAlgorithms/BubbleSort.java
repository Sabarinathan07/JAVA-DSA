package com.sabari.sortingAlgorithms;

public class BubbleSort {

    public static void sort(int[] arr){

        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
            for(int i = 0;i<lastUnsortedIndex;i++){
                if(arr[i]> arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }

    }

    public static void swap(int[] arr,int i, int j){
        if(i==j){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

        int[] intArray = {23,-15,8,-45,7,9,0};

        sort(intArray);

        for(int i =0;i< intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}
