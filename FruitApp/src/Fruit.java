import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	public Fruit (int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name +", price=" + price +"]";
	}
}
