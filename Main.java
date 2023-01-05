
public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Bosti", 2000.0, 45, 1985);
		//emp1 objesi, Employee isimli clasýn bilgilerine eriþebiliyor
		
		/*System.out.println("Name : " +emp1.name);
		System.out.println("Tax : " +emp1.tax()); // Tax 60 olmalý
		System.out.println("Bonus :" +emp1.bonus()); // 150 olmalý
		System.out.println("Salary :" +emp1.salary); // 2000 olmalý 
		System.out.println("Increase :" +emp1.increase()); // 1000 olmalý
		double totalSalary = +emp1.salary+emp1.bonus()+emp1.increase() - emp1.tax();
		System.out.println("Total Salary :" +totalSalary); // 3090 olmalý
		*/
		
		emp1.printInfo();
		
		
		
		

	}

}
