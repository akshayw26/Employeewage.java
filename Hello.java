package javasample1;


public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employeewage");
                int IS_PRESENT=1;
		int WagePerHours=20;
		int WorkingHours=8;
		
		double empcheck=Math.floor(Math.random()*10)%2;
		int empwage=WagePerHours*WorkingHours;
		if(empcheck==IS_PRESENT) {
			
			System.out.println("Employee is Present");
			System.out.println("Employe wage = " +empwage);
		}else {
			System.out.println("Employee is absent"); 
          }

     }
}
