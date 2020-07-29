package assign;
import java.util.Arrays;
import java.util.Scanner;

class Function {  
  String AlphabetSoup(String str) { 
  
    char[] ch = new char[str.length()];

  // store every letter in character array

  for (int i = 0; i < str.length(); i++) {
   ch[i] = str.charAt(i);

  }
  
  Arrays.sort(ch);
  String str1 ="";
  for (int i = 0; i < str.length(); i++) {
   //System.out.print(ch[i]);
   str1= str1+ ch[i];

  }
   return str1;  
  } 
public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.AlphabetSoup(s.nextLine())); 
  }   
}