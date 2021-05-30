
public class Bean2 {
	Bean1 b1;
	public Bean1 getB11() {
		return b1;
	}
	public void setB11(Bean1 b1) {
		this.b1 = b1;
	}
	public Bean2(){
		System.out.println("Bean 2 is created.");
	}
	public void print1() {
		System.out.println("Hello from Bean 2");
		b1.print();
	}
}
