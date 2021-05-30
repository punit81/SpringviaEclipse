
public class Bean2 {
	Bean1 b1;
	public Bean2(Bean1 b1) {
		this.b1=b1;
		System.out.println("Bean2 is created.......(Constructor1)!");
	}
	public Bean2(Bean1 b1,String s1) {
		this.b1=b1;
		System.out.println("Bean2 is created.......(Constructor2)!");
	}
	public void print1() {
		System.out.println("Printing of Bean2......!");
		b1.print();
	}
}
