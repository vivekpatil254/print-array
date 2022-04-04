package com.bridgelabz;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int i;
        int numbers[]=new int[10];
	Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the number of elements in array");
    int numberOfElementsInArray=scanner.nextInt();
        System.out.println("Enter "+numberOfElementsInArray+" elements in array");
        for (i=0;i<numberOfElementsInArray;i++)
        {
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Array Elements are : ");
        for (i=0;i<numberOfElementsInArray;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
