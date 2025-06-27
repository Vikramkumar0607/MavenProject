package assignment;

public class AssignmentArraysDatatypesOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] StudentName = { "Suresh", "Mahesh", "Naresh" };
		int[] marks = { 75, 80, 82 };
		marks[0] += 10;
		marks[1] += 10;
		marks[2] += 10;

		System.out.println("Updated Marks");
		System.out.println(StudentName[0] + ": " + marks[0]);
		System.out.println(StudentName[1] + ": " + marks[1]);
		System.out.println(StudentName[2] + ": " + marks[2]);

		int totalMarks = marks[0] + marks[1] + marks[2];

		System.out.println("Updated Marks Average");
		double average = totalMarks / 3;
		System.out.println("Average Marks: " + average);
	}

}
