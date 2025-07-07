package assignments;

public class Assignment2 {

	public static void main(String[] args) {
		/*Problem: Multi-Dimensional Array Practice */
			String[][][] academicData = {
				    { // Sem 1
				        {"Mathematics I", "Pass(78)"},
				        {"Physics", "Pass(85)"},
				        {"Chemistry", "Fail(21)"},
				        {"Computer Programming", "Pass(74)"},
				        {"Engineering Drawing", "Pass(88)"},
				        {"Basic Electrical Eng.", "Pass(79)"}
				    },
				    { // Sem 2
				        {"Mathematics II", "Pass(82)"},
				        {"Mechanics", "Pass(77)"},
				        {"Environmental Sci.", "Pass(93)"},
				        {"Basic Electronics", "Fail(19)"},
				        {"Engineering Physics", "Fail(24)"},
				        {"Engineering Graphics", "Pass(90)"}
				    },
				    { // Sem 3
				        {"Data Structures", "Pass(88)"},
				        {"Discrete Mathematics", "Pass(81)"},
				        {"Digital Electronics", "Pass(76)"},
				        {"Operating Systems", "Fail(32)"},
				        {"Signals and Systems", "Pass(85)"},
				        {"Object-Oriented Prog.", "Pass(78)"}
				    },
				    { // Sem 4
				        {"Algorithms", "Pass(91)"},
				        {"Computer Networks", "Pass(73)"},
				        {"Database Systems", "Fail(19)"},
				        {"Microprocessors", "Pass(80)"},
				        {"Communication Eng.", "Pass(76)"},
				        {"Software Engineering", "Pass(87)"}
				    },
				    { // Sem 5
				        {"Probability & Stats", "Pass(86)"},
				        {"Machine Learning", "Pass(88)"},
				        {"Compiler Design", "Pass(84)"},
				        {"Theory of Computation", "Pass(95)"},
				        {"Embedded Systems", "Pass(73)"},
				        {"Computer Graphics", "Pass(90)"}
				    }
				};
			//Print Semester 2 Subject 4 and Subject 5 names.
			System.out.println("Sem 2 Subject 4: " + academicData[1][3][0]); // Basic Electronics
			System.out.println("Sem 2 Subject 5: " + academicData[1][4][0]); // Engineering Physics

			//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
			System.out.println("Sem 4 Subject 3: " + academicData[3][2][1]); // Subject 3 
			System.out.println("Sem 4 Subject 6: " + academicData[3][5][1]); // Subject 6
			};
	}



