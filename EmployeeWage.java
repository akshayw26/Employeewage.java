package employeeWage;

public class EmployeeWage {
	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Emp_Rate_Per_Hours = 20;
	public static final int Num_of_Working_Days = 20 ;
	public static void main(String[] args) { 
	//Variables
	int empHrs = 0;
	int empWage = 0;
	int totalEmpWage = 0;
	//Computation
	for ( int day = 0; day < Num_of_Working_Days; day++ ) {
	int empCheck =(int)Math.floor(Math.random()*10)%3;
	switch (empCheck) {
	 case Is_Part_Time: 
		empHrs = 4;
		  break;
	 case Is_Full_Time:
		empHrs = 8;
		break;
	 default :
		empHrs = 0;
	}
	empWage = empHrs * Emp_Rate_Per_Hours;
    totalEmpWage += empWage;
		System.out.println("Emp Wage: " +empWage);
	}
	    System.out.println("Total Emp Wage: " +totalEmpWage);

  }
}
