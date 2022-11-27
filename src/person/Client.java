package person;

import person.strategies.eat.MeatFoodStrategy;
import person.strategies.eat.VeggieFoodStrategy;
import person.strategies.transportation.AirplaneStrategy;
import person.strategies.transportation.BikeStrategy;
import person.strategies.transportation.CarStrategy;
import person.strategies.transportation.WalkStrategy;
import person.strategies.work.DeveloperStrategy;
import person.strategies.work.NoWorkStrategy;
import person.strategies.work.PilotStrategy;

public class Client {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person jhon = new Person("Ana", new MeatFoodStrategy(), 
				new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhon);
		
		Person ann = new Person("Erick", new MeatFoodStrategy(), 
				new AirplaneStrategy(), new PilotStrategy());
		presentYourself(ann);
		
		Person carol = new Person("Julie", new VeggieFoodStrategy(), 
				new BikeStrategy(), new DeveloperStrategy());
		presentYourself(carol);
		
		Person alan = new Person("Spock", new VeggieFoodStrategy(), 
				new WalkStrategy(), new NoWorkStrategy());
		presentYourself(alan);
	}
}
