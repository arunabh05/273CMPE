package package1;

import java.util.EmptyStackException;
import java.util.Stack;

public class EmpProjectArchive {

	 void pushEmp(Stack<Employee> empStack, Employee e) {
		empStack.push(e);
		System.out.println("Stack : " + empStack);
	}

	 void popEmp(Stack<Employee> empStack) {
		if (empStack.size() > 0) {
			empStack.pop();
			System.out.println("Stack : " + empStack);
		}
	}

	 void getMostRecent(Stack<Employee> empStack) {
		if (empStack.size() > 0) {
			System.out.println("Last Project Completed by :" + empStack.peek().getEmpId());
			System.out.println("Last Project Completed by :" + empStack.peek().getName());
			System.out.println("Last Project Completed :" + empStack.peek().getProject());
			System.out.println("Last Project Completed in :" + empStack.peek().getYear());
		}
	}

	public static void main(String args[]) {
		Employee emp1 = new Employee(1, "A", 23, "ABC", 1990);
		Employee emp2 = new Employee(2, "B", 24, "XYZ", 1995);
		Employee emp3 = new Employee(3, "C", 25, "DEF", 2001);

		EmpProjectArchive epa = new EmpProjectArchive();
		
		Stack<Employee> empStack = new Stack<Employee>();
		epa.getMostRecent(empStack);
		epa.pushEmp(empStack, emp1);
		epa.getMostRecent(empStack);
		epa.pushEmp(empStack, emp2);
		epa.getMostRecent(empStack);
		epa.pushEmp(empStack, emp3);
		epa.getMostRecent(empStack);
		epa.popEmp(empStack);
		epa.getMostRecent(empStack);
		epa.popEmp(empStack);
		epa.getMostRecent(empStack);
		epa.popEmp(empStack);
		epa.getMostRecent(empStack);
		epa.popEmp(empStack);
		epa.getMostRecent(empStack);
		epa.popEmp(empStack);
		try {
			epa.popEmp(empStack);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
}