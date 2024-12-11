package asciiDemo;

//print frequency of aakanksha ak n s h 4 2 1 1 1
public class Assignment_32 {
	int count=0;
	void getFrequencyOfCharacter(String str) {
		for(int index=0;index<=str.length()-1;index++) {
			char ch = str.charAt(index);
			int indOf = str.indexOf(ch);
			if(!(index == indOf)) {
				count++;
				System.out.println(ch+"-"+count);
	}
		}
	}
	
	public static void main(String[] args) {
		Assignment_32 assignment = new Assignment_32();
		assignment.getFrequencyOfCharacter("aakanksha");
	}
	

}
