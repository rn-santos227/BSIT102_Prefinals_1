/**
 * @(#)PrefinalActivity1.java
 *
 *
 * @author 
 * @version 1.00 2019/10/1
 */

import java.util.Scanner;

public class PrefinalActivity1 {

    public static void main (String[] args) {
            int number = 0;
            Scanner scanner = new Scanner(System.in);
            //this where the user put a random number to convert it to words
            //if the user put -1 the program will exit
            System.out.print("Please type a number between 0 and 1000 OR type -1 to exit:  ");
            number = scanner.nextInt();
            while(number!=-1){
            	//this is where it choose if the number is belong the loop.
                if(number>0 && number<=1000){
                    if(number==0){
                        System.out.print("NUMBER AFTER CONVERSION:\tZERO");
                    } else {
                        System.out.print("NUMBER AFTER CONVERSION:\t");
                        numberToWord(((number / 100) % 10), " HUNDRED");
                        numberToWord((number % 100), " ");
                        numberToWord(((number / 1000) % 10), " THOUSAND");
                    }

                } else{ //if the number is under0
                    System.out.print("NUMBER OUT OF RANGE");
                }
                System.out.print("\nPlease type a number between 0 and 1000 OR type -1 to exit:  ");
                number = scanner.nextInt();
            }
        }
		//this is the function where the numbers convert to words
        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
            };
            String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
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