import java.io.*;

	public class Prefinal {
	 
	 
	public static void main(String args[]) throws IOException{
	 
	 
	    DataInputStream in = new DataInputStream (System.in);
	    //variables
	    int x,thou,hun,tens,ones,zero,elevens;
	 
	    System.out.println("Enter Number: "); //Statement that prints "Enter Number:"
	    x = Integer.parseInt (in.readLine()); // x variable will hold the value you've input
	 	
		//if the number you input is zero it will this play the converted word "Zero"
	    if (x==0)
	    {
	 
	    switch (x) //the x variable will turn to switch to choose from case/s
	    {	
	    	case 0: System.out.println("Zero");break; //print zero
	    }
	    
	    }
	 
	    if ((x>=100) && (x<=1000)){ //if the x variable is less greater than 100 but less than 1000, means it is the hundreds
	 
	    thou = x/1000;// value of x divided by 1000
	    x = x%1000; //then get the modulo of x by 1000
	    hun = x/100; // to get the hundred cases you need to divide x by 100
	    x = x%100;
	 
	    switch(thou){ //thousand numbers to switch which is 1000
	 
	    case 1:System.out.print("One Thousand ");break; //printing 1000 in words if you input 1000 
	   
	    }
	 
	 
	    switch (hun) { //switch the hun variable to access the cases for hundreds
	    case 1:System.out.print("One Hundred ");break;
	    case 2:System.out.print("Two Hundred ");break;
	    case 3:System.out.print("Three Hundred ");break;
	    case 4:System.out.print ("Four Hundred ");break;
	    case 5:System.out.print ("Five Hundred ");break;
	    case 6:System.out.print ("Six Hundred ");break;
	    case 7:System.out.print("Seven Hundred ");break;
	    case 8:System.out.print ("Eight Hundred ");break;
	    case 9:System.out.print ("Nine Hundred ");break;
	 
	 
	    }
	    }
	 
	 
	if ((x>10) && (x<20)){ // the x or the input number is greater than 10 but less than 0 
	 
	tens = x / 10; // to get the tens in the cases, divide x by 10
	ones = x; // one for the sigle digit you input
	elevens = x % 10; // for accessing switch of elevens get the modulo of x by 10
	 
	 
	switch (elevens){ //switch the variable of tens to access this case switch statements
		case 1:System.out.print("Eleven ");break;
	    case 2:System.out.print("Twelve ");break;
	    case 3:System.out.print("Thirteen ");break;
	    case 4:System.out.print ("Fourteen ");break;
	    case 5:System.out.print ("Fifteen ");break;
	    case 6:System.out.print ("Sixteen ");break;
	    case 7:System.out.print("Seventeen ");break;
	    case 8:System.out.print ("Eighteen ");break;
	    case 9:System.out.print ("Nineteen ");break;
	    }
	}
	else if (x>1000){//if the number you input is greater than 1000
	System.out.print("INVALID INPUT"); // it will print invalid
	}
	 
	else { // or else the x variable will proceed to else statement
	tens = x/10; // same function above (tens)
	x = x%10; //
	ones = x;//
	 
	switch (tens) {  //switch the variable of tens to access this case switch statements
	 
	case 1: System.out.print("Ten ");break;
	case 2:System.out.print("Twenty ");break;
	case 3:System.out.print("Thirty ");break;
	case 4:System.out.print("Fourty ");break;
	case 5:System.out.print("Fifty ");break;
	case 6:System.out.print("Sixty ");break;
	case 7:System.out.print("Seventy ");break;
	case 8:System.out.print("Eighty ");break;
	case 9: System.out.print("Ninety ");break;
	}
	switch (ones){ //switch the variable of ones,(single or one digit) to access this case switch statements
	 
	case 1: System.out.print("One ");break;	
	case 2:System.out.print("Two ");break;
	case 3:System.out.print("Three ");break;
	case 4:System.out.print("Four ");break;
	case 5:System.out.print("Five ");break;
	case 6:System.out.print("Six ");break;
	case 7:System.out.print("Seven ");break;
	case 8:System.out.print("Eight ");break;
	case 9:System.out.print("Nine ");break;
	 
	}
	 
	}
	 
	}  
	}