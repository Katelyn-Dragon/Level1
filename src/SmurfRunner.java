
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf HandySmurf = new Smurf("Handy");
		HandySmurf.getName();
		HandySmurf.eat();
		
		Smurf PapaSmurf = new Smurf("Papa Smurf");
		PapaSmurf.getName();
		PapaSmurf.getHatColor();
		PapaSmurf.isGirlOrBoy();
		
		Smurf Smurfette = new Smurf("Smurfette");
		Smurfette.getName();
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
	}
}
