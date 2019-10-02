import java.util.Scanner; //package for scanner

public class Jusnmwrds {

   public static void main(String [] args){
           
           
            int number = 0; //assume to start the number in zero
            Scanner scanner = new Scanner(System.in);  
            System.out.print("Type a number between 0 to 1000 or type -1 to exit:  "); //this part is used for input of any numbers from 0-1000 and -1 used to exit the code
            number = scanner.nextInt();
            while(number!=-1){ //used to execute exit when you decide to end your convertion
                if(number>=0 && number<=1000){ //every number that you will display between 0-1000 will display the number and its convertion which is words
                    if(number==0){
                        System.out.print("Number converted to words:\tZERO"); //when you input the number 0, it will display the word zero
                    }
                     else {
                        System.out.print("Number converted to words:\t");
                        numberToWord(((number / 100) % 10), " Hundred");
                        numberToWord((number % 100), " ");
                    } //when you input any number greater than zero it will show what number what you type
                }
                 else{
                    System.out.print("Number is out of range"); //this will display when you input any number that is greater than 1000
                }
                System.out.print("\nType a number between 0 to 1000 or type -1 to exit:  "); 
                number = scanner.nextInt(); //this will show when you run your program
            }
        }

        public static void numberToWord(int num, String val) { //this part is the converted output of your number which is words, this part also the value of the nuumber that is coverted
        	//
            String ones[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"
            };
            String tens[] = {" ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
            if (num > 19) {
                System.out.print(tens[num / 10] + ones[num % 10]); //this will display place value tens and once
            } else {
                System.out.print(ones[num]); //this will diplay the place value ones only 
            }
            if (num > 0) {
                System.out.print(val); //when any number is display that is greater than 0, it will display its value
            }
        }
    }



