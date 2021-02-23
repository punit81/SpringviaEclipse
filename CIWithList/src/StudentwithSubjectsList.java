import java.util.List;
public class StudentwithSubjectsList {
int id;
String name;
List<String> subjects;
public StudentwithSubjectsList(int id, String name, List<String> subjects) {
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
public List<String> getSubjects() {
	return subjects;
}
public void setSubjects(List<String> subjects) {
	this.subjects = subjects;
}
public void display() {
	System.out.println("The Details of Student is:\nStudent Id:"+this.getId()+"\nStudent Name:"+this.getName()+"\nSubjects:"+this.getSubjects());
}
}
