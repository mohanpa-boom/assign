package assign;

import java.util.Scanner;

public class FindLongest {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println(" enter a sentence");
      String sentence=sc.nextLine();
      sentence=sentence.trim();
      sentence=sentence+ " ";
      int length= sentence.length();// total length
      //System.out.println(" length is : "+ length);
      int longestlength=0;// length of longest
      String word=""; //to store the word temporarily

      String longestword="";// to store longest word
      for(int i=0;i<length;i++)
      {
        char c=sentence.charAt(i); 
        word = word.replaceAll("[^a-zA-Z0-9]", "");

        if (c!=' ')
          word=word+c;
        else
        {

          int lt=word.length();// stored total length
          if (lt>longestlength)
          {
            longestlength=lt;
            longestword=word;

          }
          word="";

        }
      }

      System.out.println("Longest word : "+longestword);
      //System.out.println("Longest length of word is "+longestlength);

    }

  }
