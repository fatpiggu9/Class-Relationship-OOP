package session6Quiz;

import java.util.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("A", 20, "E1");
		Person p2 = new Person("B", 21, "E1");
		Person p3 = new Person("C", 22, "E2");
		Person p4 = new Person("D", 23, "E3");
		
		List<Person> E1_Employee = new ArrayList<Person>();
		E1_Employee.add(p1);
		E1_Employee.add(p2);
		
		List<Person> E2_Employee = new ArrayList<Person>();
		E2_Employee.add(p3);
		
		List<Person> E3_Employee = new ArrayList<Person>();
		E3_Employee.add(p4);
		
		Employer e1 = new Employer("E1", "X1", E1_Employee);
		e1.getEmployerName();
		System.out.println("are E1's employee");
		System.out.println();
		
		Employer e2 = new Employer("E2", "X2", E2_Employee);
		e2.getEmployerName();
		System.out.println("is E2's employee");
		System.out.println();
		
		Employer e3 = new Employer("E3", "X3", E3_Employee);
		e3.getEmployerName();
		System.out.println("is E3's employee");
		System.out.println();
		
		p1.address = "Flower St";
		p2.address = "Butterfly St";
		p3.address = "Butterfly St";
		p4.address = "Flower St";
		
		List<Person> flower_st = new ArrayList<Person>();
		flower_st.add(p1);
		flower_st.add(p4);
		
		List<Person> bfly_st = new ArrayList<Person>();
		bfly_st.add(p2);
		bfly_st.add(p3);
		
		Address flowerResident = new Address("Flower St", "Garden", "Park", flower_st);
		flowerResident.getResidentName();
		System.out.println("are people who lived in Flower St.");
		System.out.println();
		
		Address bflyResident = new Address("Butterfly St", "Garden", "Park", bfly_st);
		bflyResident.getResidentName();
		System.out.println("are people who lived in Butterfly St.");
	}

}
