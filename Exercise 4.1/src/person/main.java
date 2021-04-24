package person;

public class main {

	public static void main(String[] args) {
		 
		PersonList a = new PersonList();
		System.out.println("Name :" + a.getname());
		System.out.println("Age :" + a.getage());
		System.out.println("Gender :" + a.getgender());
		System.out.println("Weight :" + a.getweight());
		System.out.println("Height :" + a.getheight());
		System.out.println("Bmi :" + a.getBmi());
		System.out.println("Occupation :" + a.getjob() );
		System.out.println("Salary :" + a.getSalary());
		System.out.println("Salary per day :" + a.calculateSalaryperday());
		
	}
}

