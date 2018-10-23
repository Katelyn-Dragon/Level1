public class Avacado {

	private boolean ripe;
	private double price;
	private int orchards;

	public static void main(String[] args) {

	}

	public void Avacado(boolean ripe, double price, int orchards) {
		this.ripe = ripe;
		this.price = price;
		this.orchards = orchards;
	}

	public double getPrice() {
		return this.price;
	}

	public int getOrchards() {
		return this.orchards;
	}
	
}
