package com.bayareala8s.datastructuresalgorithms;

public class TestQueueA {

	public static void main(String[] args) {
		QueueA q = new QueueA();

		Customer himanshu = new Customer(42,"Himanshu", "Bhadra");
		q.enqueue(himanshu);

		Customer vasuki = new Customer(42,"Vasuki", "Bhadra");
                q.enqueue(vasuki);

		Customer ishita = new Customer(12,"Ishita", "Bhadra");
                q.enqueue(ishita);


		q.display();

	}

}



