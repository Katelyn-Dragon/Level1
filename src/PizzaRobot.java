public class PizzaRobot {
	
	private boolean isOnDiet;
	private double allowance;
	private String name;
	private int tasteLevel;
	
	public PizzaRobot(boolean isOnDiet, double allowance, String name, int tasteLevel) {
		this.isOnDiet = isOnDiet;
		this.allowance = allowance;
		this.name = name;
		this.tasteLevel = tasteLevel;
	}
}