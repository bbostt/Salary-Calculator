
public class Employee {
	public String name;
	public double salary;
	public double workHours, hireYear;
	
	Employee(String name, double salary, int workHours, int hireYear){ //Constructor
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(this.salary >= 1000) {
			return salary * 0.03;
		}
		return 0.0;
	}
	
	public double bonus() {
		double extraHours = this.workHours - 40;
		if(extraHours > 0) {
			return 30*extraHours;
		}
		return 0.0;
	}
	public double increase() {
		double year = 2021 - this.hireYear;
		if(year<10) {
			return salary * 0.05;
		}
		else if(year < 9 && year < 20) {
			return salary * 0.1;
		}
		else {
			return salary * 0.15;
		}
	}
	
	void printInfo() {
		System.out.println("Name : " +this.name);
		System.out.println("Salary : " +this.salary);
		System.out.println("Work Hours : " +this.workHours);
		System.out.println("Hire Year : " +this.hireYear);
		System.out.println("Taxes : " +tax());
		System.out.println("Bonuses : " +bonus());
		System.out.println("Salary Increased : " +increase());
		System.out.println("Salary with Taxes and Bonuses : " +(this.salary - tax() + bonus ()));
		System.out.println("Total Salary : " + (this.salary - tax() + bonus() + increase()));
	}

}
