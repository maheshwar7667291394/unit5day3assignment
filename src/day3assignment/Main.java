package day3assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		student.add(new Student("babumahesh",34,450));
		student.add(new Student("ramukak",45,450));
		student.add(new Student("gajni",40,200));
		student.add(new Student("sohel khan",20,210));
		student.add(new Student("santosh",60,234));
		
		Collections.sort(student,(s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1);
		  for(Student item:student) {
			  System.out.println(item.getName());
			  System.out.println(item.getMarks());
			  System.out.println(item.getRoll());
			  System.out.println("=======================");
		  }
		  System.out.println("student who have less than 250 marks");
		  student
		  .stream()
		  .filter(item->item.getMarks()<250)
		  .forEach(item->System.out.println(item.getName()));
	}

}
