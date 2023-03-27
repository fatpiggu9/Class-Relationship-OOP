package session6Quiz;

import java.util.List;

public class Employer {
	String name;
	String industry;
	private List<Person> employee;
	
	Employer(String name, String industry, List<Person> employee){
		this.name = name;
		this.industry = industry;
		this.employee = employee;
	}
	public void getEmployerName() {
		for(Person p:employee) {
			System.out.println(p.name);
		}
		
	}
}
