
public class Calculators {
	
	int answer;
	String greeting;
	

	
	
	public Calculators(int answer, String greeting) {
		this.answer = answer;
		this.greeting = greeting;
	}
	
	public int add(int x, int y) {
		answer =  x + y;
		return answer;
	}
	public int subtract(int x, int y) {
		answer = x - y;
		return answer;
	}
	public int multiply(int x, int y) {
		answer = x * y;
		return answer;
	}
	public int divide(int x, int y) {
		answer = x/y;
		return answer;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
