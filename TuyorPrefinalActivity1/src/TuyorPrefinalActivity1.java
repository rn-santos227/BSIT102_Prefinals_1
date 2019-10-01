import java.util.Scanner;         //Scanner input
        
public class TuyorPrefinalActivity1 {
    
    public static void main(String[] args) {    //Main Method
		Scanner scanner = new Scanner(System.in);       
		int number =0;                 
		System.out.println("Type a number between 0 and 1000"); // Inputs a number
		number = scanner.nextInt();	          
												
		if(number >= 0 && number <= 1000){    // Between 0 to 1000 only
		
		if(number == 0){    //If Input is 0 
		System.out.println("Converted Number is = ZERO");
		}
		
	     if (number == 1000) {  //If Input is 1000 
			System.out.println("Converted Number is = ONE THOUSAND");
			} 
				else { //If Number is Hudreds like 100 to 999
					System.out.print("Converted Number is =");
					numberToWord(((number / 100) % 10), " HUNDRED");
                    numberToWord((number % 100), " ");
                  
				}
			}else {     //If Number reaches 1000+ 
				System.out.println("Number Out of Bounds");
			}
			   
 }
 public static void numberToWord(int num, String conv) {  //Convert input to Words with 2 arrays between ones and tens
            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", 
            	" EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", 
            	" SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"        // 1 to 19
            };
            String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
            if (num > 19) {  // if input num is higher than 19 that uses tens with ones depends on the input
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else { // ones only
                System.out.print(ones[num]);
            }
            if (num > 0) {  //convert input num to words
                System.out.print(conv);
    }
        }
}

