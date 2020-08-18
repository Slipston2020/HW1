package com.company;

public class Main {

    public static void main(String[] args) {
	int arr[] = {1,3,5,7,9};
	for (int i=0; i<arr.length; i++)
	    System.out.print(arr[i]+" ");
	System.out.println();
	for (int i = arr.length-1; i>=0; i--)
		System.out.print(arr[i] + " ");
    }
}
