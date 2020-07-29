package assign;

public class LetterCapitalize {
	public static String letterCapitalize(String str){
		String result = "";
		String[] toArray = str.split(" ");
		
		for(int i = 0; i < toArray.length; i++){
			char[] wordString = toArray[i].toCharArray();
			wordString[0] = Character.toUpperCase(wordString[0]);
			result += new String(wordString) + " ";
		}
		return result.trim();
	}
	public static void main(String[] args) {

		System.out.println(letterCapitalize("i am prabhu"));
	}
}