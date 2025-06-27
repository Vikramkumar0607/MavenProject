package assignment;

public class Assignment_Arrays {

	public static void main(String[] args) {

		//Array data type can store multiple values with similar  data type together at one place

		//Syntax to initialize  array : DataType [] variable ={value1 ,value2,value3};

		//1D Array Semester
		String[] Semester = {"sem1","sem2","sem3","sem4","sem5"};

		//1D Array Semester Subjects
		String[] Sem1_subjects= {"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing", "Basic Electrical Eng."};
		String[] Sem2_subjects= {"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics", "Engineering Graphics"};
		String[] Sem3_subjects= {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems", "Object-Oriented Prog."};
		String[] Sem4_subjects= {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.", "Software Engineering"};
		String[] Sem5_subjects= {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems", "Computer Graphics"};

		//1D Arrary marks for sem subject wise
		String[] Sem1_marks= {"(78)", "(85)", "(21)", "(74)", "(88)","(79)"};
		String[] Sem2_marks= {"(82)", "(77)", "(93)", "(19)", "(24)","(90)"};
		String[] Sem3_marks= {"(88)", "(81)", "(76)", "(32)", "(85)","(78)"};
		String[] Sem4_marks= {"(91)", "(73)", "(19)", "(80)", "(76)","(87)"};
		String[] Sem5_marks= {"(86)", "(88)", "(84)", "(95)", "(73)","(90)"};

		//1D Arrary Subject status sem wise
		String[] Sem1_passmarks= {"Pass", "Pass", "Fail", "Pass", "Pass","Pass"};
		String[] Sem2_passmarks= {"Pass", "Pass", "Pass", "Fail", "Fail","Pass"};
		String[] Sem3_passmarks= {"Pass", "Pass", "Pass", "Fail", "Pass","Pass"};
		String[] Sem4_passmarks= {"Pass", "Pass", "Fail", "Pass", "Pass","Pass"};
		String[] Sem5_passmarks= {"Pass", "Pass", "Pass", "Pass", "Pass","Pass"};

		//2D Array of Subjects and Marks 
		String[][] Sem1_Subject_Marks= {Sem1_subjects,Sem1_marks};
		String[][] Sem2_Subject_Marks= {Sem2_subjects,Sem2_marks};
		String[][] Sem3_Subject_Marks= {Sem3_subjects,Sem3_marks};
		String[][] Sem4_Subject_Marks= {Sem4_subjects,Sem4_marks};
		String[][] Sem5_Subject_Marks= {Sem5_subjects,Sem5_marks};

		//2D Array of Subject status and Semester 
		String[][] Sem1_Status_Sem= {Semester,Sem1_passmarks};
		String[][] Sem2_Status_Sem= {Semester,Sem2_passmarks};
		String[][] Sem3_Status_Sem= {Semester,Sem3_passmarks};
		String[][] Sem4_Status_Sem= {Semester,Sem4_passmarks};
		String[][] Sem5_Status_Sem= {Semester,Sem5_passmarks};

		//3D array 
		String[][][] Sem1_Subject_MS= {Sem1_Subject_Marks,Sem1_Status_Sem};
		String[][][] Sem2_Subject_MS= {Sem2_Subject_Marks,Sem2_Status_Sem};
		String[][][] Sem3_Subject_MS= {Sem3_Subject_Marks,Sem3_Status_Sem};
		String[][][] Sem4_Subject_MS= {Sem4_Subject_Marks,Sem4_Status_Sem};
		String[][][] Sem5_Subject_MS= {Sem5_Subject_Marks,Sem5_Status_Sem};

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Semester 4  subject name is "+Sem4_Subject_MS[0][0][3] +" and marks "+Sem4_Subject_MS[0][1][3]);
		System.out.println("Semester 4  subject name is "+Sem4_Subject_MS[0][0][5] +" and marks "+Sem4_Subject_MS[0][1][5]);

		//Print Semester 2 Subject 4 and Subject 5 names. 
		System.out.println("Semester  2 subject 4 name is " +Sem2_Subject_MS[0][0][3]);
		System.out.println("Semester  2 subject 5 name is " +Sem2_Subject_MS[0][0][4]);




	}

}
