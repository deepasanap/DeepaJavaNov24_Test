package basicProgram;

public class ForLoopExample {
	//print
	static void getCharacter(String str) {
		for(int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}
	
	static void getCharacterReverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}
	
	static void getCharacterSlit(String str) {
		String name[] = str.split(" ");
		String name1 = name[0];
		String name2 = name[1];
		System.out.println(name2 + " "+ name1);
	}
	
	public static void main(String[] args) {
		//getCharacter("Deepali Sanap");
		//getCharacterReverse("Mayauri Sanap");
		getCharacterSlit("Mayuri Sanap");
	}

}
