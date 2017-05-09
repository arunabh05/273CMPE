package package1;

import java.util.*;

public class EventQueue {

	 void offerCust(Queue<Customer> custQueue, Customer cust) {
		if (custQueue.contains(cust)) {
			System.out.println("Customer is already in queue");
		} else {
			custQueue.offer(cust);
			// System.out.println("Queue:" + custQueue);
			System.out.print("Event Current Queue Position :");

			for (Customer c : custQueue) {
				System.out.print(c.getId() + "<--");
			}
			System.out.println("");
		}
	}

	 void removeCust(Queue<Customer> custQueue, Customer cust) {

		custQueue.remove(cust);

		// System.out.println("Queue:" + custQueue);
		System.out.print("Event Current Queue Position :");
		for (Customer c : custQueue) {
			System.out.print(c.getId() + "<--");

		}
		System.out.println("");
	}

	public static void main(String args[]) {

		Queue<Customer> custQueue = new PriorityQueue<Customer>(10, new Comparator<Customer>() {

			@Override
			public int compare(Customer cust1, Customer cust2) {
				// TODO Auto-generated method stub
				if (cust1.getId() > cust2.getId()) {
					// System.out.println("comparison" + cust1.getId() + " and "
					// + cust2.getId());
					return 1;
				} else if (cust1.getId() < cust2.getId()) {
					// System.out.println("comparison" + cust1.getId() + " and "
					// + cust2.getId());
					return -1;
				} else {
					// System.out.println("comparison" + cust1.getId() + " and "
					// + cust2.getId());
					return 0;
				}
			}
		});
		
		EventQueue eq = new EventQueue();
		
		Customer cust1 = new Customer(101, "ABC", "abc@abc.com", "123", "ABC123");
		Customer cust2 = new Customer(102, "DEF", "def@abc.com", "456", "DEF123");
		Customer cust3 = new Customer(301, "GHI", "ghi@abc.com", "789", "GHI123");
		Customer cust4 = new Customer(202, "JKL", "jkl@abc.com", "012", "JKL123");
		Customer cust5 = new Customer(1, "MNO", "mnoc@abc.com", "345", "MNO123");
		Customer cust6 = new Customer(201, "XYZ", "mnoc@abc.com", "345", "MNO123");

		eq.offerCust(custQueue, cust4);
		eq.offerCust(custQueue, cust3);
		eq.offerCust(custQueue, cust2);
		eq.offerCust(custQueue, cust1);
		eq.offerCust(custQueue, cust5);
		eq.removeCust(custQueue, cust1);
		eq.offerCust(custQueue, cust1);
		eq.offerCust(custQueue, cust6);
		// System.out.println("hello");

		while (true) {
			Customer c1 = custQueue.poll();
			if (c1 == null) {
				break;
			}
			System.out.print(c1.getId() + " <-- ");
		}
	}
}
