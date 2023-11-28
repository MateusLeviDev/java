package O_Deitel_Java.POO_Polimorfismo;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialsecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialsecurityNumber);

		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");

		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double earnings() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}

}
