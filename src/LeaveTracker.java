
public class LeaveTracker {

public static void main (String [] args) {	
	
	Employee emp1 = new Employee(1, "Alice", "HR");
	Employee emp2 = new Employee(2, "Bob", "IT");
	
    LeaveRequest req = new LeaveRequest(01, emp1, "2025-09-01", "2025-09-01");
    
    System.out.println("Employee:" + emp1.getName());
    System.out.println("Initial Leave Balance : " + emp1.getLeaveBalance());
    
    emp1.requestLeave(5);
    System.out.println("Leave balance after 5 days leave: " + emp1.getLeaveBalance());
    
    emp1.requestLeave(30);
    System.out.println("Leave balance after failed attempt: " + emp1.getLeaveBalance());
    
    System.out.println("\nLeave Request Details:");
    System.out.println("Request ID: " + req.getRequestId());
    System.out.println("Employee: " + req.getEmployee().getName());
    System.out.println("Start Date: " + req.getStartDate());
    System.out.println("End Date: " + req.getEndDate());
    System.out.println("Status: " + req.getStatus());
    
    

	
}
	
}
