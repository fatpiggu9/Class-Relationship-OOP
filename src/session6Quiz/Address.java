package session6Quiz;

import java.util.List;

public class Address {
	String street;
	String city;
	String state;
	private List<Person> employee;
	
	Address(String street, String city, String state, List<Person> employee) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.employee = employee;
	}
	public void getResidentName() {
		for(Person p: employee) {
			System.out.println(p.name);
		}
	}
}
