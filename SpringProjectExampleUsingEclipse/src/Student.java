public class Student {
	String name;

	public Student() {
		super();
		this.name = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("The Student Name is: "+this.getName());
	}
}
