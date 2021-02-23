 class Address{
	String city;
	String state;
	int pincode;
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void display() {
		System.out.println("City:"+this.getCity()+"\nState:"+this.getState()+"\nPincode:"+this.getPincode());
	}
}
public class EmployeeWithAddress{
int empid;
String name;
Address address;
public EmployeeWithAddress(int empid, String name, Address address) {
	super();
	this.empid = empid;
	this.name = name;
	this.address = address;
}
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void display() {
	System.out.println("Employee detail is:\nId:"+this.getEmpid()+"\nName:"+this.getName());
	this.getAddress().display();
}
}
