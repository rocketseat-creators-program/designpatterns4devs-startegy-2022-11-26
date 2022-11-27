package calculator.after;

import calculator.after.strategies.AdditionOperation;
import calculator.after.strategies.DivisionOperation;
import calculator.after.strategies.MultiplicationOperation;
import calculator.after.strategies.SubtractionOperation;

public class Client {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}

}
