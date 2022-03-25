package b;

import a.logger;

public class SpacedLogger implements logger{
	//If the log method received “Hello” as an argument, it should print H e l l o
	//The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	@Override
	public void log(String log) {
		System.out.println("\n");
		for(int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}
	}

	@Override
	public void error(String error) {
		
		System.out.print("\nERROR: ");
		for(int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i) + " ");
		}
	}

}
