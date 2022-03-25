import java.util.Scanner;

import a.AsteriskLogger;
import b.SpacedLogger;

public class app {

	public static void main(String[] args) {
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		SpacedLogger  spacedLogger = new SpacedLogger();
		
		Scanner kb = new Scanner(System.in);
		
		String in = kb.next();
		
		
		asteriskLogger.log(in);
		asteriskLogger.error(in);
		spacedLogger.log(in);
		spacedLogger.error(in);
		
	}

}
