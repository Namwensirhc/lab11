package lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String make;
		String model;
		int age;
		double price;
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		// System.out.println("How many cars will you be entering?");
		Car.getInt(sc, "How many car will you be entering?");
		int amountCars = sc.nextInt();
		System.out.println(amountCars);
		Car[] cars = new Car[amountCars];

		System.out.println("Now I need the data for each car");
		for (int i = 0; i < amountCars; i++) {
			int num = i + 1;
			System.out.println("Enter make for car # " + num + "Make: ");
			String setMake = sc.next();
			System.out.println("Enter model for car # " + num + "Model: ");
			String setModel = sc.next();
			System.out.println("Enter age for car # " + num + "Age: ");
			int setAge = sc.nextInt();
			System.out.println("Enter price for car # " + num + "Price: ");
			double setPrice = sc.nextDouble();

			carList.add(new Car(setMake, setModel, setAge, setPrice));

		}
		System.out.println(carList);
	} // Came in early today but forget how i as going to fix the program plus im
		// really tired.

	public String toString(String price, String make, String age, String model) {
		return "car make = %-10s" + make + ", model = %-10s" + model + ", age = %-10s" + age + ", price = %-10s "
				+ price;
	}

}
