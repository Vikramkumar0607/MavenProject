package assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Assigment_Collections {

	public static void main(String[] args) {

		// Inside this Assignment Excel There are 3 TestCases with each Testcase having
		// 3 rows of data.

		// Now, By using collections store all the data into one single variable .

		// and from that variable, Print the data Supplier Name > Office Depot from
		// Product details table.

		System.out.println("**********TreeMap************");
		Map<String, String> StudentOne = new TreeMap<String, String>();
		StudentOne.put("Name", "John Doe");
		StudentOne.put("Age", "Twenty");
		StudentOne.put("Gender", "Male");
		StudentOne.put("Roll Number", "SBA12345");
		StudentOne.put("Grade", "A++");
		StudentOne.put("Major", "Computer Science");
		StudentOne.put("GPA", "A3.8");
		StudentOne.put("Email", "john@example.com");
		StudentOne.put("PAN Number", "SDF6543210");
		StudentOne.put("Address", "123 Elm St");

		// Student Two
		Map<String, String> StudentTwo = new TreeMap<String, String>();
		StudentTwo.put("Name", "Jane Smith");
		StudentTwo.put("Age", "Twenty One");
		StudentTwo.put("Gender", "Female");
		StudentTwo.put("Roll Number", "SBA12346");
		StudentTwo.put("Grade", "B+");
		StudentTwo.put("Major", "Mathematics");
		StudentTwo.put("GPA", "A3.5");
		StudentTwo.put("Email", "jane@example.com");
		StudentTwo.put("PAN Number", "REW6543211");
		StudentTwo.put("Address", "456 Oak St");

		// Student Three
		Map<String, String> StudentThree = new TreeMap<String, String>();
		StudentThree.put("Name", "Mike Brown");
		StudentThree.put("Age", "Twenty Two");
		StudentThree.put("Gender", "Male");
		StudentThree.put("Roll Number", "SBA12347");
		StudentThree.put("Grade", "A+");
		StudentThree.put("Major", "Physics");
		StudentThree.put("GPA", "A3.9");
		StudentThree.put("Email", "mike@example.com");
		StudentThree.put("PAN Number", "REW6543212");
		StudentThree.put("Address", "789 Pine St");

		List<Map<String, String>> StudentList = new ArrayList<>();
		StudentList.add(StudentOne);
		StudentList.add(StudentTwo);
		StudentList.add(StudentThree);

		// EmployeeOne Details
		Map<String, String> EmployeeOne = new TreeMap<String, String>();
		EmployeeOne.put("Employee ID", "E001");
		EmployeeOne.put("Name", "Alice Green");
		EmployeeOne.put("Age", "Thirty");
		EmployeeOne.put("Gender", "Female");
		EmployeeOne.put("Department", "Engineering");
		EmployeeOne.put("Position", "Software Engineer");
		EmployeeOne.put("Salary", "75K Pounds");
		EmployeeOne.put("Email", "alice@example.com");
		EmployeeOne.put("PAN Number", "SDF6543210");

		// Employee Two Details
		Map<String, String> EmployeeTwo = new TreeMap<String, String>();
		EmployeeOne.put("Employee ID", "E002");
		EmployeeOne.put("Name", "Bob Johnson");
		EmployeeOne.put("Age", "Thirty Five");
		EmployeeOne.put("Gender", "Male");
		EmployeeOne.put("Department", "Marketing");
		EmployeeOne.put("Position", "Marketing Manager");
		EmployeeOne.put("Salary", "85K Pounds");
		EmployeeOne.put("Email", "bob@example.com");
		EmployeeOne.put("PAN Number", "REW6543211");

		// Employee Three Details
		Map<String, String> EmployeeThree = new TreeMap<String, String>();
		EmployeeOne.put("Employee ID", "E003");
		EmployeeOne.put("Name", "Carol White");
		EmployeeOne.put("Age", "Twenty Eight");
		EmployeeOne.put("Gender", "Female");
		EmployeeOne.put("Department", "Sales");
		EmployeeOne.put("Position", "Sales Executive");
		EmployeeOne.put("Salary", "65k Pounds");
		EmployeeOne.put("Email", "carol@example.com");
		EmployeeOne.put("PAN Number", "TYR6543212");

		List<Map<String, String>> EmployeeDetails = new ArrayList<>();
		EmployeeDetails.add(EmployeeOne);
		EmployeeDetails.add(EmployeeTwo);
		EmployeeDetails.add(EmployeeThree);

		// ProductDetails

		Map<String, String> ProductOne = new TreeMap<String, String>();
		ProductOne.put("Product ID", "P001");
		ProductOne.put("Name", "Laptop");
		ProductOne.put("Category", "Electronics");
		ProductOne.put("Price", "12K Pounds");
		ProductOne.put("Stock Quantity", "Not Available");
		ProductOne.put("Supplier", "Tech Supplies");
		ProductOne.put("Warranty", "2 years");
		ProductOne.put("Rating", "4.5 Stars");
		ProductOne.put("Manufacturing Date", "Aug 2023");
		ProductOne.put("Expiry Date", "Aug 2028");
		// ProductDetails
		Map<String, String> ProductTwo = new TreeMap<String, String>();
		ProductTwo.put("Product ID", "P002");
		ProductTwo.put("Name", "Desk Chair");
		ProductTwo.put("Category", "Furniture");
		ProductTwo.put("Price", "150K Pounds");
		ProductTwo.put("Stock Quantity", "Two");
		ProductTwo.put("Supplier", "Office Depot");
		ProductTwo.put("Warranty", "1 year");
		ProductTwo.put("Rating", "4 Stars");
		ProductTwo.put("Manufacturing Date", "Sep 2024");
		ProductTwo.put("Expiry Date", "N/A");
		// ProductDetails
		Map<String, String> ProductThree = new TreeMap<String, String>();
		ProductThree.put("Product ID", "P003");
		ProductThree.put("Name", "Coffee Maker");
		ProductThree.put("Category", "Kitchen");
		ProductThree.put("Price", "75 Pounds");
		ProductThree.put("Stock Quantity", "Two Hundred");
		ProductThree.put("Supplier", "KitchenWorld");
		ProductThree.put("Warranty", "6 months");
		ProductThree.put("Rating", "4.2 Stars");
		ProductThree.put("Manufacturing Date", "Jan 2025");
		ProductThree.put("Expiry Date", "Jan 2027");

		List<Map<String, String>> ProductDetails = new ArrayList<>();
		ProductDetails.add(ProductOne);
		ProductDetails.add(ProductTwo);
		ProductDetails.add(ProductThree);

		Map<String, List<Map<String, String>>> data = new TreeMap<String, List<Map<String, String>>>();
		data.put("Students", StudentList);
		data.put("Employees", EmployeeDetails);
		data.put("Products", ProductDetails);
		System.out.println(data.size());
		System.out.println(data.get("Products").get(1).get("Supplier"));

	}

}
