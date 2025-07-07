package assignments;

public class EmpGroups {

	public static void main(String[] args) {
		
		Employees object = new Employees();
		String [] employeeName = new String[3];
		employeeName[0]= object.employeeName1;
		employeeName[1]= object.employeeName2;
		employeeName[2]= object.employeeName3;
		
		int [] employeeId = new int[3];
		employeeId[0]=object.employeeId1;
		employeeId[1]=object.employeeId2;
		employeeId[2]=object.employeeId3;
		
		System.out.println("Employee Name :"+employeeName[0] +", Employee Id :"+ employeeId[0]);
		System.out.println("Employee Name :"+employeeName[1] +", Employee Id :"+ employeeId[1]);
		System.out.println("Employee Name :"+employeeName[2] +", Employee Id :"+ employeeId[2]);
	}

}
