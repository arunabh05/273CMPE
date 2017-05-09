package package1;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.Stack;

public class TestStack extends TestCase {
		Stack<Employee> empStack = new Stack<Employee>();
	   Employee employee1 = new Employee(11,"Rajesh",33,"Java",1993);
	   Employee employee2 = new Employee(141,"John",29,"C++",2001);
	   Employee employee3 = new Employee(211,"Albert",24,"Python",2014);
	   
	   EmpProjectArchive epa = new EmpProjectArchive();
	   //test 
	   @Test
	   public void testStack() {
	      
	      epa.pushEmp(empStack, employee1);
	      epa.getMostRecent(empStack);
	      epa.pushEmp(empStack, employee2);
	      epa.getMostRecent(empStack);
	      epa.pushEmp(empStack, employee3);
	      epa.getMostRecent(empStack);
	      epa.popEmp(empStack);
	      epa.getMostRecent(empStack);
	      epa.popEmp(empStack);
	      epa.getMostRecent(empStack);
	      epa.popEmp(empStack);
	      
	   }
	}