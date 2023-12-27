package O_Deitel_Java.POO_Polimorfismo;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialsecurityNumber;

	public Employee(String firstName, String lastName, String socialsecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialsecurityNumber = socialsecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialsecurityNumber() {
		return socialsecurityNumber;
	}

	public void setSocialsecurityNumber(String socialsecurityNumber) {
		this.socialsecurityNumber = socialsecurityNumber;
	}

	// O método abstract deve ser sobrescrito pelas subclasses concretas
	public abstract double earnings();

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialsecurityNumber="
				+ socialsecurityNumber + "]";
	}

}
