package employee.roles;
import employee.strategies.eat.MeatFoodStrategy;
import employee.strategies.eat.VeggieFoodStrategy;
import employee.strategies.transportation.BikeStrategy;
import employee.strategies.transportation.CarStrategy;
import employee.strategies.work.DeveloperStrategy;

public class Developer implements Employee {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
