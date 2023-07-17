package designpatterns.adapter;

import designpatterns.adapter.adapters.TurkeyAdapter;
import designpatterns.adapter.duck.MallardDuck;
import designpatterns.adapter.duck.WildTurkey;
import designpatterns.adapter.interfaces.Duck;
import designpatterns.adapter.interfaces.Turkey;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("칠면조가 말하길...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\n오리가 말하길...");
		testDuck(duck);

		System.out.println("\n칠면조 어댑터가 말하길...");
		testDuck(turkeyAdapter);
		
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
