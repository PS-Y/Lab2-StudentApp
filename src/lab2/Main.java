package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		al.add(new Student(101, "Kim", 23));
		al.add(new Student(102, "Choi", 21));
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Lee", 22));
		al.add(new Student(105, "Yong", 28));
		al.add(new Student(106, "Jeon", 20));
		al.add(new Student(107, "Hur", 27));
		al.add(new Student(109, "Jang", 25));
		al.add(new Student(110, "Gu", 25));
		al.add(new Student(112, "Jeong", 30));
		
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
