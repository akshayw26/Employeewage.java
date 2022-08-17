package javasample1;


public class EmployeeWage{
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employeewage");
		
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int WagePerHours=20;
		//Variables
		int empHrs=0;
		int empwage=0;
		
		double empcheck=Math.floor(Math.random()*10)%3;
	
		if(empcheck==IS_FULL_TIME) {
			empHrs=8;
			System.out.println("Employee is Present as Fulltime");
		}else if(empcheck==IS_PART_TIME)	{
			
			empHrs=4;
			System.out.println("Employee is Present as Parttime");
		}else {
			System.out.println("Employee is absent");
	
		}
		
		empwage=empHrs*WagePerHours;
		System.out.println("Employe wage = " +empwage);
	 }
  }


