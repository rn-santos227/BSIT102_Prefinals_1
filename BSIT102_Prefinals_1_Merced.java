import java.util.Scanner;

public class BSIT102_Prefinals_1_Merced {

public static void main(String[] args) {
          // Use a while loop to accumulate the sums from 0 to 1000
            int number = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please type any number between 0 and 1000:  "); //to display the given numbers
            number = scanner.nextInt();
            while(number!=-1){
                if(number>=0 && number<=1000){ //A if-then-else decision
                    if(number==0){
                        System.out.print("Number after conversation:\tzero");
                    } else { //Odd numbers
                        System.out.print("Number after conversation:\t");
                        numberToWord(((number / 100) % 10), " Hundred");
                        numberToWord((number % 100), " ");
                    }

                } else{
                    System.out.print("Number out of range");
                }
                System.out.print("\nPlease type any number between 0 and 1000:  "); //to display the given numbers
                number = scanner.nextInt();
            }
        }

        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"
            }; //an array of strings consisting of the names of each ones
            String tens[] = {" ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"}; //an array of strings consisting of the names of each tens
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