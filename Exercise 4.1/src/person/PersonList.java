package person;
import java.util.Scanner;
	public class PersonList extends Person{
		Scanner sc = new Scanner(System.in);
	
		private double weight,height,bmi,salary,days,salaryperday;
		private String Occupation;
		private char ans;
		PersonList(){
			super ();
			System.out.print("Please enter your weight(in kg): ");
			this.weight=sc.nextDouble();
			System.out.print("Please enter your height(in m): ");
			this.height=sc.nextDouble();
			System.out.print("Are you working? (y or n)");
			this.ans=sc.next().charAt(0);;
			while (this.ans != 'y' && this.ans != 'n') {
				System.out.println("Wrong input! Please input y or n only!");
				System.out.print("Are you working?(y/n): ");
				this.ans = sc.next().charAt(0);;
			}
		}
		
		double getBmi() {
			this.bmi= this.weight/(this.height* this.height);
			
			if(this.bmi>30) {
				System.out.println("You are Obesity!!!");
			}
			else if(this.bmi>=25 && this.bmi==30) {
				System.out.println("You are Overweight");
			}
		    else if(this.bmi<25 && this.bmi== 18) {
				System.out.println("You are Normal");
		    }
			else {
				System.out.println("You are Underweight");
			}
			return this.bmi;	
		}
		
		String getjob() {
			if (this.ans == 'y') {
				System.out.println("Please enter your job :");
				this.Occupation=sc.next();
			}
			else if (this.ans == 'n') {
				System.out.println("Please enter what is there doing (studying / unemployed) :");
				this.Occupation=sc.next();
			}
			return this.Occupation;
		}
		
		double getSalary() {
			if (this.ans == 'y') {
				System.out.println("Please enter your salary per month :");
				this.salary=sc.nextDouble();
			}
			else if (this.ans == 'n') {
				this.Occupation=sc.next();
				this.salary=0;
			}
			return this.salary;
		}
		double calculateSalaryperday() {
			System.out.println("How many days do you work in a month :");
			this.days=sc.nextDouble();
			this.salaryperday= this.salary/this.days;
			return this.salaryperday;
		}
		
		public double getheight() {
			  return this.height;
		  }
		public double getweight() {
			  return this.weight;
		  }
}
