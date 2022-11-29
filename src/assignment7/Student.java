package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String first;
	private String last;
	private int ID;
	private double bearBucksBalance;

	public Student(String firstName, String lastName, int id) {
		first = firstName;
		last = lastName;
		ID = id;
	}

	public String getFullName() {
		return first + " " + last;
	}

	public int getId() {
		return this.ID;
	}

	public void depositBearBucks(double amount) {
		this.bearBucksBalance += amount;
	}

	public double getBearBucksBalance() {
		return this.bearBucksBalance;
	}
}
