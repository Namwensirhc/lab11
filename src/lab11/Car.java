package lab11;

import java.util.Scanner;

public class Car {

//	public static double setPrice;
//	public static int setAge;
//	public static String setModel;
//	public static String setMake;
	private String make;
	private String model;
	private int age;
	private double price;

	public Car() { // No argument constructor
		String make = "Unknown";
		String model = "Unknown";
		int age = 000;
		double price = 0000;
	}

	public Car(String make, String model, int age, double price) {
		super();
		this.make = make;
		this.model = model;
		this.age = age;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("car make = %-10s  model = %-10s age = %-10s price = % -10.2fs", make, model, age, price);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print("How many cars will you be entering");
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
}
