/**
 * @(#)Prefinal.java
 *
 * Prefinal application
 *
 * @author 
 * @version 1.00 2019/10/15
 */
import java.util.Scanner; 
public class Prefinal {
    
    public static void main(String[] args) {
    int number = 0;
   
    Scanner sc = new Scanner (System.in);
    System.out.println("Please type a number 0-1000"); // statement that will print below or the instruction
    try{
   
    number = sc.nextInt(); //read the number
    if (number == 0) { // if its one zero it will print zero
        System.out.print("Number in words: Zero");
       } else if(number > 1000){ // limiting the input to 1000 only
        System.out.print("Please enter a number less than or equal 1000"); // if its exceed it will print "Please enter a number less than or equal 1000"
       }else{
        System.out.print("Number in words: " + numberToWord(number));
        }
   } catch (Exception e) {
          System.out.println("Please enter a valid number");
   }

     sc.close(); //close the reader
   }
 
   private static String numberToWord(int number) {
       
        String words = "";  // variable to hold string representation of number
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                      "eighteen", "nineteen" };
                     
    String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
 
   if (number == 0) { // 0 means Zero only
   return "zero";
}

       
if ((number / 1000) > 0) { // check if number is divisible by 1 thousand
   words += numberToWord(number / 1000) + " thousand ";
   number %= 1000;
}

if ((number / 100) > 0) { // check if number is divisible by 1 hundred
    words += numberToWord(number / 100) + " hundred ";
    number %= 100;
}
 
if (number > 0) {
   
    if (number < 20) { // check if number is divisible by teens
                 
                words += unitsArray[number]; // fetch the appropriate value from unit array
             } else {
                 
                words += tensArray[number / 10]; // fetch the appropriate value from tens array
                if ((number % 10) > 0) {
   words += "-" + unitsArray[number % 10];
                }  
    }
          }
 
 return words;
   }
}
	
    