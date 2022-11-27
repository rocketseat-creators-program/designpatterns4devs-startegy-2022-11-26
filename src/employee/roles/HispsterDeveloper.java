package employee.roles;

import employee.strategies.eat.VeggieFoodStrategy;
import employee.strategies.transportation.BikeStrategy;
import employee.strategies.work.DeveloperStrategy;

public class HispsterDeveloper implements Employee {

	@Override
	public void eat() {
		new VeggieFoodStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
