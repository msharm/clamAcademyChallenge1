/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claimfirstprogrammingchallenge;

/**
 *
 * @author meghasharma
 */
import java.util.Scanner;
import java.lang.Object;
import java.util.Arrays;
import java.util.ArrayList;
import org.apache.commons.lang3.text.WordUtils;

public class ClaimFirstProgrammingChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scanner object for ints
        Scanner sc = new Scanner(System.in);
        
        
        //finding the largest
        int[] myArr = new int [] {10, 15, 28, 33, 55, 64, 100, 98};
        
        int largest = 0;
        
        for (int i = 0; i < myArr.length; i++)
        {
            if (largest < myArr[i])
                largest = myArr[i];
        }
        
        System.out.println("And the largest value is....." + largest + "!");
        
        //sorting the array
        Arrays.sort(myArr);
        
        System.out.println("The oldest: " + myArr[myArr.length - 1] + "!");
        System.out.println("The youngest: " + myArr[0] + "!");
        
        //Palindrome
        System.out.println("User! Could you please enter the word you would like to check for being a palindrome?");
        String str = sc.next();
        
        boolean palindrome = true;
        int k = str.length()- 1;
        for (int i = 0; i < ((str.length() - 1) / 2 ); i++){
            if ((str.charAt(i) == str.charAt(k))) {
            } else {
                palindrome = false;
            }
            k--;
        }
        
        
        String result = palindrome ? ("It is a palindrome!" + " Yes thats right")  : "It is not a palindrome :("; 
        
        System.out.println(result);
        
        
        
        //Capitalize the first letter in a sentence
        Scanner stringscan = new Scanner(System.in);
        
        System.out.println("User! Enter the sentence you would like to have the first letter capitalized for each word?");
        str = stringscan.nextLine();
        
        String capitalized = WordUtils.capitalize(str);
        
        System.out.println(capitalized);
        
        
    }
    
    public static ArrayList groupage (int[] age){
       
    }
    
}
