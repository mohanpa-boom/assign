package assign;

import java.util.Scanner;

public class LetterReplace{
public static String LetterChanges(String str) {
StringBuilder changeString = new StringBuilder();
for (char c : str.toCharArray()) {
if ( c >= 'a' && c <= 'z') {
char newChar = (char)((c - 'a' + 1) % ('z'-'a') + 'a');
if (newChar == 'a' || newChar == 'e' ||newChar == 'i' || newChar== 'o' || newChar== 'u') {
char t = Character.toUpperCase(newChar);
changeString.append(t);
}
else{
changeString.append(newChar);
}
} else {
changeString.append(c);
}
}

return changeString.toString();
}


public static void main (String[] args) {
// keep this function call here
Scanner s = new Scanner(System.in);
System.out.print(LetterChanges(s.nextLine()));
}

}