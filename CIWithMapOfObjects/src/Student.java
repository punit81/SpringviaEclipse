import java.util.Map;

public class Student {
int id;
String name;
Map<Subject,Integer>marksheet;
public Student(int id, String name, Map<Subject, Integer> marksheet) {
	super();
	this.id = id;
	this.name = name;
	this.marksheet = marksheet;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Map<Subject, Integer> getMarksheet() {
	return marksheet;
}
public void setMarksheet(Map<Subject, Integer> marksheet) {
	this.marksheet = marksheet;
}
public void display() {
	System.out.println("------------------------------------\nMarksheet\n------------------------------------");
	System.out.println("Student ID:"+this.getId()+"\nStudent Name:"+this.getName());
	System.out.println("------------------------------------------------------------\nSubject                    Marks\n------------------------------------------------------------");
	for(Map.Entry<Subject,Integer>subjectMark:marksheet.entrySet()) {
		System.out.print(subjectMark.getKey().getSubjectName());
		for(int i=0;i<29-subjectMark.getKey().getSubjectName().length()-subjectMark.getValue().toString().length();i++) {
			System.out.print(" ");
		}
		System.out.print(subjectMark.getValue()+"\n");
	}
}
}
