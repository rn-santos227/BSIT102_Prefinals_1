import java.util.Scanner;

public class NumWord1 {

    public static void main (String[] args){
    	int number = 0;
    	Scanner sc = new Scanner (System.in);
    	System.out.print("Please type any number from 0 to 1,000");
    	number = sc.nextInt();
    	System.out.println("The number is" );
    	numberToWord(((number / 100) % 10), " Hundred");
    	numberToWord((number % 100), " ");
    	numberToWord(((number / 1000) % 10), "Thousand");
    	
    public static void numberToWord(int num, String val) {
    	String ones[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
        String tens[] = {" ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighteen", " Ninety"};
        if (num > 19) {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {
                System.out.print(val);
    	
     }
    } 		
  }