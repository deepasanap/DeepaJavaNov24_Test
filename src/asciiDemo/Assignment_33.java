package asciiDemo;

//Write a method which returns ascii value of given character.  
public class Assignment_33 {

	void getAsciiValue(char ch) {
		int asciiValue = ch;
		System.out.println(asciiValue);
		System.out.println("222222222");
		System.out.println("BBBBBB");
	}

	public static void main(String[] args) {
		Assignment_33 assignment = new Assignment_33();
		assignment.getAsciiValue('A');
		assignment.getAsciiValue('x');
		assignment.getAsciiValue(' ');
		assignment.getAsciiValue('-');
	}
}
