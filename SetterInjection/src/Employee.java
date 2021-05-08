
public class Employee {
int empid;
String name;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void display() {
	System.out.println("Id:"+this.getEmpid()+"\nName:"+this.getName());
}
}
