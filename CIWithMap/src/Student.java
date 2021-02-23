import java.util.Map;

public class Student {
int id;
String name;
Map<String,String> subject_and_teachers;
public Student(int id, String name, Map<String, String> subject_and_teachers) {
	super();
	this.id = id;
	this.name = name;
	this.subject_and_teachers = subject_and_teachers;
}
public Map<String, String> getSubject_and_teachers() {
	return subject_and_teachers;
}
public void setSubject_and_teachers(Map<String, String> subject_and_teachers) {
	this.subject_and_teachers = subject_and_teachers;
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

public void display() {
	System.out.println("Student ID:"+this.getId()+"\nStudent Name:"+this.getName());
	System.out.println("Following are the details of the subject studied by student and the respective teachers:");
	for(Map.Entry<String, String>entry:subject_and_teachers.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}
}
