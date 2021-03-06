import java.util.List;
public class Student {
int id;
String name;
List<Subject> subjects;
public Student(int id, String name, List<Subject> subjects) {
	super();
	this.id = id;
	this.name = name;
	this.subjects = subjects;
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
public List<Subject> getSubjects() {
	return subjects;
}
public void setSubjects(List<Subject> subjects) {
	this.subjects = subjects;
}
public void display() {
	System.out.println("The Details of Student is:\nStudent Id:"+this.getId()+"\nStudent Name:"+this.getName()+"\nSubjects:");
	for(Subject sub:this.getSubjects()) {
		System.out.println(sub.getName());
	}
}
}
