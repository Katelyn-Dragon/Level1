public class Wolves {
	private String furColor;
	private int age;
	private boolean rabid;
	private static int populationCount = 0;
	
	public Wolves(String furColor, int age, boolean rabid) {
		this.furColor = furColor;
		this.age = age;
		this.rabid = rabid;
		
		populationCount++;
	}
	public static void main(String[] args) {
		Wolves one = new Wolves("Grey", 2, true);
		Wolves two = new Wolves("Black", 1, false);
		Wolves three = new Wolves("White", 3, false);
		Wolves four = new Wolves("Brown", 5, true);
		
		System.out.println(populationCount);
	}
	
	}