package javasample1;


public class EmployeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employeewage")
                int IS_PRESENT=1;
		
		double empcheck=Math.floor(Math.random()*10)%2;
		
		if(empcheck==IS_PRESENT) {
			
			System.out.println("Employee is Present");
			
		}else {
			System.out.println("Employee is absent"); 
            }
      }
}
