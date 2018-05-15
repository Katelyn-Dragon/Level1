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
	
	public boolean getIsOnDiet() {
		return this.isOnDiet;
	}
	
	public double getAllowance() {
		return this.allowance;
	}
	
	public String getName() {
		return this.name;
	}
		
	public int TasteLevel() {
		return this.tasteLevel;
	}
	
	public void setIsOnDiet(boolean isOnDiet) {
		this.isOnDiet = isOnDiet;
	}
	
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTasteLevel(int TasteLevel) {
		this.tasteLevel = tasteLevel;
	}
}