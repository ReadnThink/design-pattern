package designpatterns.factory.ingredient;

import designpatterns.factory.ingredient.interfaces.Clams;
import designpatterns.factory.ingredient.interfaces.Veggies;

public class FrozenClams implements Clams {

	public String toString() {
		return "Frozen Clams from Chesapeake Bay";
	}

	public static class Onion implements Veggies {

		public String toString() {
			return "Onion";
		}
	}

	public static class Mushroom implements Veggies {

		public String toString() {
			return "Mushrooms";
		}
	}
}
