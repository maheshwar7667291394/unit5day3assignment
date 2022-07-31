package Day3assignmentquestion2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
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
		
		  List<Student> stud=student
		  .stream()
		  .filter(item->item.getMarks()<800)
		  .collect(Collectors.toList());
		  System.out.println("filtered student who have less than 800 marks");
		  
		  for(Student ite:stud) {
			  System.out.println(ite.getName());
		  }
	}

}
