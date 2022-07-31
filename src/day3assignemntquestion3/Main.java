package day3assignemntquestion3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import day3assignment.Student;

public class Main {
	
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		student.add(new Student("babumahesh",34,950));
		student.add(new Student("ramukak",45,850));
		student.add(new Student("gajni",40,500));
		student.add(new Student("sohel khan",20,610));
		student.add(new Student("santosh",60,734));
		
		
				
		List<Employee> lis=student
		.stream()
		.map(item->{
			return new Employee(item.getRoll(),item.getName(),item.getMarks()*1000);
		})			 
		.collect(Collectors.toList());
		for(Employee itema:lis) {
			System.out.println(itema.getEmpId());
			System.out.println(itema.getEmpName());
			System.out.println(itema.getSalary());
			System.out.println("============");
		}
		
	}

}
