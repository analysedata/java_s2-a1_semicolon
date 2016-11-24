
public class Semicolon {

	public static void main(String[] args) {
		/* see: http://docs.oracle.com/javase/6/docs/api/java/io/PrintStream.html
		 * The format method returns output stream and println() returns nothing
		 * Format string with specified characters
		*/
		if(System.out.format("%1s : %10s", "Firtsname", "Mark") == null) {}
	}

}
