package anagram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Anagram {
   public static void main(String [] args) {
	
	String str = "bear"; 
    System.out.println("String is: " +str);
    System.out.println("Anagram of the given string is: ");
    int size = str.length(); 
    anagm(str, 0, size - 1); 
} 
private static void anagm(String str, int start, int end) 
{ 
    if (start == end) 
        System.out.println(str); 
    else { 
        for (int i = start; i <= end; i++) { 
            str = swap(str, start, i); 
            anagm(str, start + 1, end); 
            str = swap(str, start, i); 
        } 
    } 
} 
public static String swap(String a, int i, int j) 
{ 
    char temp; 
    char[] charArray = a.toCharArray(); 
    temp = charArray[i]; 
    charArray[i] = charArray[j]; 
    charArray[j] = temp; 
    return String.valueOf(charArray); 
} 
}
/*aabrt
 * a - 2 
 * b - 1
 * r - 1
 * t - 1
 * 
 * bar 
 * a - 1
 * b - 1
 * r - 1
 * print a word
 * */ 
 