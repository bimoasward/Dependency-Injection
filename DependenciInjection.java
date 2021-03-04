public class Test_1 {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe(new Arabica(2, 100));
		System.out.println(cafe.getCoffeeName());
		System.out.println(cafe.getTotalPrice());
		
		Cafe cafe2 = new Cafe(new Latte(100, 100));
		System.out.println(cafe2.getCoffeeName());
		System.out.println(cafe2.getTotalPrice());
	}
}

class Cafe {
	
	Coffee coffee;
	public Cafe(Coffee coffee) {
		
		this.coffee = coffee;
	}
	
	String getCoffeeName() {
		
		return coffee.getName();
	}
	
	float getTotalPrice() {
		return coffee.getTotalPrice();
	}
}

interface Coffee{
	
	String getName();
	float getTotalPrice();
}

class Arabica implements Coffee {
	
	String name = "Arabica";
	int quantity;
	int price;
	public Arabica(int quantity, int price) {
		this.quantity= quantity;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public float getTotalPrice() {
		return (float) quantity * price;
	}
}

class Latte implements Coffee {
	
	String name = "Latte";
	int quantity;
	int price;
	public Latte(int quantity, int price) {
		this.quantity= quantity;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public float getTotalPrice() {
		return (float) quantity * price;
	}
}