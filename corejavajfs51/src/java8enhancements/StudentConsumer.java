package java8enhancements;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StudentConsumer {
	
	public static void main(String[] args) {
		
		Student student = new Student("Akash", 70);
		
		Consumer<Student> addBonusMarks = s->s.setMarks(s.getMarks()+10);
		
		System.out.println("Before adding bonus mark: "+student.getMarks());
		
		addBonusMarks.accept(student);
		
		System.out.println("After adding bonus mark: "+student.getMarks());
		
		
		BiConsumer<String,Integer> updateStudent =
				(newName,newMarks)-> {
					student.setName(newName);
					student.setMarks(newMarks);
				};
				
				
		updateStudent.accept("Akash Kumar",100);
		System.out.println(student);
		
	}

}
