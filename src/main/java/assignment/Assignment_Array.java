package assignment;

public class Assignment_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1D Array Semester
		String[] Semester1 = { "sem1", "sem2", "sem3", "sem4", "sem5" };
		String[][][] Semester = {

				{ // Semester 1
						{ "Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing",
								"Basic Electrical Eng." },
						{ "(78)", "(85)", "(21)", "(74)", "(88)", "(79)" } },

				{ // Semester 2
						{ "Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics",
								"Engineering Physics", "Engineering Graphics" },
						{ "(82)", "(77)", "(93)", "(19)", "(24)", "(90)" } },
				{ // Semester 3
						{ "Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems",
								"Signals and Systems", "Object-Oriented Prog." },
						{ "(88)", "(81)", "(76)", "(32)", "(85)", "(78)" } },
				{ // Semester 4
						{ "Algorithms", "Computer Networks", "Database Systems", "Microprocessors",
								"Communication Eng.", "Software Engineering" },
						{ "(91)", "(73)", "(19)", "(80)", "(76)", "(87)" } },
				{ // semester 5
						{ "Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation",
								"Embedded Systems", "Computer Graphics" },
						{ "(86)", "(88)", "(84)", "(95)", "(73)", "(90)" } }

		};

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Semester 3, Subject 4 : " + Semester[1][0][4]);
		System.out.println("Semester 3, Subject 4 : " + Semester[1][0][5]);

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.

		System.out.println("Semester 4, Subject 3 : " + Semester[3][0][2] + " marks: " + Semester[3][1][2]);
		System.out.println("Semester 4, Subject 3 : " + Semester[3][0][5] + " marks: " + Semester[3][1][5]);

		// When we don't know all the values to be stored in Array initially
		// Syntax to initialize array : DataType [] Variable = new DataType
		// [Length/Size] ;
		// Syntax to store values array :Variable[Index] = value;

		String[] Employee = new String[6];
		Employee[0] = "Vikram";
		Employee[1] = "Kumar";
		System.out.println(Employee[0]);

	}

}
