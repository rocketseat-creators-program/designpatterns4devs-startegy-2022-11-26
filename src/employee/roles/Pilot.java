package employee.roles;

import employee.strategies.eat.MeatFoodStrategy;
import employee.strategies.transportation.AirplaneStrategy;
import employee.strategies.work.PilotStrategy;

public class Pilot implements Employee {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new AirplaneStrategy().move();
	}

	@Override
	public void work() {
		new PilotStrategy().work();
	}

}
