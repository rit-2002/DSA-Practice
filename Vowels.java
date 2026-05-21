// Java program to check whether input
// character is a vowel or consonant
// using if else statement
import java.io.*;

public class Vowels {
    public static void main(String args[]) {
        char ch = 'b';
        
        // check using if else
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u') {
            System.out.println(ch+" is a vowel");
        }else {
            System.out.println(ch+" is a consonant");
      }
    }
}
