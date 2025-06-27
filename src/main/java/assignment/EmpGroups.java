package assignment;

public class EmpGroups extends Employees { // child class before extends, parent is after extends

	public static void main(String[] args) {
		// Parent class object
		Employees emp = new Employees();

		// Employee Name array

		String[] EmployeeName = { emp.Employeeone, emp.Employeetwo, emp.Employeethree, emp.Employeefour };
		// Employee id array
		int[] EmployeeIDs = { emp.Employeeone_ID, emp.Employeetwo_ID, emp.Employeethree_ID, emp.Employeefour_ID };

		// print each employee's name along with their corresponding ID.
		System.out.println("Employee Name: " + EmployeeName[0] + ", Employee ID: " + EmployeeIDs[0]);
		System.out.println("Employee Name: " + EmployeeName[1] + ", Employee ID: " + EmployeeIDs[1]);
		System.out.println("Employee Name: " + EmployeeName[2] + ", Employee ID: " + EmployeeIDs[2]);
		System.out.println("Employee Name: " + EmployeeName[3] + ", Employee ID: " + EmployeeIDs[3]);

	}

}
