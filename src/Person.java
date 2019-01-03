

import java.time.LocalDate;

public class Person {
	
	private String firstName;
	private String lastName;
	private Integer ID;
	private LocalDate birthDate;
	
	public Person(String firstName, String lastName, Integer ID, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.birthDate = birthDate;
	}
	
	

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", ID=" + ID + ", birthDate=" + birthDate
				+ "]";
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

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	} 

}
