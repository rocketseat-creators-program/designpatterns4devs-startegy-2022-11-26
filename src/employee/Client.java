package employee;

import employee.roles.Developer;
import employee.roles.Employee;
import employee.roles.HispsterDeveloper;
import employee.roles.Pilot;

public class Client {
    
    public static void presentYourself(Employee worker, String name) {
		System.out.println("Hi, I'm " + name);
		worker.eat();
		worker.move();
		worker.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Employee ana = new Developer();
		presentYourself(ana, "Jhon");
		
		Employee erick = new Pilot();
		presentYourself(erick, "Ann");

		Employee julie = new HispsterDeveloper();
		presentYourself(julie, "carol");
		
		
	}

}
