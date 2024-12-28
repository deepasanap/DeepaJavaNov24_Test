package basicProgram;

public class LocalVariable {
	 static int num = 10;
	 int num1 = 20;
	
	void display(){
		num++;
		num1++;
		
	}
	void printInstance(){
		System.out.println(num);
		System.out.println(num1);
	}
	
	public static void main(String[] args) {
		LocalVariable l = new LocalVariable();
		l.display();
		l.printInstance();
		
		LocalVariable l_1 = new LocalVariable();
		l_1.display();
		l_1.printInstance();
	}

}
