package a;

public class AsteriskLogger implements logger{
	//The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console.
	//The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”.
	
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		String logV = "***Error: "  + error + "***";
		for(int i = 0; i < logV.length(); i++) {
			System.out.print("*");
		}
		System.out.println("\n" + logV);
	
		for(int i = 0; i < logV.length(); i++) {
			System.out.print("*");
		}
	}
}
