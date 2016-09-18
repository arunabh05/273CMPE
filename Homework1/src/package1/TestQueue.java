package package1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

import junit.framework.TestCase;

public class TestQueue extends TestCase {
	Customer cust1 = new Customer(101, "ABC", "abc@abc.com", "123", "ABC123");
	Customer cust2 = new Customer(102, "DEF", "def@abc.com", "456", "DEF123");
	Customer cust3 = new Customer(301, "GHI", "ghi@abc.com", "789", "GHI123");

	EventQueue eq = new EventQueue();

	@Test
	public void testQueue() {
		Queue<Customer> custQueue = new PriorityQueue<Customer>(10, new Comparator<Customer>() {

			@Override
			public int compare(Customer cust1, Customer cust2) {
				// TODO Auto-generated method stub
				if (cust1.getId() > cust2.getId()) {
					return 1;
				} else if (cust1.getId() < cust2.getId()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		eq.offerCust(custQueue, cust3);
		eq.offerCust(custQueue, cust2);
		eq.offerCust(custQueue, cust1);
		eq.removeCust(custQueue, cust1);

	}
}