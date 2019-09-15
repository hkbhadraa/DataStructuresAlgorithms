package com.bayareala8s.datastructuresalgorithms;
import java.util.NoSuchElementException;

public class QueueA {
	private Customer[] queueArray;
	private int front;
	private int rear;

	public QueueA() {
		queueArray = new Customer[10];
		front = -1;
		rear = -1;
	}

	public QueueA(int maxSize) {
		queueArray = new Customer[maxSize];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return (front == -1 || front == rear + 1);
	}

	public boolean isFull() {
		return (rear == queueArray.length - 1);
	}

	public int size() {
		if(isEmpty())
			return 0;
		else
			return rear - front + 1;
	}

	public void enqueue(Customer customer) {
		if(isFull()) {
			System.out.println("Queue overflow\n");
			return;
		}
		if(front == -1)
			front = 0;
		rear = rear + 1;
		queueArray[rear] = customer;
	}

	public Customer dequeue() {
		Customer customer;
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			throw new NoSuchElementException();
		}
		customer = queueArray[front];
		front = front + 1;
		return customer;
	}

	public Customer peek() {
		if(isEmpty()) {
			System.out.println("Queue Underflow\n");
			throw new NoSuchElementException();
		}
		return queueArray[front];
	}


	public void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Queue is empty\n");
			return;
		}
	
		System.out.println("Queue is :\n\n");
		for(i = front; i <= rear; i++) {
			System.out.println("Customer first name: " + queueArray[i].getFirstName() + " ");
			System.out.println("Customer last name: " + queueArray[i].getLastName() + " ");
			System.out.println("Customer age: " + queueArray[i].getAge() + " ");
			System.out.println();
		}

		System.out.println();

	}
}
