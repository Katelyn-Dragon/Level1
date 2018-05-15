public class Pizza {
	public static void main(String[] args) {
	Pizza pizza = new Pizza(5.00, 6, 150, "small");
	Pizza pizza2 = new Pizza(7.00, 8,  200, "medium");
	Pizza pizza3 = new Pizza(10.00, 10, 500, "large")	;
	Pizza pizza4 = new Pizza(15.00, 10, 100, "Extra Large");
	
	int first = pizza.getTastiness();
	System.out.println(first);
	pizza.setTastiness(7);
	int change = pizza.getTastiness();
	System.out.println(change);
	
	double second = pizza2.getPrice();
	System.out.println(second);
	pizza2.setPrice(8.00);
	double change2 = pizza2.getPrice();
	System.out.println(change2);
	
	}

	private double price;
	private int tastiness;
	private int calories;
	private String sizes;

	public Pizza(double price, int tastiness, int calories, String sizes) {
		this.price = price;
		this.tastiness = tastiness;
		this.calories = calories;
		this.sizes = sizes;
	}

	public double getPrice() {
		return this.price;
	}

	public int getTastiness() {
		return this.tastiness;
	}

	public int getCalories() {
		return this.calories;
	}

	public String getSizes() {
		return this.sizes;
	}

	public void setTastiness (int tastiness) {
		this.tastiness = tastiness;
	}
	public void setPrice (double price) {
		this.price = price;
	}
}