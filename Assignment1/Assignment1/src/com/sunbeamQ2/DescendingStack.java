package com.sunbeamQ2;

public class DescendingStack {
	public int[] arr;
	public final int SIZE;
	public int top;

	public DescendingStack(int size) {
		SIZE=size;
		arr=new int[SIZE];
		top=SIZE-1;
	}

	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is FUll");
		}else {
			arr[top]=element;
			top--;
		}
	}

	public int pop() {
		int temp=-1;
		if(isEmpty()) {
			System.out.println("STack is Empty");
		}else {
			temp=arr[top+1];
			top++;
		}
		return temp;
	}

	public int peek() {
		int temp=-1;
		if(isEmpty()) {
			System.out.println("STack is Empty");
		}else {
		  temp=arr[top+1];	
		}
		return temp;
	}
	public boolean isEmpty() {
		return (top==SIZE-1);
	}

	public boolean isFull() {
		return (top==-1);
	}
}
