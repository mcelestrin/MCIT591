public class Person {
	String firstName;
	String lastName;
	
	String nationality;
	
	boolean sameInitials() {
		if ((firstName.charAt(0) == 'A') && (lastName.charAt(0) == 'B')) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isNorthAmerican() {
		if ((nationality.equals("American")) || (nationality.equals("Mexican")) || (nationality.equals("Canadian"))) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean doesNotBeginWithX() {
		if (!(firstName.charAt(0) == 'X')) {
			return true;
		}
		else {
			return false;
		}
	}
}