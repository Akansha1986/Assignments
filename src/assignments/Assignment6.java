package assignments;

public class Assignment6 {
 /*Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
 marks [75, 80, 82] Add 10 marks to each students using assignment operators and
 store it into another array, after adding 10 marks identify the average marks of all
 students
 */
	
	public static void main(String[] args) {
		String[] studentInfo = {"Suresh","Mahesh","Naresh"};
		int [] marks = {75,80,82};
		int [] updatemarks = new int[3];
		float average = 0;
		for(int i= 0;i<=2;i++)
		{
			marks[i]= marks[i] + 10;
			updatemarks[i]=marks[i];
			System.out.println(studentInfo[i] +" : "+ updatemarks[i]);
			average = updatemarks[i]+average;
		}
		average = average/3;
		System.out.println("Average Marks :"+ average);
	}
	}

