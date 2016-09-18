package package1;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCollections extends TestCase {

	@Test
	public void testCollections() {

		ArrayListExample ale = new ArrayListExample();
		BankCustomer bCust1 = new BankCustomer("Abhay", 101, "Checking", "123321", 1231);
		BankCustomer bCust2 = new BankCustomer("Ben", 206, "Current", "131321", 77656);
		BankCustomer bCust3 = new BankCustomer("Carl", 105, "Current", "122321", 2001);
		BankCustomer bCust4 = new BankCustomer("Dinesh", 204, "Checking", "126521", 1001);
	
		ArrayList<BankCustomer> bankCustList = new ArrayList<BankCustomer>();
		bankCustList.add(bCust1);
		bankCustList.add(bCust2);
		bankCustList.add(bCust3);
		bankCustList.add(bCust4);
	
		
		 ArrayList<BankCustomer> checkingCust =	ale.getCheckingAccCustomer(bankCustList);
	
		 for(BankCustomer c: checkingCust)
		 {
			System.out.println(c.getAccNo()+"->"+c.getName()+"->"+c.getAccType()); 
		 }
		 
		 
	
	}
}

	
	
