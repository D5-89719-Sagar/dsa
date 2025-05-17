package com.sunbeamQ1;

public class LinearQueue {
	private int[] arr;
	private int front,rear;
	private final int SIZE;

	public LinearQueue(int size) {
		SIZE=size;
		arr=new int[SIZE];
		front=rear=0;
	}

	public void push(int element) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}else {
			arr[rear]=element;
			rear++;
		}
	}

	public int pop() {
		int temp=-1;
	if(isEmpty()) {
		System.out.println("Queue is EMpty");
	}else {
	  temp=arr[front];
	  front++;
	  
	  if(front==rear) {
		  front=rear=0;
	  }
	}
	return temp;
	}

	public int peek() {
		int temp=-1;
		if(isEmpty()) {
			System.out.println("Queue is EMpty");
		}else {
			temp=arr[front];
		}
		return temp;
		}
	public boolean isEmpty() {
		return (front==0)&&(rear==0);
	}

	public boolean isFull() {
		return (rear==SIZE && front==0);
	}
}
