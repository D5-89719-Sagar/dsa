package com.sunbeamQ3;

import java.util.Stack;

public class ReverseArray {
	public static int[] reverseArray(int[] arr) {
		int[] rev = new int[arr.length];
		Stack<Integer> s1 = new Stack<Integer>();
		for(int i=0; i<arr.length; i++) {
			s1.push(arr[i]);
		}
		int i=0;
		while(!s1.isEmpty()) {
			rev[i] = s1.pop();
			i++;
		}
		return rev;
	}

public static void main(String[] args) {
	int[] arr = {51,82,39,45,58,69,78,89};
	int[] rev = reverseArray(arr);
	System.out.print("Given Array : ");
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	System.out.print("Reverse array : ");
	for(int i=0;i<rev.length;i++) {
		System.out.print(rev[i]+" ");
	}
}
}
