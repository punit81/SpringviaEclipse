
public class Bean2 {
	Bean1 b1;
	public Bean1 getB1() {
		return b1;
	}
	public void setB1(Bean1 b1) {
		this.b1 = b1;
	}
	public Bean2() {
		System.out.println("Bean 2 is created.....!");
	}
	public void print1() {
		System.out.println("Hello from Bean 1");
		this.b1.print();
	}
	
}

