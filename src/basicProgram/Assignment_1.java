package basicProgram;

//Program to print student info
public class Assignment_1 {
	
	
	void displayInfo() {
		for(int i=0;i<5;i++) {
			if(i%3==1) {
				System.out.println(i*i);
			}
			}
		}
	
	public static void main(String[] args) {
		Assignment_1 assignment = new Assignment_1();
		assignment.displayInfo();
	}
}
