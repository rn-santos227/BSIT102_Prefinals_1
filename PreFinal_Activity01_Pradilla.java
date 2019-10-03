import java.util.*;
import java.util.Scanner;

public class PreFinal_Activity01_Pradilla {

    public static void main (String[]args)
    	{
    		//use scanner for obtaining input of int,string,etc.
    		Scanner scan = new Scanner(System.in);
    		System.out.println("Input a number:");
    		int inputNumber = scan.nextInt();
    		
    		//use this for Ones only
    		String []Ones = {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
    		"Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    		//use this for Tens only
    		String []Tens = {"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    		
    		//Determine the One's digit position
    		if (inputNumber <=19)
    			{
    				//Get the first number to determine the first value and then i used substring for this
    				int firstnumber = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
    				System.out.println( Ones[inputNumber]);
    		}
    		
    		//Determine the Ten's digit position
    		else if(inputNumber <=99)
    			{
    				//now since there are able to read the number between 0-99 I created second number to read the tens value
    				int firstnumber = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
    				int secondnumber = Integer.parseInt(Integer.toString(inputNumber).substring(1,2));
    				
    				System.out.println(Tens[firstnumber-1] + " " + Ones[secondnumber]);
    		}
    		
    		
    		//use this digit position only for hundreds or 3 digits number
    		else if(inputNumber <= 999)
    			{
    				//by adding the 3 integers there are able to read the value and I added the hundred term
    				int firstnumber = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
    				int secondnumber = Integer.parseInt(Integer.toString(inputNumber).substring(1,2));
    				int thirdnumber = Integer.parseInt(Integer.toString(inputNumber).substring(2,3));
    				
    				System.out.println(Ones[firstnumber] + " Hundred " + Tens[secondnumber-1] + " " + Ones[thirdnumber]);
    		}
    		
    		//use this digits position for thousand or 4 digits number
    		else if (inputNumber <=1000)
    			{
    				//this time I only add the ones string because the number is only for 1000 and I added the thousand term
    				int firstnumber = Integer.parseInt(Integer.toString(inputNumber).substring(0,1));
    				int secondnumber = Integer.parseInt(Integer.toString(inputNumber).substring(1,2));
    				int thirdnumber = Integer.parseInt(Integer.toString(inputNumber).substring(2,3));
    				
    				System.out.println(Ones[firstnumber] + " Thousand ");
    		} 
    }
    
    
}
