package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] basicArray = getIntegers(5);
        printArray(basicArray);
        int[] newArray =  sortArray(basicArray);
        printArray(newArray);

    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " has a value of " + array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Type " + number + " numbers to put in array: \r");
        int[] basicArray = new int [number];
        for(int i = 0; i < basicArray.length; i++){
            basicArray[i] = scanner.nextInt();
        }
        return basicArray;
    }

    public static int[] sortArray(int[] array){
//        int[] newArray = new int[array.length];
//        for(int i = 0; i<array.length;i++) {
//            newArray[i] = array[i];
//        }
        // Arrays.copyOf makes a copy of array.
        int[] newArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0;i<newArray.length-1; i++){
                if(newArray[i] < newArray[i+1]){
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }

}
